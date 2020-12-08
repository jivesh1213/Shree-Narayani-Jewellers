<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="vieport" content="width=device-width, initial-scale=1"/>
        <title>${pageName} - Shree Narayani Jewellers</title>
    </head>
<body>
    <div>
        <img src="images/Flexes/${pageName}.png" style="width: 100%; height: 450px">
    </div>
    
    <br>
    
    <div class="container">
        <div class="row" style=" margin-right: 0px; ">
            <c:if test="${prod.size() > 0}">
        <c:forEach var="i" begin="0" end="${prod.size() - 1}">
                <div class="col-md-6 col-lg-3">
                    <div class="card  placing">
                        <img src="images/${prod.get(i).getImage()}" class="card-img-top" alt="..." style="max-height: 186.24px; margin: auto; width: auto !important; max-width: 280px; min-height: 186.24px"/>
                            <div class="card-body">
                              <h5 class="card-title">${prod.get(i).getItemname()}</h5>
                              <p class="card-text">Weight : ${prod.get(i).getWeight()}</p>
                              <a href="#" class="btn btn-dark logInSwitch" data-toggle="modal" data-target="#product${i}" >See&nbsp;More</a>
                            </div>
                          </div> 
                </div>
                <div class="modal fade" id="product${i}" tabindex="-1" role="dialog" aria-labelledby="ProductModalTitle" aria-hidden="true">
                    <div class="modal-dialog modal-lg modal-dialog-centered" role="document" >
                        <div class="modal-content" style="border-radius: 10px; box-shadow: 2px 2px 10px 0px rgba(0,0,0,0.52);">
                            <div class="modal-body">
                                <div class="container" style="max-width: 100%">
                                    <h2>${prod.get(i).getItemname()}</h2>
                                    <div class="row" style="width: 100%; ">
                                        <div class="col-lg-5 col-sm-12">
                                            <br>
                                            <img src="images/${prod.get(i).getImage()}" class="modalImage" >
                                            <br><br>
                                        </div>
                                        <div class="col-lg-7 col-sm-12" style="text-align: left; ">
                                            
                                            <ul class="list-group">
                                                <li class="list-group-item">Category: <b>${prod.get(i).getCategory()}</b></li>
                                                <li class="list-group-item">Weight (approx.): <b>${prod.get(i).getWeight()}</b></li>
                                                <li class="list-group-item">Polish: <b>${prod.get(i).getPolish()}</b></li>
                                                <li class="list-group-item">Purity: <b>${prod.get(i).getPurity()}</b></li>
                                                <li class="list-group-item">Description: <b>${prod.get(i).getDescription()}</b></li>
                                            </ul>
                                            <br>
                                            <h4>Enquire Now!</h4>
                                        <form action="enqMsg" method="post">
                                            <input type="hidden" name="page" value="products.jsp"/>
                                            <input type="hidden" name="itemname" value="${prod.get(i).getItemname()}"/>
                                            <input type="hidden" name="category" value="${prod.get(i).getCategory()}"/>
                                            <input type="hidden" name="weight" value="${prod.get(i).getWeight()}"/>
                                            <input name="email" class="form-control customInput" <c:if test="${email ne null}">value="${email}"</c:if> <c:if test="${email eq null}">placeholder="Email Address"</c:if> required>
                                            <textarea name="msg" rows="5" class="form-control customInput" placeholder="Description" required></textarea><br>
                                            <input type="submit" class="btn btn-dark logInSwitch" value="Send&nbsp;Enquiry" />
                                        </form>
                                        </div>
                                    </div>
                                 </div>
                            </div>
                        </div>
                    </div>
                </div>
                
        </c:forEach>
        </c:if>
        </div>
    </div>
        
</body>
</html> 

<jsp:include page="footer.jsp"/>