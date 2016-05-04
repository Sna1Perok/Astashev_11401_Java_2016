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
    <h1>Registration
    </h1>
</div>
<form class="form-horizontal">
    <div align="center" class="form-group">
        <label class="control-label col-xs-4" for="lastName">Surname:</label>

        <div class="col-xs-4">
            <input type="text" class="form-control" id="lastName" placeholder="your surname">
        </div>
    </div>
    <div class="form-group" align="center">
        <label class="control-label col-xs-4" for="firstName">Name:</label>

        <div class="col-xs-4">
            <input type="text" class="form-control" id="firstName" placeholder="your name">
        </div>
    </div>


    <div class="form-group">
        <label class="control-label col-xs-4" for="inputEmail">Email:</label>

        <div class="col-xs-4">
            <input type="email" class="form-control" id="inputEmail" placeholder="your email">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="inputPassword">Password:</label>

        <div class="col-xs-4">
            <input type="password" class="form-control" id="inputPassword" placeholder="your password">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="confirmPassword">Confirm the password:</label>

        <div class="col-xs-4">
            <input type="password" class="form-control" id="confirmPassword" placeholder="confirm password">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="phoneNumber">Phone:</label>

        <div class="col-xs-4">
            <input type="tel" class="form-control" id="phoneNumber" placeholder="phone number">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="postalAddress">City:</label>

        <div class="col-xs-4">
            <textarea rows="3" class="form-control" id="postalAddress" placeholder="your city"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4">Gender:</label>

        <div class="col-xs-2">
            <label class="radio-inline">
                <input type="radio" name="genderRadios" value="male"> Male
            </label>
        </div>
        <div class="col-xs-2">
            <label class="radio-inline">
                <input type="radio" name="genderRadios" value="female"> Female
            </label>
        </div>
    </div>
    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-8">
            <label class="checkbox-inline">
                <input type="checkbox" value="agree"> I'm agree with <a href="#">usloviem</a>.
            </label>
        </div>
    </div>
    <br/>

    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-9">
            <input type="submit" class="btn btn-primary" value="registration">
            <input type="reset" class="btn btn-default" value="clean the form">
            <a class="btn btn-primary" href="/predictor/login" role="button">login</a>
        </div>
    </div>


</form>
</body>
</html>