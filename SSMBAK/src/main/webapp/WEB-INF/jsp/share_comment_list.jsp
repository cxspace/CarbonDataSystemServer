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
    <title>美食分享评论列表</title>
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

        <li class="active"><a href="${pageContext.request.contextPath}/sys/share_listUI.do">圆桌分享管理</a></li>

        <li><a href="${pageContext.request.contextPath}/sys/user_listUI.do">用户管理</a></li>

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
        <div class="panel-heading">美食分享管理</div>
        <div class="panel-body">
        </div>

        <!-- Table -->
        <table class="table table-hover">

            <thead>

               <th>ID</th>
               <th>评论人ID</th>
               <th>创建时间</th>

               <th>操作</th>

            </thead>

            <tbody>


            <c:forEach items="${commentList}" var="comment">

               <tr>
                   <td>${comment.id}</td>
                   <td>${comment.user_id}</td>
                   <td>${comment.create_time}</td>

                   <td>
                       <%--<a class="btn btn-default btn-sm" href="" role="button">禁用</a>&nbsp;--%>
                   </td>
               </tr>

               <tr>
                   <td>评论内容</td>
                   <td colspan="4">
                       ${comment.content}
                   </td>
               </tr>


            </c:forEach>

            </tbody>


        </table>



    </div>
    <br/>
    <hr/>
    <br/>

    <div class="row">

        <center>
            <a href="${pageContext.request.contextPath}/sys/share_listUI.do" class="btn btn-default btn-lg">返回分享列表</a>
        </center>
    </div>


</div>



  <!-- build:js scripts/app.js -->

    <script type="text/javascript" src="${pageContext.request.contextPath}/asset/bower_components/jquery/dist/jquery.min.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/asset/bower_components/bootstrap/dist/js/bootstrap.js"></script>

  <!-- endbuild -->

</body>



</html>
