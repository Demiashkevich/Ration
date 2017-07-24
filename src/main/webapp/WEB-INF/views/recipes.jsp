<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
<body class="gallery-page">
<div class="wrap-body">
  <header class="">
    <div id="cssmenu" class="align-center">
      <ul>
        <li><a href="${pageContext.request.contextPath}/home"><span>Home</span></a></li>
        <li><a href="${pageContext.request.contextPath}/product/products"><span>Products</span></a></li>
        <li class="active"><a href="${pageContext.request.contextPath}/recipe/recipes"><span>Recipes</span></a></li>
        <li><a href="${pageContext.request.contextPath}/ration/rations"><span>Rations</span></a></li>
        <li><a href="${pageContext.request.contextPath}/user/authorize"><span>Sign In</span></a></li>
        <li class="last"><a href="contact.html"><span>Contact</span></a></li>
      </ul>
    </div>
  </header>
  <section id="container">
    <div class="wrap-container">
      <!-----------------Content-Box-------------------->
      <div id="main-content" class="zerogrid">
        <div class="wrap-content">
          <jsp:useBean id="recipesDto" scope="request" type="java.util.List"/>
          <c:forEach var="i" begin="0" end="${fn:length(recipesDto)}" step="3">
            <div class="row">
              <c:set var="end" value="${i+2}"/>
              <c:forEach items="${recipesDto}" var="recipeDto" begin="${i}" end="${end}">
                <div class="col-1-3">
                  <div class="wrap-col">
                    <article>
                      <div class="post-thumbnail-wrap">
                        <a href="${pageContext.request.contextPath}/recipe/recipe/${recipeDto.recipeId}" class="portfolio-box">
                          <img src="${pageContext.request.contextPath}/resources/image/11.jpg" alt="">
                          <div class="portfolio-box-second">
                            <img src="${pageContext.request.contextPath}/resources/image/1.jpg" alt="">
                          </div>
                        </a>
                      </div>
                      <div class="entry-header ">
                        <h3 class="entry-title"><c:out value="${recipeDto.name}"/></h3>
                        <div class="l-tags">
                          <a href="${pageContext.request.contextPath}/recipe/update/${recipeDto.recipeId}">Update</a>
                          /
                          <a href="${pageContext.request.contextPath}/recipe/delete/${recipeDto.recipeId}">Delete</a>
                        </div>
                      </div>
                    </article>
                  </div>
                </div>
              </c:forEach>
            </div>
          </c:forEach>
        </div>
      </div>
    </div>
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
</body>
</html>
