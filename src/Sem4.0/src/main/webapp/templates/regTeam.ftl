<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign tg=JspTaglibs["http://www.springframework.org/tags"]>
<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="/resources/bootstrap/js/jquery.js"></script>
    <script type="application/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/css.css">
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
                <a class="navbar-brand" href="/oafl">OAFL</a>
            </div>

            <!-- Button trigger modal -->
            <ul class="nav navbar-nav navbar-right">
            <#if user?has_content>
                <#if user.id==1>
                    <a class="btn btn-link" href="/admin" role="button">admin</a>
                </#if>
                <a class="btn btn-link" href="/oafl/user/${user.id}" role="button">${user.surname} ${user.name}</a>
                <a class="btn btn-default" href="/logout" role="button">go out</a>
            <#else >
                <form class="navbar-form navbar-left" role="form" action="/login/process" method="post">
                    <div class="form-group">
                        <input class="form-control" placeholder="Enter login" type="text" name="login" autofocus>
                    </div>
                    <div class="form-group">
                        <input class="form-control" placeholder="Enter password" type="password" name="password">
                    </div>
                    <button type="submit" class="btn btn-success">Sign in</button>
                    <button type="button" class="btn btn-link"><a href="/oafl/registration">registration</a>
                    </button>
                    <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal">
                        About us
                    </button>
                </form>
            </#if>
            </ul>



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



<@form.form action="/oafl/team/create-team" class="form-horizontal" method="post" commandName="reg_form" role="form">

    <div class="form-group" align="center">
        <label class="control-label col-xs-4" for="firstName">Name of your team:</label>

        <div class="col-xs-4">
            <@form.input path="name" name="name" id="name" cssClass="form-control" placeholder="your team name"/>
        </div>
    </div>
    <div class="form-group" align="center">
        <label class="control-label col-xs-4" for="firstName">Captain:</label>

        <div class="col-xs-4">
        ${user.surname} ${user.name}
        </div>
    </div>

    </div>
    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-9">
            <input type="submit" class="btn btn-primary" value="registration">
            <input type="reset" class="btn btn-default" value="clean the form">
        </div>
    </div>


</@form.form>


</body>
</html>