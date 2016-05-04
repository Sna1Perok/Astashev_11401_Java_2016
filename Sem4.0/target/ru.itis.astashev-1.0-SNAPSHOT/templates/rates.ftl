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
<div class="page-header">
    <div align="center">
        <h1>
            Make money with us
        </h1>
    </div>
</div>

<div align="center">
    <div class="panel-group" align="center" id="collapse-group">
        <div class="col-xs-offset-2 col-xs-8">
            <div class="panel panel-default">

                <div class="panel-heading">

                    <h4 class="panel-title">
                        <a data-toggle="collapse" data-parent="#collapse-group" href="#el1">Football </a>
                    </h4>

                </div>
            <#list game_list as atr>
                <div id="el1" class="panel-collapse collapse in">
                    <table class="table">
                        <tr>
                            <th>
                                <div class="btn-group btn-group-sm ">
                                    <div class=" btn-group-justified btn-group-sm ">
                                        <a class="btn btn-success " href="/predictor/login"
                                           role="button">${atr.leagueName}</a>
                                    </div>
                                </div>
                                <div class="btn-group ">
                                    <div class=" btn-group-justified">
                                        <a class="btn btn-primary   " href="/predictor/login"
                                           role="button">${atr.team1name}</a>
                                        <a class="btn btn-info btn-2  " href="/predictor/login"
                                           <#if atr.score??>
                                           role="button">${atr.score}</a>
                                           <#else >
                                               role="button">---</a>
                                           </#if>
                                        <a class="btn btn-primary   " href="/predictor/login"
                                           role="button">${atr.team2name}</a>
                                    </div>
                                </div>
                                <div class="btn-group btn-group-">
                                    <div class="btn-group btn-group-xs ">
                                        <a class="btn btn-success btn-block " href="/predictor/login"
                                           role="button">${atr.date}</a>
                                    </div>
                                </div>
                            </th>
                        </tr>
                    </table>
                </div>
            </#list>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#collapse-group" href="#el2">Basketball</a>
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

            </div>
        </div>
    </div>


</body>
</html>