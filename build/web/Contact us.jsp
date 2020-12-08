<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="vieport" content="width=device-width, initial-scale=1"/>
        <title>Contact Us - Shree Narayani Jewellers</title>
    </head>
<body>
    
    <br>  
        <div class="container" style="max-width: 70%">
        <div class="row">
            <div class="col-lg-6 col-md-12" style="margin-top: 5%; line-height: 30px; font-weight: 600;">
                 
                <h3>Contact Us:</h3>
                <svg class="bi bi-house-fill" width="1.5em" height="1.5em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M8 3.293l6 6V13.5a1.5 1.5 0 0 1-1.5 1.5h-9A1.5 1.5 0 0 1 2 13.5V9.293l6-6zm5-.793V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z"/>
                    <path fill-rule="evenodd" d="M7.293 1.5a1 1 0 0 1 1.414 0l6.647 6.646a.5.5 0 0 1-.708.708L8 2.207 1.354 8.854a.5.5 0 1 1-.708-.708L7.293 1.5z"/>
                </svg>
                : 107-1166, Kucha Mahajani, Chandni Chowk, Delhi-110006
                <br>
                <svg class="bi bi-envelope-fill" width="1.5em" height="1.5em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M.05 3.555A2 2 0 0 1 2 2h12a2 2 0 0 1 1.95 1.555L8 8.414.05 3.555zM0 4.697v7.104l5.803-3.558L0 4.697zM6.761 8.83l-6.57 4.027A2 2 0 0 0 2 14h12a2 2 0 0 0 1.808-1.144l-6.57-4.027L8 9.586l-1.239-.757zm3.436-.586L16 11.801V4.697l-5.803 3.546z"/>
                </svg>    
                : info@shreenarayanijew.com    
                <br>
                <svg class="bi bi-phone" width="1.5em" height="1.5em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M11 1H5a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM5 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H5z"/>
                    <path fill-rule="evenodd" d="M8 14a1 1 0 1 0 0-2 1 1 0 0 0 0 2z"/>
                </svg>
                : +91-9312601741, 9818916742, 8860262989, 011-41811320    
                <br><br>
                        <div style="text-align: left; margin-left: 8%"><img src="image/slides/_u/1st.png" style="max-height: 200px; "></div>
            </div>
            <div class="col-lg-6 col-md-12" style="margin-top: 5%; margin-bottom: 5%">
                <h3>Enquire Now!</h3>
                <form action="enqMsg" method="post">
                    <input type="hidden" name="page" value="Contact us.jsp"/>
                    <input name="email" class="form-control customInput" <c:if test="${email ne null}">value="${email}"</c:if> <c:if test="${email eq null}">placeholder="Email Address"</c:if> required>
                        <textarea name="msg" rows="5" class="form-control customInput" placeholder="Description" required></textarea><br>
                    <input type="submit" class="btn btn-dark logInSwitch" value="Send&nbsp;Enquiry" />
                </form>
            </div>

        </div>
    </div>
        
</body>
</html> 

<jsp:include page="footer.jsp"/>