<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent System</title>
<link href="<c:url value='/resources/css/main.css'/>" rel="stylesheet">
<script type="text/javascript" src="<c:url value='/resources/js/jquery/jquery.js'/>"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('#myaccount').click(function(){
            $('#main-iframe').attr('src', '/account');
        });
    });
</script>
</head>
<body>
    <p>Session ID: ${currentUser.sessionId}</p>
    <div id="menubar">
        <ul>
            <li><input type="button" name="registrationDate" id="myaccount" value="My Account"/></li>
            <li><input type="button" name="registrationDate" value="Agent"/></li>
        </ul>
    </div>
    <div id="sidebar">
        <ul>
        <c:forEach items="${players}" var="player">
            <li><c:out value="${player}"/></li>
        </c:forEach>
        </ul>
    </div>
    <iframe id="main-iframe" src="www.google.com"></iframe>
</body>
</html>