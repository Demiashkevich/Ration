<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>Ration</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/zerogrid.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
  <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/menu.css">
  <script src="${pageContext.request.contextPath}/resources/js/jquery1111.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
  <link href="${pageContext.request.contextPath}/resources/owl-carousel/owl.carousel.css" rel="stylesheet">
</head>

<body class="home-page">
<div class="wrap-body">
  <header class="">
    <div id="cssmenu" class="align-center">
      <ul>
        <li class="active"><a href="${pageContext.request.contextPath}/home"><span>Home</span></a></li>
        <li><a href="${pageContext.request.contextPath}/product/products"><span>Products</span></a></li>
        <li><a href="${pageContext.request.contextPath}/recipe/recipes"><span>Recipes</span></a></li>
        <li><a href="${pageContext.request.contextPath}/ration/rations"><span>Rations</span></a></li>
        <li><a href="${pageContext.request.contextPath}/user/authorize"><span>Sign In</span></a></li>
        <li class="last"><a href="contact.html"><span>Contact</span></a></li>
      </ul>
    </div>
  </header>
  <section id="container">
    <section class="content-box box-style-1 box-4">
      <div class="zerogrid" style="width: 100%">
        <div class="wrap-box"><!--Start Box-->
          <div class="row">
            <article>
              <div class="col-1-2">
                <img src="${pageContext.request.contextPath}/resources/image/slide1.jpg" alt="">
              </div>
              <div class="col-1-2">
                <div class="entry-content t-center">
                  <h3>The title on the article</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia. Morbi rutrum vulputate est sed faucibus.consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia.</p>
                  <a class="button" href="single.html">Read More</a>
                </div>
              </div>
            </article>
          </div>
          <div class="row">
            <article>
              <div class="col-1-2 f-right">
                <img src="${pageContext.request.contextPath}/resources/image/slide2.jpg" alt="">
              </div>
              <div class="col-1-2">
                <div class="entry-content t-center">
                  <h3>The title on the article</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia. Morbi rutrum vulputate est sed faucibus.consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia.</p>
                  <a class="button" href="single.html">Read More</a>
                </div>
              </div>
            </article>
          </div>
          <div class="row">
            <article>
              <div class="col-1-2">
                <img src="${pageContext.request.contextPath}/resources/image/slide3.jpg" alt="">
              </div>
              <div class="col-1-2">
                <div class="entry-content t-center">
                  <h3>The title on the article</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia. Morbi rutrum vulputate est sed faucibus.consectetur adipiscing elit. Aliquam viverra convallis auctor. Sed accumsan libero quis mi commodo et suscipit enim lacinia.</p>
                  <a class="button" href="single.html">Read More</a>
                </div>
              </div>
            </article>
          </div>
        </div>
      </div>
    </section>
    <section class="content-box box-3">
      <div class="zerogrid">
        <div class="wrap-box"><!--Start Box-->
          <div class="box-header">
            <h2>OUR PHILOSOPHY</h2>
          </div>
          <div class="box-content">
            <div class="row">
              <div class="col-1-2">
                <div class="wrap-col">
                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril.</p>
                </div>
              </div>
              <div class="col-1-2">
                <div class="wrap-col">
                  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril.</p>
                </div>
              </div>
            </div>
            <div class="row">
              <blockquote><p>Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet vultatup duista.</p></blockquote>
            </div>
          </div>
        </div>
      </div>
    </section>
  </section>
</div>
<footer>
  <div class="zerogrid bottom-footer">
    <div class="row">
      <div class="bottom-social">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-instagram"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"><i class="fa fa-google-plus"></i></a>
        <a href="#"><i class="fa fa-pinterest"></i></a>
        <a href="#"><i class="fa fa-vimeo"></i></a>
        <a href="#"><i class="fa fa-linkedin"></i></a>
        <a href="#"><i class="fa fa-youtube"></i></a>
      </div>
    </div>
    <div class="copyright">
      Copyright @ - Designed by Demiashkevich
    </div>
  </div>
</footer>
<script src="${pageContext.request.contextPath}/resources/owl-carousel/owl.carousel.js"></script>
<script>
  $(document).ready(function() {
    $("#owl-slide").owlCarousel({
      autoPlay: 3000,
      items : 1,
      itemsDesktop : [1199,1],
      itemsDesktopSmall : [979,1],
      itemsTablet : [768, 1],
      itemsMobile : [479, 1],
      navigation: true,
      navigationText: ['<i class="fa fa-chevron-left fa-5x"></i>', '<i class="fa fa-chevron-right fa-5x"></i>'],
      pagination: false
    });
  });
</script>
</body>
</html>
