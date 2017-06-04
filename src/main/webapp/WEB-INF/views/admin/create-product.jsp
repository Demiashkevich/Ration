<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<html>
<head>
  <meta charset="UTF-8">
  <title>Ration</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/basic.css">
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/function.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/zerogrid.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
  <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/menu.css">
  <script src="${pageContext.request.contextPath}/resources/js/jquery1111.min.js" type="text/javascript"></script>
  <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
  <link href="${pageContext.request.contextPath}/resources/owl-carousel/owl.carousel.css" rel="stylesheet">
</head>
<body>
<main>
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
  <section class="sc"><!--Section Create-->
    <img src="${pageContext.request.contextPath}/resources/image/header.jpg" alt="">
    <h1 class="sc-title"><span class="sc-title-text fade-in latest">Create Product</span></h1>
  </section>
  <section  class="si"><!--Sign In-->
    <s:form name="create" method="POST" commandName="productDto">
      <ul class="si-list">
        <li class="si-item">
          <s:input class="form-input  size-input-sign-up" type="text" path="name" placeholder="name" autofocus="false" tabindex="1"/>
          <s:errors path="name"/>
        </li>
        <li class="si-item">
          <s:input class="form-input size-input-sign-up" type="text" path="description" placeholder="description" tabindex="2"/>
          <s:errors path="description"/>
        </li>
        <li class="si-item">
          <s:input class="form-input size-input-sign-up" type="text" path="protein" placeholder="protein" tabindex="3"/>
          <s:errors path="protein"/>
        </li>
        <li class="si-item">
          <s:input class="form-input size-input-sign-up" type="text" path="carbohydrate" placeholder="carbohydrate" tabindex="4"/>
          <s:errors path="carbohydrate"/>
        </li>
        <li class="si-item">
          <s:input class="form-input size-input-sign-up" type="text" path="fat" placeholder="fat" tabindex="5"/>
          <s:errors path="fat"/>
        </li>
        <li class="si-item">
          <s:input class="form-input size-input-sign-up" type="text" path="vitamin" placeholder="vitamin" tabindex="6"/>
          <s:errors path="vitamin"/>
        </li>
        <li class="si-item">
          <button class="button-custom" type="submit">Save</button>
        </li>
      </ul>
    </s:form>
  </section>
</main>
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