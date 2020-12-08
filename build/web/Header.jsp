<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="vieport" content="width=device-width, initial-scale=1"/>
        
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <link rel="stylesheet" href="css/my-slider.css"/>
        <link rel="stylesheet" href="css/main.css"/>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
<link rel="shortcut icon" href="images/Icons/title.ico"/>

        </head>
        
<body>

<script type="text/javascript">
	function scTo() {
		console.log(event.target.attributes.url.value);
		document.querySelector(event.target.attributes.url.value).scrollIntoView({
		  behavior: 'smooth'
		});
		event.stopPropagation();
		return false;
	}
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(window).scroll(function() {
    var height = $(window).scrollTop();
    if (height > 100) {
        $('#back2Top').fadeIn();
    } else {
        $('#back2Top').fadeOut();
    }
});
$(document).ready(function() {
    $("#back2Top").click(function(event) {
        event.preventDefault();
        $("html, body").animate({ scrollTop: 0 }, "slow");
        return false;
    });

});
</script>

    <section id="menubar" style="background-color: black">    
        <nav class="navbar navbar-expand-lg navbar-dark container ">

            <a class="problem1" href="http://shreenarayanijew.com/Home.jsp"><img src="images/Nav-Logo4.png"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#MyNav" aria-controls="MyNav" aria-expanded="false">
                <span class="navbar-toggler-icon"></span>
            </button>    
            
            <div class="collapse navbar-collapse" id="MyNav" style="background-color: black;">
                <ul class="navbar-nav mr-auto navigation-bar">
                    <li class="nav-item active">
                        <a class="nav-link" href="http://shreenarayanijew.com/Home.jsp">Home</a>
                    </li>
                    <li class="nav-item active">
                        
                        <div class="dropdown">
                           <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Products</a>
                           <div class="dropdown-menu" aria-labelledby="dropdownMenuLink" style="background-color: black;">
                               <form method="post" action="allProducts" style="margin-bottom: 0px">
                               <input type="submit" class="dropdown-item nav-link" name="btn" value="All Products"/>
                               <input type="submit" class="dropdown-item nav-link" name="btn" value="Pooja Item"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Home Decor"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Household"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Luxury"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Kids"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Gifts"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Jugset"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Photo Frame"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Box"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Aarta Thali"/>
                                <input type="submit" class="dropdown-item nav-link" name="btn" value="Coins"/>
                                </form>
                            </div>
                        </div>
                        
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="http://shreenarayanijew.com/aboutUs.jsp">About</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="http://shreenarayanijew.com/Contact%20us.jsp">Contact</a>
                    </li>
                    <c:if test="${username eq null}"><li class="nav-item active" >
                         <a href="#" class="btn btn-outline-danger logInSwitch" data-toggle="modal" data-target="#loginModal" >Log&nbsp;In</a>
                    </li></c:if>
                    
                    <c:if test="${username ne null}">
                    <li class="nav-item active">
                        <div class="dropdown">
                           <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${username}</a>
                           <div class="dropdown-menu" aria-labelledby="dropdownMenuLink" style="background-color: black; ">
                               <c:if test="${\"narayanijew@gmail.com\".equals(email)}"><form action="allProducts" method="post" style="margin: 0px"><button type="submit" style=" border: 0px;outline: none" class="dropdown-item nav-link" name="btn" value="Admin">&nbsp;&nbsp;&nbsp;Admin</button></form>
                                   <form action="allEnquiry" method="post" style="margin: 0px"><button type="submit" style=" border: 0px;outline: none" class="dropdown-item nav-link" name="btn" value="Admin">&nbsp;&nbsp;&nbsp;Enquiries</button></form>
                                   </c:if>
                                   <form method="post" action="logOut" style="margin-bottom: 0px"><input type="submit" class="dropdown-item nav-link" value="&nbsp;&nbsp;&nbsp;Logout"> </form>
                            </div>
                        </div>
                    </li>
                    </c:if>
                    
                </ul>
            </div>
        </nav>
        
    </section>
    
        
    <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalTitle" aria-hidden="false">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">    
                    <span class="form-group">
                        <form method="post" action="login">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span>&times;</span></button>
                            <input name="email" class="form-control customInput" <c:if test="${(\"\").equals(login_email)}">id="filter"</c:if>" placeholder="Email Address" <c:if test="${!(\"\").equals(login_email)}">value="${login_email}"</c:if>>
                            <input name="password" class="form-control customInput" type="password" <c:if test="${(\"\").equals(login_pass)}">id="filter"</c:if>" placeholder="Password" <c:if test="${!(\"\").equals(login_pass)}">value="${login_pass}"</c:if>>
                            <c:if test="${login_msg != null}"><div class="message ">${login_msg}</div></c:if>
                            <input type="submit" class="btn btn-danger btn-md btn-block" id="logInButton" value="Log&nbsp;In"/>
                        </form>
                            <!--<a href="#" data-dismiss="modal" aria-label="Close" data-toggle="modal" data-target="#forgotModal"><b>Forgot Password?</b></a><br>-->
                            Or<br>
                            <button name="" class="btn  btn-md btn-block" id="signUpButton" data-dismiss="modal" aria-label="Close" data-toggle="modal" data-target="#signinModal">Register</button>
                        </span>
                </div>
            </div>
        </div>
    </div>
                    
        
    <div class="modal fade" id="signinModal" tabindex="-1" role="dialog" aria-labelledby="signinModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">
                <span class="form-group">
                    <form action="registration" method="post">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span>&times;</span></button>
                    <input name="name" class="form-control customInput" <c:if test="${(\"\").equals(reg_name)}">id="filter"</c:if> placeholder="Name" <c:if test="${!(\"\").equals(reg_name)}">value="${reg_name}"</c:if>>
                    <input name="city" class="form-control customInput" <c:if test="${(\"\").equals(reg_city)}">id="filter"</c:if> placeholder="State/City" style="width:49%; display: inline" <c:if test="${!(\"\").equals(reg_city)}">value="${reg_city}"</c:if>>
                    <input name="area" class="form-control customInput" <c:if test="${(\"\").equals(reg_area)}">id="filter"</c:if> placeholder="Area/Locality" style="width:49%; display: inline" <c:if test="${!(\"\").equals(reg_area)}">value="${reg_area}"</c:if>>
                    <input name="pincode" class="form-control customInput" <c:if test="${(\"\").equals(reg_code)}">id="filter"</c:if> placeholder="Pincode" style="width:49%; display: inline" <c:if test="${!(\"\").equals(reg_code)}">value="${reg_code}"</c:if>>
                    <input name="phone" class="form-control customInput" <c:if test="${(\"\").equals(reg_phone)}">id="filter"</c:if> placeholder="Contact No." style="width:49%; display: inline" <c:if test="${!(\"\").equals(reg_phone)}">value="${reg_phone}"</c:if>>
                    <c:if test="${code_msg != null}"><div class="message ">${code_msg}</div></c:if>
                    <c:if test="${phn_msg != null}"><div class="message">${phn_msg}</div></c:if>
                    <input name="email" class="form-control customInput" <c:if test="${(\"\").equals(reg_email)}">id="filter"</c:if> placeholder="Email Address" <c:if test="${!(\"\").equals(reg_email)}">value="${reg_email}"</c:if>>
                    <c:if test="${exist_msg != null}"><div class="message">${exist_msg}</div></c:if>
                    <c:if test="${email_msg != null}"><div class="message">${email_msg}</div></c:if>
                    <input name="pass" class="form-control customInput" type="password" <c:if test="${(\"\").equals(reg_pass)}">id="filter"</c:if> placeholder="Password">
                    <c:if test="${size_msg != null}"><div class="message">${size_msg}</div></c:if>
                    <input name="c_pass" class="form-control customInput" type="password" <c:if test="${(\"\").equals(reg_cpass)}">id="filter"</c:if> placeholder="Confirm Password">
                    <c:if test="${pass_msg != null}"><div class="message">${pass_msg}</div></c:if>
                    <c:if test="${empty_msg != null}"><div class="message">${empty_msg}</div></c:if>
                    <input type="submit" class="btn btn-danger btn-md btn-block" id="logInButton" value="Create&nbsp;Account"/>
                    </form>
                    <b>Already have an account?</b>
                    <br>
                    <button name="" class="btn btn-md btn-block" id="signUpButton" data-dismiss="modal" aria-label="Close" data-toggle="modal" data-target="#loginModal">Log&nbsp;In</button>
                </span>
                </div>
            </div>
        </div>
    </div>
                        
        
    <div class="modal fade" id="otpModal" tabindex="-1" role="dialog" aria-labelledby="otpModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <span class="form-group">
                        <h4 id="replace">Hi, ${name}!</h4>
                        <form method="get" action="checkOtp">
                        <c:if test="${otp_msg != null}"><div class="message">${otp_msg}</div></c:if>
                        <input name="otp" class="form-control customInput" placeholder="Enter OTP">
                        <br>     
                        <div>&nbsp;&nbsp;&nbsp;Check your Email for the OTP.</div>     
                        <input type="submit" class="btn btn-md otpButton" style="background-color: #ffb833" value="Verify"/>
                        </form>
                        <form method="get" action="emailSending">
                            <input type="submit" class="btn btn-danger btn-md otpButton" value="Resend"/>
                        </form>
                    </span>
                </div>
            </div>
        </div>
   </div>
        
<!--   <div class="modal fade" id="forgotModal" tabindex="-1" role="dialog" aria-labelledby="forgotModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <span class="form-group">
                        <form method="post" action="forgot">
                        <input name="email" class="form-control customInput" placeholder="Enter Email Address">
                        <c:if test="${forgot_msg != null}"><div class="message">${forgot_msg}</div></c:if>
                        <br>
                        <div>&nbsp;&nbsp;&nbsp;Check your Email for the OTP.</div>
                        <input type="submit" class="btn btn-md" style="background-color: #ffb833; " value="Send"/>
                        </form>
                   </span>
                </div>
            </div>
        </div>
   </div>-->
    
    <div class="modal fade" id="otp2Modal" tabindex="-1" role="dialog" aria-labelledby="otpModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <span class="form-group">
                        <h4 id="replace">Email - ${email}</h4>
                        <form method="get" action="checkforgotOtp">
                        <input name="forgot_otp" class="form-control customInput" placeholder="Enter OTP">
                        <c:if test="${otp_msg != null}"><div class="message">${otp_msg}</div></c:if>
                        <br>     
                        <div>&nbsp;&nbsp;&nbsp;Check your Email for the OTP.</div>     
                        <input type="submit" class="btn btn-md otpButton" style="background-color: #ffb833" value="Verify"/>
                        </form>
                        <form method="get" action="sendforgotOtp">
                            <input type="submit" class="btn btn-danger btn-md otpButton" value="Resend"/>
                        </form>
                    </span>
                </div>
            </div>
        </div>
   </div>
   
    <div class="modal fade" id="newpassModal" tabindex="-1" role="dialog" aria-labelledby="forgotModalTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-body">
                    <span class="form-group">
                        <form method="post" action="newpass">
                            <input name="new_pass" type="password" class="form-control customInput" placeholder="Enter New Password">
                        <c:if test="${newpass_msg != null}"><div class="message">${newpass_msg}</div></c:if>
                        <input name="newc_pass" type="password" class="form-control customInput" placeholder="Confirm Password">
                        <c:if test="${cpass_msg != null}"><div class="message">${cpass_msg}</div></c:if>
                        <input type="submit" class="btn btn-md" style="background-color: #ffb833; " value="Update"/>
                        </form>
                   </span>
                </div>
            </div>
        </div>
   </div>
                        
    <a id="back2Top" title="Back to top" href="#"><svg class="bi bi-arrow-up-circle-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-10.646.354a.5.5 0 1 1-.708-.708l3-3a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1-.708.708L8.5 6.207V11a.5.5 0 0 1-1 0V6.207L5.354 8.354z"/>
</svg></a>
    
    <c:if test="${login_status !=null}"><script>
	$(document).ready(function(){
            $("#loginModal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${reg_status !=null}"><script>
	$(document).ready(function(){
            $("#signinModal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${otp_status !=null}"><script>
	$(document).ready(function(){
            $("#otpModal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${forgot_status !=null}"><script>
	$(document).ready(function(){
            $("#forgotModal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${otp2_status !=null}"><script>
	$(document).ready(function(){
            $("#otp2Modal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${newpass_status !=null}"><script>
	$(document).ready(function(){
            $("#newpassModal").modal('show');
	});
    </script>
    </c:if>
    <c:if test="${updated_status !=null}"><script>
	$(document).ready(function(){
            alert("Password Updated");
	});
    </script>
    </c:if>
    <c:if test="${enquiry_status !=null}"><script>
	$(document).ready(function(){
            alert("Your Enquiry has been placed.");
	});
    </script>
    </c:if>
    
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="js/main_1.js"></script>
    <script src="js/ism-2.2.min.js"></script>
    
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    
    
        
</body>
</html> 