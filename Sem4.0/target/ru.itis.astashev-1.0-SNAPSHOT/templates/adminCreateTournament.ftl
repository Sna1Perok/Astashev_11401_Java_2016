<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign tg=JspTaglibs["http://www.springframework.org/tags"]>
<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="application/javascript" src="/resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/css.css">
    <meta charset="UTF-8">
    <title>CreateTournament</title>
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
            <ul class="nav navbar-nav navbar-right">
                <a class="btn btn-link" href="/oafl/user/1" role="button">${user.surname} ${user.name}</a>
                <a class="btn btn-default" href="/logout" role="button">go out</a>
            </ul>

        </div>
    </nav>
</div>


<div class="page-header" align="center">
    <h1> Create tournament
    </h1>
</div>

<#if error??>
<div class="alert alert-danger" align="centr">
    <strong>Oops!</strong>You should change something and try submitting again.
</div>
</#if>

<@form.form action="/oafl/team/create-cup" class="form-horizontal" method="post" commandName="reg_form" role="form">
<div class="form-group" align="center">
    <label class="control-label col-xs-4" for="firstName">Name of new tournament:</label>

    <div class="col-xs-4">
        <@form.input path="name" name="name" id="name" cssClass="form-control" placeholder="tournament name"/>
    </div>
</div>
<div class="form-group" align="center">
    <label class="control-label col-xs-4" for="firstName">Information:</label>

    <div class="col-xs-4">
        <@form.input path="textarea" name="textarea" id="textarea" cssClass="form-control" placeholder="inf about tournament"/>
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