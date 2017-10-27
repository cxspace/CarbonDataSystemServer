<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>
     <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head
         content must come *after* these tags -->
    <title>用户列表</title>
        <!-- Bootstrap -->

  <!-- build:css styles/mystyles.css -->
    <link href="${pageContext.request.contextPath}/asset/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/asset/bower_components/bootstrap/dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/asset/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/asset/styles/bootstrap-social.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/asset/styles/mystyles.css" rel="stylesheet">
  <!-- endbuild -->



    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="${pageContext.request.contextPath}/sys/index.do">
            <img alt="DaDouMi" style="width: 30px;height: 30px" src="${pageContext.request.contextPath}/asset/images/icon.png">
        </a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">

        <p class="navbar-text">大豆米后台管理系统</p>

      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right">

          <li><a href="${pageContext.request.contextPath}/sys/story_listUI.do">美食故事管理</a></li>

          <li><a href="${pageContext.request.contextPath}/sys/share_listUI.do">圆桌分享管理</a></li>

          <li class="active"><a href="${pageContext.request.contextPath}/sys/user_listUI.do">用户管理</a></li>

        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">账户 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/">注销</a></li>
            <li role="separator" class="divider"></li>
            <%--<li><a href="${pageContext.request.contextPath}/registerUI">注册新的管理账户</a></li>--%>
          </ul>
        </li>

      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>

<div class="container">

    <br/>
    <br/>

    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading">美食故事管理</div>
        <div class="panel-body">
        </div>

        <!-- Table -->
        <table class="table table-hover">

            <thead>

               <th>ID</th>
               <th>用户名</th>
               <th>手机号</th>
               <th>邮箱号</th>
               <th>头像</th>
               <th>操作</th>

            </thead>

            <tbody>

            <c:forEach items="${userList}" var="user">

               <tr>
                   <td>${user.id}</td>
                   <td>${user.name}</td>
                   <td>${user.phone}</td>
                   <td>${user.email}</td>
                   <td>
                       <img src="http://121.42.184.102/DaDouMiImg/${user.imgsrc}" style="width: 100px;height: 100px">
                   </td>
                   <td>
                       <c:if test="${user.status == 1}">
                       <a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/sys/prohibit_user?user_id=${user.id}" role="button">禁用</a>
                       </c:if>
                       <c:if test="${user.status == 0}">
                           <a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/sys/active_user?user_id=${user.id}" role="button">激活</a>
                       </c:if>
                   </td>
               </tr>

            </c:forEach>

            </tbody>




        </table>



    </div>

    <br/>
    <hr/>
    <br/>


</div>



  <!-- build:js scripts/app.js -->

    <script type="text/javascript" src="${pageContext.request.contextPath}/asset/bower_components/jquery/dist/jquery.min.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/asset/bower_components/bootstrap/dist/js/bootstrap.js"></script>

  <!-- endbuild -->

</body>



</html>
