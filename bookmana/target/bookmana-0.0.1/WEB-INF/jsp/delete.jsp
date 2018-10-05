<%--
  Created by IntelliJ IDEA.
  User: guzhanpeng
  Date: 2018/9/23
  Time: 20:51
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <li class="active"><a href="/delete">DELETE</a></li>
            <li><a href="/change">CHANGE</a></li>
            <li><a href="/show">SHOWALL</a></li>
        </ul>
        <ul class="icons">
            <li><a href="https://github.com" class="icon fa-github"><span class="label">GitHub</span></a></li>
        </ul>
    </nav>

    <!-- Main -->
    <div id="main">
        <!-- Footer -->
        <section>
            <form method="post" action="/delete_post">
                <div class="fields">
                    <div class="field">
                        <label for="name">请输入书籍Id</label>
                        <input type="text" name="name" id="name" />
                    </div>
                </div>
                <ul class="actions">
                    <li><input type="submit" value="删除" /></li>
                </ul>
            </form>
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