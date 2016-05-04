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
                <a class="navbar-brand" href="/predictor">predictor</a>
            </div>

            <!-- Button trigger modal -->
            <ul class="nav navbar-nav navbar-right">


            </ul>
            <div class="collapse navbar-collapse bs-example-js-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a id="drop1" href="#" role="button" class="dropdown-toggle" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">Something <b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop1">
                            <li><a href="/gototravel/lastminute">Горячие путевки</a></li>
                            <li><a href="/gototravel/hotel">Отели</a></li>
                            <li><a href="/gototravel/review">Отзывы</a></li>

                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" id="drop2" role="button" class="dropdown-toggle" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">Something2<b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop2">
                            <li><a href="/gototravel/truestory">Тру стори</a></li>
                            <li><a href="/gototravel/lifehask">Лайф хак</a></li>
                            <li><a href="https://www.gismeteo.ru/city/daily/4364/">Погода</a></li>
                        </ul>
                    </li>
                </ul>

            </div>
        </div>
    </nav>
</div>


<div class="page-header" align="center">
    <h1>Login
    </h1>
</div>
<form class="form-horizontal">
<#if error??>
    <div class="alert alert-danger">
        <strong>Oh snap!</strong> Change a few things up and try submitting again.
    </div>
</#if>
    <div class="form-group">
        <label class="control-label col-xs-4" for="inputEmail">Email:</label>

        <div class="col-xs-4">
            <input type="email" class="form-control" id="inputEmail" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="inputPassword">Pass:</label>

        <div class="col-xs-4">
            <input type="password" class="form-control" id="inputPassword" placeholder="your password">
        </div>
    </div>


    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-9">
            <input type="submit" class="btn btn-primary" value="login">
            <input type="reset" class="btn btn-default" value="clean the form">
            <a class="btn btn-primary" href="/predictor/registration" role="button">registration</a>
        </div>
    </div>


    <div class="page-header">
        <div align="center">
            <h1>
                With us you can
            </h1>
        </div>
    </div>


    <div class="panel-group" id="collapse-group">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el1">have fun </a>
                </h4>
            </div>
            <div id="el1" class="panel-collapse collapse in">
                <div class="panel-body">
                    ssss
                </div>
                <div class="panel-body">
                    aaaa
                </div>
                <div class="panel-body">
                    dddd
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el2">
                        Make many with us!</a>
                </h4>
            </div>
            <div id="el2" class="panel-collapse collapse">
                <div class="panel-body">
                    ddd
                </div>
                <div class="panel-body">
                    eeeee
                </div>
            </div>
        </div>
</form>
</body>
</html>