<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body.custom-background {
            background-image:url('1431335355535.jpg');
            background-size:100% 100%;
            background-repeat:no-repeat;
            background-position:top left;
            background-attachment:fixed;
        }
    </style>
</head>

<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
<!-- 2. jQuery导入，建议使用1.9以上的版本 -->
<script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
<!-- 3. 导入bootstrap的js文件 -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/all.js"></script>

<body class="custom-background">

    <form>
        <div class="form-group">
            <label for="getIp">获取当前的Ip地址</label>
            <input type="text" class="form-control" id="getIp" placeholder="ip将会显示在这里">
        </div>

        <button class="btn btn-default">查询</button>
        <div class="form-group">
            <a class="btn-info">玩玩小游戏</a>
        </div>
    </form>



</body>
</html>
