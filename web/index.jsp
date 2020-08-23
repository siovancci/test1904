
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<h3>模板设计模式的搭建</h3>
<a href="student/insert">学生添加</a>
<a href="student/delete">学生删除</a>
<a href="student/update">学生更新</a>
<a href="student/select">学生查询</a>


</body>
</html>
