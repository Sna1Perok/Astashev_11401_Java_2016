<#ftl encoding='UTF-8'>
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
            <ul class="nav navbar-nav navbar-right">


            </ul>

        </div>
    </nav>
</div>


<div class="page-header" align="center">
    <h1>Login
    </h1>
</div>

<#if error??>
<div class="alert alert-danger">
    <strong>Oh snap!</strong> Change a few things up and try submitting again.
</div>
</#if>


<form class="form-horizontal" role="form" action="/login/process" method="post">
    <div class="form-group">
        <label class="control-label col-xs-4">Login:</label>

        <div class="col-xs-4">
            <input class="form-control" placeholder="Enter login" type="text" name="login" autofocus>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4">Pass:</label>

        <div class="col-xs-4">
            <input class="form-control" placeholder="Enter password" type="password" name="password">
        </div>
    </div>

    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-9">
            <button type="submit" class="btn btn-success">Log In</button>
            <input type="reset" class="btn btn-default" value="clean the form">
            <a class="btn btn-primary" href="/oafl/registration" role="button">registration</a>
        </div>
    </div>
</form>


</body>
</html>