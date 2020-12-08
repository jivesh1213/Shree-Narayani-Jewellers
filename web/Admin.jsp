<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="vieport" content="width=device-width, initial-scale=1"/>
        <title>Admin Page - Shree Narayani Jewellers</title>
    </head>
    <style type="text/css">
        option{
            font-weight: 700;
        }
    </style>
<body>
    <br>  
    
    <div class="container" >
        <div class="row" style=" margin-right: 0px; ">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card  placing">
                 <img src="images/Plus.png" class="card-img-top" alt="..." style="max-height: 186.24px; margin: auto; max-width: 280px"/>
                        <div class="card-body">
                          <h5 class="card-title">Add Product</h5>
                          <p class="card-text">Click to add Product</p>
                          <a href="#" class="btn btn-dark logInSwitch" data-toggle="modal" data-target="#AddModal" >Add</a>
                        </div>
                      </div> 
            </div>
            <div class="modal fade" id="AddModal" tabindex="-1" role="dialog" aria-labelledby="AddModalTitle" aria-hidden="true">
                    <div class="modal-dialog modal-lg modal-dialog-centered" role="document" >
                        <div class="modal-content" style="border-radius: 10px; box-shadow: 2px 2px 10px 0px rgba(0,0,0,0.52);">
                            <div class="modal-body">
                                <div class="container" style="max-width: 100%">
                                    <h2>Add Product</h2>
                                    <form action="addProduct" method="post" enctype="multipart/form-data">
                                    <div class="row" style="width: 100%; ">
                                        <div class="col-lg-5 col-sm-12">
                                            <br>
                                            <img src="images/Plus.png" class="modalImage" >
                                            <br><br>
                                            <input class="btn" type="file" id="img" name="img" accept="image/* " size="50">
                                            <br><br>
                                        </div>
                                        <div class="col-lg-7 col-sm-12" style="text-align: left; ">
                                            <label for="itemName" style="margin-bottom: 0px;">Item Name:</label>
                                            <input name="item_name" class="form-control customInput" id="itemName" style="margin-top: 0px;" placeholder="Enter Item Name"><br>
                                            <label for="details1" style="margin-bottom: 0px;">Category:</label>
                                            <select name="category" class="form-control customInput" id="details1" style="margin-top: 0px;">
                                                <option value="Pooja Item" selected> Pooja Item </option>
                                                <option value="Aarta Thali"> Aarta Thali </option>
                                                <option value="Box"> Box </option>
                                                <option value="Gifts"> Gifts </option>
                                                <option value="Home Decor"> Home Decor </option>
                                                <option value="Household"> Household </option>
                                                <option value="Jugset"> Jugset </option>
                                                <option value="Kids"> Kids </option>
                                                <option value="Luxury"> Luxury </option>
                                                <option value="Photo Frame"> Photo Frame </option>
                                                <option value="Coins"> Coins </option>
                                            </select><br>
                                            <label for="details2" style="margin-bottom: 0px;">Weight(approx.):</label>
                                            <input name="weight" class="form-control customInput" id="details2" style="margin-top: 0px;" placeholder="Enter Weight"><br>
                                            <label for="details3" style="margin-bottom: 0px;">Polish:</label>
                                            <input name="polish" class="form-control customInput" id="details3" style="margin-top: 0px;" placeholder="Specify Polish"><br>
                                            <label for="details4" style="margin-bottom: 0px;">Purity:</label>
                                            <input name="purity" class="form-control customInput" id="details4" style="margin-top: 0px;" placeholder="Amount of Purity"><br>
                                            <label for="details" style="margin-bottom: 0px;">Description:</label>
                                            <input name="description" class="form-control customInput" id="details5" style="margin-top: 0px;" placeholder="Some Description"><br>
                                            
                                            <input type="submit" class="btn btn-dark logInSwitch" value="Add"/>
                                            <br>
                                        </div>
                                    </div>
                                    </form>
                                 </div>
                            </div>
                        </div>
                    </div>
                </div>
            <c:if test="${prod.size() > 0}"><c:forEach var="i" begin="0" end="${prod.size() - 1}">
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="card  placing">
                        <img src="images/${prod.get(i).getImage()}" class="card-img-top" alt="..." style="max-height: 186.24px; margin: auto; width: auto !important; max-width: 280px;min-height: 186.24px"/>
                            <div class="card-body">
                              <h5 class="card-title">${prod.get(i).getItemname()}</h5>
                              <p class="card-text">${prod.get(i).getCategory()}</p>
                              <a href="#" class="btn btn-dark logInSwitch" data-toggle="modal" data-target="#Modify${i}" >Modify</a>
                              <a href="#" class="btn btn-outline-dark logInSwitch" data-toggle="modal" data-target="#Confirm${i}" >Delete</a>
                            </div>
                          </div>
                </div>
                <div class="modal fade" id="Confirm${i}" tabindex="-1" role="dialog" aria-labelledby="ConfirmModalTitle" aria-hidden="true">
                    <div class="modal-dialog modal-dialog-centered" role="document">
                        <div class="modal-content">
                            <div class="modal-body">
                                <form method="post" action="deleteProduct">
                                <span class="form-group">
                                    <h4 >Hi, ${username}!</h4>
                                    <h6>&nbsp;&nbsp;&nbsp;&nbsp;Are you sure you want to delete this product?</h6>
                                    <input type="hidden" name="p_img" value="${prod.get(i).getImage()}"/>
                                    <input type="submit" class="btn btn-dark otpButton" value="Confirm"/>
                                    <button name="" class="btn btn-danger btn-md otpButton" data-dismiss="modal" aria-label="Close">Cancel</button>
                                </span>
                                </form>
                            </div>
                        </div>
                    </div>
               </div>
                <div class="modal fade" id="Modify${i}" tabindex="-1" role="dialog" aria-labelledby="ModifyModalTitle" aria-hidden="true">
                    <div class="modal-dialog modal-lg modal-dialog-centered" role="document" >
                        <div class="modal-content" style="border-radius: 10px; box-shadow: 2px 2px 10px 0px rgba(0,0,0,0.52);">
                            <div class="modal-body">
                                <div class="container" style="max-width: 100%">
                                    <h2>${prod.get(i).getItemname()}</h2>
                                    <form action="updateProduct" method="post" enctype="multipart/form-data">
                                    <div class="row" style="width: 100%; ">
                                        <div class="col-lg-5 col-sm-12">
                                            <br>
                                            <img src="images/${prod.get(i).getImage()}" class="modalImage" >
                                            <br><br>
                                            <input class="btn" type="file" id="img" name="img" accept="image/*">
                                            <br><br>
                                        </div>
                                        <div class="col-lg-7 col-sm-12" style="text-align: left; ">
                                            <label for="itemName" style="margin-bottom: 0px;">Item Name:</label>
                                            <input name="item_name" class="form-control customInput" id="itemName" style="margin-top: 0px;" value="${prod.get(i).getItemname()}"><br>
                                            <label for="details1" style="margin-bottom: 0px;">Category:</label>
                                            <select name="category" class="form-control customInput" id="details1" style="margin-top: 0px;">
                                                <option value="Pooja Item" <c:if test="${\"Pooja Item\".equals(prod.get(i).getCategory())}">selected</c:if>> Pooja Item </option>
                                                <option value="Aarta Thali" <c:if test="${\"Aarta Thali\".equals(prod.get(i).getCategory())}">selected</c:if>> Aarta Thali </option>
                                                <option value="Box" <c:if test="${\"Box\".equals(prod.get(i).getCategory())}">selected</c:if>> Box </option>
                                                <option value="Gifts" <c:if test="${\"Gifts\".equals(prod.get(i).getCategory())}">selected</c:if>> Gifts </option>
                                                <option value="Home Decor" <c:if test="${\"Home Decor\".equals(prod.get(i).getCategory())}">selected</c:if>> Home Decor </option>
                                                <option value="Household" <c:if test="${\"Household\".equals(prod.get(i).getCategory())}">selected</c:if>> Household </option>
                                                <option value="Jugset" <c:if test="${\"Jugset\".equals(prod.get(i).getCategory())}">selected</c:if>> Jugset </option>
                                                <option value="Kids" <c:if test="${\"Kids\".equals(prod.get(i).getCategory())}">selected</c:if>> Kids </option>
                                                <option value="Luxury" <c:if test="${\"Luxury\".equals(prod.get(i).getCategory())}">selected</c:if>> Luxury </option>
                                                <option value="Photo Frame" <c:if test="${\"Photo Frame\".equals(prod.get(i).getCategory())}">selected</c:if>> Photo Frame </option>
                                                <option value="Coins" <c:if test="${\"Coins\".equals(prod.get(i).getCategory())}">selected</c:if>> Coins </option>
                                            </select><br>
                                            <label for="details2" style="margin-bottom: 0px;">Weight(approx.):</label>
                                            <input name="weight" class="form-control customInput" id="details2" style="margin-top: 0px;" value="${prod.get(i).getWeight()}"><br>
                                            <label for="details3" style="margin-bottom: 0px;">Polish:</label>
                                            <input name="polish" class="form-control customInput" id="details3" style="margin-top: 0px;" value="${prod.get(i).getPolish()}"><br>
                                            <label for="details4" style="margin-bottom: 0px;">Purity:</label>
                                            <input name="purity" class="form-control customInput" id="details4" style="margin-top: 0px;" value="${prod.get(i).getPurity()}"><br>
                                            <label for="details" style="margin-bottom: 0px;">Description:</label>
                                            <input name="description" class="form-control customInput" id="details5" style="margin-top: 0px;" value="${prod.get(i).getDescription()}"><br>
                                            <input type="hidden" name="p_img" value="${prod.get(i).getImage()}"/> 
                                            <input type="submit" class="btn btn-dark logInSwitch" value="Save" />
                                            <br>
                                            
                                        </div>
                                    </div>
                                    </form>
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