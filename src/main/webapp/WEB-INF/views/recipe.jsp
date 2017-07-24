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
<body class="single-page">
<div class="wrap-body">
  <header class="">
    <div id="cssmenu" class="align-center">
      <ul>
        <li><a href="${pageContext.request.contextPath}/home"><span>Home</span></a></li>
        <li><a href="${pageContext.request.contextPath}/product/products"><span>Products</span></a></li>
        <li><a href="${pageContext.request.contextPath}/recipe/recipes"><span>Recipes</span></a></li>
        <li><a href="${pageContext.request.contextPath}/ration/rations"><span>Rations</span></a></li>
        <li><a href="${pageContext.request.contextPath}/user/authorize"><span>Sign In</span></a></li>
        <li class="last"><a href="contact.html"><span>Contact</span></a></li>
      </ul>
    </div>
  </header>
  <!--////////////////////////////////////Container-->
  <section id="container">
    <div class="wrap-container">
      <!-----------------Content-Box-------------------->
      <div id="main-content">
        <div class="wrap-content">
          <div class="row">
            <article class="single-post zerogrid">
              <div class="row wrap-post"><!--Start Box-->
                <div class="entry-header">
                  <jsp:useBean id="recipeDto" class="com.epam.ration.dto.RecipeDto" scope="request"/>
                  <h2 class="entry-title"><c:out value="${recipeDto.name}"/></h2>
                  <span class="cat-links"><a href="#">BUSINESS</a>, <a href="#">LIFESTYLE</a></span>
                </div>
                <div class="post-thumbnail-wrap">
                  <img src="${pageContext.request.contextPath}/resources/image/slide1.jpg">
                </div>
                <div class="entry-content">
                  <div class="excerpt"><p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum exercitation ullamco laboris nisi ut aliquip.</p></div>
                  <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.</p>
                  <blockquote><p>Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet vultatup duista.</p></blockquote>
                  <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril.</p>
                  <h2>Heading 1</h2>
                  <p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum hendrerit in vulputate velit esse molestie.</p>
                  <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum.</p>
                  <p><code>Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</code></p>
                  <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
                  <div class="note">
                    <ol>
                      <li>Lorem ipsum</li>
                      <li>Sit amet vultatup nonumy</li>
                      <li>Duista sed diam</li>
                    </ol>
                    <div class="clear"></div>
                  </div>
                  <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                  <p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores.</p>
                </div>
              </div>
            </article>
          </div>
        </div>
      </div>
    </div>
  </section>
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
</div>
</body>
</html>
