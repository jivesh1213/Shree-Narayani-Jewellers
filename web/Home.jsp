<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<jsp:include page="Header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="vieport" content="width=device-width, initial-scale=1"/>
        <title>Shree Narayani Jewellers</title>
    </head>
        
<body>

    <div class="ism-slider" data-play_type="loop" id="my-slider" style="z-index: 0">
      <ol>
        <li>
          <img src="image/slides/_u/1st.png">
        </li>
        <li>
          <img src="image/slides/_u/second.png">
        </li>
        <li>
          <img src="image/slides/_u/3rd.png">
        </li>
        <li>
          <img src="image/slides/_u/4th.png">
        </li>
      </ol>
    </div>
    
    <br>

    <div class="container" id="categ" style="transform: scale()">
        
        <div class="row">
           

            <!-- 
                =================================
                This Code Block is For PC Edition
                ================================= 
            -->
            <form method="post" action="allProducts" style="margin-bottom: 0px">

            <div id="carouselExample" class="carousel slide d-none d-sm-none d-md-none d-lg-block" data-ride="carousel">
                
            <h1 class="headingCategories" >CATEGORIES</h1>
                <div class="carousel-inner">

                    <div class="carousel-item active">

                        <div class="row">
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/All Products.png" alt="Product">
                                    <h5>All Products</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="All Products" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Pooja Item.png" alt="Product">
                                    <h5>Pooja Item</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Pooja Item" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Home Decor.png" alt="Product">
                                    <h5>Home Decor</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Home Decor" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Household.png" alt="Product">
                                    <h5>Households</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Household" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- Carousel Item 1 -->

                    <div class="carousel-item">

                        <div class="row">
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Luxury.png" alt="Product">
                                    <h5>Luxury</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Luxury" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Kids.png" alt="Product">
                                    <h5>Kids</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Kids" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Gifts.png" alt="Product">
                                    <h5>Gifts</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Gifts" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Aarta Thali.png" alt="Product">
                                    <h5>Aarta Thali</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Aarta Thali" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- Carousel Item 2 -->

                    <div class="carousel-item">

                        <div class="row">
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Photo Frame.png" alt="Product">
                                    <h5>Photo Frame</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Photo Frame" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Box.png" alt="Product">
                                    <h5>Box</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Box" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src="images/Card/Jugset.png" alt="Product">
                                   <h5>Jugset</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Jugset" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="product-block">
                                    <img class="d-block w-100" src=" images/Purse.jpg" alt="Product">
                                    <h5>Coins</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Coins" >See&nbsp;More</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- Carousel Item 3 -->

                </div>

                <!-- <a class="carousel-control-prev" href="#carouselExample" role="button" data-slide="prev">

                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>

                    <span class="sr-only">Previous</span>

                </a> -->
                <!-- Carousel Control Prev -->

                <!-- <a class="carousel-control-next" href="#carouselExample" role="button" data-slide="next">

                    <span class="carousel-control-next-icon" aria-hidden="true"></span>

                    <span class="sr-only">Next</span>

                </a> -->
                <!-- Carousel Control Next -->

            </div>
            <!-- End of Carousel Example -->

            <!-- 
                =================================
                /End of PC Edition 
                =================================
            -->


            <!-- 
                =================================
                This Code Block is For Mobile Edition
                ================================= 
            -->

            <div id="carouselExampleMobile" class="carousel slide d-lg-none d-xl-none" data-ride="carousel">

                 <h1 class="headingCategories" >CATEGORIES</h1>
                <div class="carousel-inner">

                    <div class="carousel-item active">
                            
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/All Products.png" alt="Product">
                            <h5>All Products</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="All Products" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 1 -->

                    <div class="carousel-item">
                
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Aarta Thali.png" alt="Product">
                           <h5>Aarta Thali</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Aarta Thali" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 2 -->

                    <div class="carousel-item">
                
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Box.png" alt="Product">
                            <h5>Box</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Box" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>
                        
                    </div>
                    <!-- Carousel Item 3 -->

                    <div class="carousel-item">
                
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Gifts.png" alt="Product">
                            <h5>Gifts</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Gifts" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>  

                    </div>
                    <!-- Carousel Item 4 -->

                    <div class="carousel-item">
                            
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Home Decor.png" alt="Product">
                           <h5>Home Decor</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Home Decor" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 5 -->

                    <div class="carousel-item">
                
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Household.png" alt="Product">
                            <h5>Households</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Household" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 6 -->

                    <div class="carousel-item">

                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Jugset.png" alt="Product">
                            <h5>Jugset</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Jugset" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 7 -->

                    <div class="carousel-item">
                
                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Kids.png" alt="Product">
                            <h5>Kids</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Kids" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 8 -->

                    <div class="carousel-item">

                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Luxury.png" alt="Product">
                            <h5>Luxury</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Luxury" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 9 -->

                    <div class="carousel-item">

                        <div class="product-block">
                            <img class="d-block w-100" src="images/Photo Frame.png" alt="Product">
                           <h5>Photo Frame</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Photo Frame" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 10 -->

                    <div class="carousel-item">

                        <div class="product-block">
                            <img class="d-block w-100" src="images/Card/Pooja Item.png" alt="Product">
                            <h5>Pooja Item</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Pooja Item" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 11 -->

                    <div class="carousel-item">

                        <div class="product-block">
                            <img class="d-block w-100" src=" images/Purse.jpg" alt="Product">
                            <h5>Coins</h5>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <button type="submit" style="margin-left: 11%; margin-bottom: 10%; border-radius: 0px" class="btn btn-md btn-dark" name="btn" value="Coins" >See&nbsp;More</button>
                                        </div>
                                    </div>
                        </div>

                    </div>
                    <!-- Carousel Item 12 -->

                </div>

            </div>
            </form>
            <!-- End of Carousel Example -->

            <!-- 
                =================================
                /End of Mobile Edition 
                =================================
            -->
             <div class="col-md-12">

                

                <div class="col-md-12">

                    
                    <div class="button-placement d-none d-sm-none d-md-none d-lg-block">
                        <a class="btn btn-sm btn-dark" href="#carouselExample" role="button" data-slide="prev"><span class="carousel-control-prev-icon -dark"  aria-hidden="true"></span></a>
                        <a class="btn btn-sm btn-dark" href="#carouselExample" role="button" data-slide="next"><span class="carousel-control-next-icon" aria-hidden="true"></span></a>
                    </div>

                    

                    <!-- 
                        =================================
                        Mobile Indicators
                        ================================= 
                    -->
                    <div class="button-placement d-lg-none d-xl-none">
                        <a class="btn btn-sm btn-dark" href="#carouselExampleMobile" role="button" data-slide="prev"><span class="carousel-control-prev-icon" aria-hidden="true"></span></a>
                        <a class="btn btn-sm btn-dark" href="#carouselExampleMobile" role="button" data-slide="next"><span class="carousel-control-next-icon" aria-hidden="true"></span></a>
                    </div>

                    <!-- 
                        =================================
                        End of Mobile Indicators
                        ================================= 
                    -->
                </div>

            </div>
            <!-- End of Col-md-12 -->

        </div>
        <!-- End of Row -->

    </div>
    <br><br>
    <!-- End of Container -->
    <h2 id="whyUs" style="">WHY CHOOSE SNJ?</h2>
    <div class="container"  style="text-align: center; alignment-adjust: central; transform: scale(0.9);margin-top: -3%" >
        
        <div class="example" >
          <img src="images/Icons/1.png"  alt="tree"/>
          <div class="content">
              <div class="text">&bull; All our products are hallmarked and tested for purity. <br><br>&bull; You can blindly trust us with the purity as we believe in quality products only. <br><br>&bull; Purity of each product on our Website is mentioned in the details. </div>
          </div>
        </div>
        <div class="example" >
          <img src="images/Icons/2.png" />
          <div class="content">
              <div class="text">&bull; If you ever feel like exchanging your old jewellery, we are game!  <br><br>&bull; Exchange the product for its current value or get Cash with some deductions.  <br><br>&bull; Exchange value will be determined after testing.  </div>
          </div>
        </div>
        <div class="example" >
          <img src="images/Icons/3.png" />
          <div class="content">
              <div class="text">&bull; Yes, it's true, we provide shipping services for free.  <br><br>&bull; We take full responsibility of 100% safe shipping.  <br><br>&bull; Our shipping services are available in selected cities as of now.  </div>
          </div>
        </div>
        <div class="example" >
          <img src="images/Icons/4.png" />
          <div class="content">
              <div class="text">&bull; We also provide home delivery across Delhi NCR for free.  <br><br>&bull; Taking back to the time when jewellery was brought to you in comfort of your home.  <br><br>&bull; We promise a fast and secure home delivery for your comfort.  </div>
          </div>
        </div>
        <div class="example" >
          <img src="images/Icons/5.png" />
          <div class="content">
              <div class="text">&bull; Visit our physical store to take a look at our entire collection at your leisure.   <br><br>&bull; You can catch our Store address from the bottom of the page.  <br><br>&bull; Come, visit and become the part of our huge family.  </div>
          </div>
        </div>
        <div class="example" >
          <img src="images/Icons/6.png" />
          <div class="content">
              <div class="text">&bull; We also make personalized products that are made only for you. <br><br>&bull; Bring a design or a pic, we will turn it into reality. <br><br>&bull; Your product should reflect who you are. </div>
          </div>
        </div>
    </div>
    
    <br>
    
</body>
</html>

<jsp:include page="footer.jsp"/>