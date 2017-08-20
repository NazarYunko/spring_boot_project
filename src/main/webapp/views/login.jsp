<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Sign in</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="/css/user.css">
</head>
<body>
<form action="/loginprocessing?${_csrf.parameterName}=${_csrf.token}" id="form" method="post">
    <div>
        <div class="title">Sign in</div>
        <div class="center">
            <h4 class="exception">${userException}</h4>
        </div>
        <input name="username" id="userName" class="form-control" type="text" placeholder="Login or email">
        <br>
        <input name="password" id="password" class="form-control" type="password" min="3" placeholder="Password">
        <br>
        <button class="btn btn-primary btn-block center">Sign in</button>

        <input type="hidden" name="csrf_name"
               value="${_csrf.parameterName}"/>
        <input type="hidden" name="csrf_value"
               value="${_csrf.token}"/>
    </div>
    <div class="center">
        <p class="message">Not registered? <a class="message" href="/signup">Create an account</a></p>
    </div>
</form>
<script src="/scripts/js/user.js"></script>
</body>
</html>
