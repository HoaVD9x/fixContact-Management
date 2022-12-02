<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body>
<div id="login">
    <h3 class="text-center text-white pt-5">Login form</h3>
    <div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div id="login-box" class="col-md-12">


                        <h3 class="text-center text-info">
                            User
                        </h3>
                        <form:form modelAttribute="user" id="login-form" cssClass="form" method="post"
                                   action="${pageContext.request.contextPath}/insert">
                           <form:hidden path="userId"/>


                        <spring:bind path="firstName">
                            <div class="form-group">
                                <label for="firstName" class="text-info">First Name :</label><br>
                                <form:input path="firstName" type="text" name="firstName" id="firstName"
                                            cssClass="form-control"/>
                            </div>
                        </spring:bind>
                        <spring:bind path="lastName">
                            <div class="form-group">
                                <label for="lastName" class="text-info">Last Name :</label><br>
                                <form:input path="lastName" type="text" name="lastName" id="lastName"
                                            cssClass="form-control"/>
                            </div>
                        </spring:bind>
                        <spring:bind path="email">
                            <div class="form-group">
                                <label for="email" class="text-info">Email :</label><br>
                                <form:input path="email" type="email" name="email" id="email" cssClass="form-control"/>
                            </div>
                        </spring:bind>
                        <spring:bind path="password">
                            <div class="form-group">
                                <label for="password" class="text-info">Password :</label><br>
                                <form:input path="password" type="text" name="password" id="password"
                                            cssClass="form-control"/>
                            </div>
                        </spring:bind>

                        <div id="register-link" class="text-center">
                            <form:button class="btn btn-primary btn-round mt-4">SAVE</form:button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
