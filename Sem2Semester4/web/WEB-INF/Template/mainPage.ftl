<#ftl encoding='UTF-8'>
<!doctype html>
<html lang="en">
<head>

    <script type="application/javascript" src="../../resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../../resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../resources/bootstrap/css/css.css">
    <script type="application/javascript" src="../../resources/bootstrap/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <title>Information</title>
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
                <a class="navbar-brand" href="/gototravel">Go to travel</a>
            </div>

            <!-- Button trigger modal -->
            <ul class="nav navbar-nav navbar-right">

                <form class="navbar-form navbar-left" role="form">
                    <div class="form-group">
                        <input type="text" placeholder="Email" class="form-control">
                    </div>
                    <div class="form-group">
                        <input type="password" placeholder="Password" class="form-control">
                    </div>
                    <button type="submit" class="btn btn-success">Sign in</button>
                    <button type="button" class="btn btn-link"><a href="/reg">Регистрация</a> </button>
                    <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal">
                        О нас
                    </button>
                </form>


            </ul>
            <div class="collapse navbar-collapse bs-example-js-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a id="drop1" href="#" role="button" class="dropdown-toggle" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">Отдых <b class="caret"></b></a>
                        <ul class="dropdown-menu" aria-labelledby="drop1">
                            <li><a href="/gototravel/lastminute">Горячие путевки</a></li>
                            <li><a href="/gototravel/hotel">Отели</a></li>
                            <li><a href="/gototravel/review">Отзывы</a></li>

                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" id="drop2" role="button" class="dropdown-toggle" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">Развлечения<b class="caret"></b></a>
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


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">О нас</h4>
            </div>
            <div class="modal-body">
                1 семестрвоая работа ученика 2 курса ВШИТИС Асташева Никиты

                Преподавтель: Абрамский Михаил Михайлович
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>
            </div>
        </div>
    </div>
</div>


<div class="container">

    <div class="page-header">
        <h1>GO TO TRAVEL
            <small>Путешествуй с нами</small>
        </h1>
    </div>

    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
            <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img alt="First slide" src="/resources/image/IMG_8178.gif">
            </div>
            <div class="item">
                <img alt="Second slide" src="/resources/image/IMG_6860.gif">
            </div>
            <div class="item">
                <img alt="Third slide" src="/resources/image/IMG_7188.gif">
            </div>
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>

    <div class="page-header">
        <div align="center">
            <h1>
                Cнами вы можете
            </h1>
        </div>
    </div>


    <div class="panel-group" id="collapse-group">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el1">Весело проводить свое свободное
                        время </a>
                </h4>
            </div>
            <div id="el1" class="panel-collapse collapse in">
                <div class="panel-body">
                    На нашем сайты вы можете прочитать или же написать свою <a href="/truestory">историю</a> о проведенном
                    вами отпуске!
                </div>
                <div class="panel-body">
                    Или же вы можете посмотреть все возможные <a href="/truestory">"лайф хак'и</a>. Или поделиться своим
                </div>
                <div class="panel-body">
                    Если же вы хотели бы пожелиться своими впечатлениями о отеле в котором вы отдехали вы можете
                    <a href="/review">отзыв</a>.
                </div>

            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el2">Узнать все вас интересующее о
                        предстоящем отдыхе</a>
                </h4>
            </div>
            <div id="el2" class="panel-collapse collapse">
                <div class="panel-body">
                    <a href="/hotel">Выбрать</a> себе отель, в котором вы хотите провести предстоящий отдых.
                </div>
                <div class="panel-body">
                    <a href="/">Выбрать</a> себе горячую путевку.
                </div>
            </div>
        </div>

</div>


</div>


</div>
</body>
</html>