<%-- 
    Document   : Enquiry
    Created on : 30 Jun, 2020, 11:39:44 PM
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Enquiries - Shree Narayani Jewellers</title>
    </head>
    <body>
        <br>
        <div class="container" style="max-width: 70%">
            
        <c:if test="${enq.size() > 0}">    
            <c:forEach var="i" begin="0" end="${enq.size() - 1}">
            <div class="row" style="background-color: #DDD;;box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.52);">
                    <div class="col-1" style="margin: 1%">
                    <svg width="6.5em" height="6.5em" viewBox="0 0 16 16" class="bi bi-person-circle" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path d="M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z"/>
                    <path fill-rule="evenodd" d="M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
                    <path fill-rule="evenodd" d="M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z"/>
                    </svg>
                    </div> 
                    <div class="col-9" style="margin: 1%;margin-left: 4%">
                        <h5 style="margin-bottom: -0.2%;">${enq.get(i).getName()}</h5>
                        <spam><span style="font-weight: 700">From: </span>${enq.get(i).getEmail()} <span style="font-weight: 700">&emsp;&emsp;&emsp; | &emsp;Date : </span>${enq.get(i).getDate()}<span style="font-weight: 700">&emsp;&emsp;&emsp; | &emsp;Time : </span>${enq.get(i).getTime()}</spam><br>
                        <c:if test="${enq.get(i).getItemname() != null}"><spam><span style="font-weight: 700">Item Name: </span>${enq.get(i).getItemname()} <span style="font-weight: 700">&emsp;&emsp;&emsp; | &emsp;Category : </span>${enq.get(i).getCategory()}<span style="font-weight: 700">&emsp;&emsp;&emsp; | &emsp;Weight : </span>${enq.get(i).getWeight()}</spam><br></c:if>
                        <p><span style="font-weight: 700">Enquiry: </span>${enq.get(i).getDescription()}</p>
                    </div>
                    <div class="col-1">
                        <button style="border: 0px; margin: 30%; margin-left: 50%; background-color: #ddd;" data-toggle="modal" data-target="#ConfirmModal${i}">
                            <svg width="2em" height="2em" viewBox="0 0 16 16" class="bi bi-trash-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg" ">
                                <path fill-rule="evenodd" d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5a.5.5 0 0 0-1 0v7a.5.5 0 0 0 1 0v-7z"/>
                            </svg>
                        </button>
                    </div>
                    <br>
                    <div class="modal fade" id="ConfirmModal${i}" tabindex="-1" role="dialog" aria-labelledby="ConfirmModalTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                        <div class="modal-content">
                            <div class="modal-body">
                                <form action="deleteEnq" method="post">
                                <span class="form-group">
                                    <h4 >Hi, ${username}!</h4>
                                    <h6>&nbsp;&nbsp;&nbsp;&nbsp;Are you sure you want to delete this product?</h6>
                                        <input type="hidden" name="index" value="${enq.get(i).getIndex()}"/>
                                        <input type="submit" class="btn btn-dark otpButton" value="Confirm"/>
                                    <button name="" class="btn btn-danger btn-md otpButton" data-dismiss="modal" aria-label="Close">Cancel</button>
                                </span>
                                </form>
                            </div>
                        </div>
                    </div>
                    </div>
                </div>    
            </c:forEach>
        </c:if>
            
        </div>
        <br><br><br><br><br><br>    
    </body>
</html>
<jsp:include page="footer.jsp"/>