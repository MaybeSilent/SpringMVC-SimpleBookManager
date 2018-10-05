<%--
  Created by IntelliJ IDEA.
  User: guzhanpeng
  Date: 2018/9/23
  Time: 20:51
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<!--
Massively by HTML5 UP
html5up.net | @ajlkn
Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
  <title>bookContent</title>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
  <link rel="stylesheet" href="../../static/assets/css/main.css" />
  <noscript><link rel="stylesheet" href="../../static/assets/css/noscript.css" /></noscript>
</head>
<body class="is-preload">

<!-- Wrapper -->
<div id="wrapper">

  <!-- Header -->
  <header id="header">
    <a href="show" class="logo">BOOKS</a>
  </header>

  <!-- Nav -->
  <nav id="nav">
    <ul class="links">
      <li><a href="/insert">INSERT</a></li>
      <li><a href="/search">SEARCH</a></li>
      <li><a href="/delete">DELETE</a></li>
      <li><a href="/change">CHANGE</a></li>
      <li class="active"><a href="/show">SHOWALL</a></li>
    </ul>
    <ul class="icons">
      <li><a href="https://github.com" class="icon fa-github"><span class="label">GitHub</span></a></li>
    </ul>
  </nav>

  <!-- Main -->
  <div id="main">
    <section class="post">
      <header class="major">
        <h1>All Books</h1>
      </header>
      <!-- Table -->
      <h3>Default</h3>
      <div class="table-wrapper">
        <table>
          <thead>
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <c:forEach items = "${requestScope.bookList}" var = "bookIns">
              <tr>
                <td>${bookIns.id}</td>
                <td>${bookIns.name}</td>
                <td>${bookIns.author}</td>
                <td>${bookIns.price}</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </section>
  </div>
</div>

<!-- Scripts -->
<script src="../../static/assets/js/jquery.min.js"></script>
<script src="../../static/assets/js/jquery.scrollex.min.js"></script>
<script src="../../static/assets/js/jquery.scrolly.min.js"></script>
<script src="../../static/assets/js/browser.min.js"></script>
<script src="../../static/assets/js/breakpoints.min.js"></script>
<script src="../../static/assets/js/util.js"></script>
<script src="../../static/assets/js/main.js"></script>

</body>
</html>
