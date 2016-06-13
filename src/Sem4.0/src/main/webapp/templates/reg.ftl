<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign tg=JspTaglibs["http://www.springframework.org/tags"]>
<!doctype html>
<html lang="en">
<head>

    <script type="application/javascript" src="../resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/css.css">
    <script type="application/javascript" src="../resources/bootstrap/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>


<div class="container">

    <nav id="navbar-example" class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button class="navbar-toggle collapsed" type="button" data-toggle="collapse"
                        data-target=".bs-example-js-navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/oafl">OALF</a>
            </div>

            <!-- Button trigger modal -->


        </div>
    </nav>
</div>


<div class="page-header" align="center">
    <h1>Registration
    </h1>
</div>
<#if error??>
<div class="alert alert-danger" align="centr">
    <strong>Oops!</strong>You should change something and try submitting again.
</div>
</#if>
<@form.form action="/oafl/registration" method="post" commandName="reg_form" role="form">
<div align="center" class="form-group">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" for="lastName">Surname:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">
        <@form.input path="surname" name="surname" id="surname" cssClass="form-control" placeholder="your surname"/>
    </div>
</div>
<br>

<div class="form-group" align="center">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" for="firstName">Name:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">

        <@form.input path="name" name="name" id="name" cssClass="form-control" placeholder="your name"/>
    </div>
</div>

<div class="form-group" align="center">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" for="firstName">login:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">

        <@form.input path="login" name="login" id="login" cssClass="form-control" placeholder="your login"/>
    </div>
</div>
<div class="form-group" align="center">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" >Email:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">
        <@form.input path="email" name="email" id="email" cssClass="form-control" placeholder="your email"/>
    </div>
</div>
<div class="form-group" align="center">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" for="inputPassword">Password:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">
        <@form.input path="password" name="password" id="password" type="password" cssClass="form-control" placeholder="your password"/>
    </div>
</div>
<div class="form-group" align="center">
    <div class="col-xs-offset-4 col-xs-9">
        <label class="control-label col-xs-4" for="confirmPassword">Confirm the password:</label>
    </div>
    <div class="col-xs-offset-4 col-xs-5">
        <@form.input path="repassword" name="repassword" id="confirmPassword"type="password" cssClass="form-control" placeholder="confirm password"/>
    </div>
</div>
</div>

<div class="form-group">
    <div class="col-xs-offset-4 col-xs-9">
        <input type="submit" class="btn btn-primary" value="registration">
        <input type="reset" class="btn btn-default" value="clean the form">
        <a class="btn btn-primary" href="/login" role="button">login</a>
    </div>
</div>


</@form.form>
</body>
</html>