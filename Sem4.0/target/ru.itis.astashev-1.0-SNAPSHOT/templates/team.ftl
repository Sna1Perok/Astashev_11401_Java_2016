<!doctype html>
<html lang="en">
<head>

    <script type="application/javascript" src="/resources/bootstrap/js/jquery.js"></script>
    <script type="application/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/css.css">
    <meta charset="UTF-8">
    <title>My profile</title>
</head>
<body>

</body>

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
                <#if infT.id==1>
                    <a class="btn btn-default btn-success" href="/oafl/team/create-team" role="button"> Create new
                        team</a>
                    <a class="btn btn-default btn-info" href="/oafl/team/find-team" role="button">Find team </a>
                </#if><#if user.id==1>
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
<!-- Nav tabs -->


<div class="page-header" align="center">
    <h1>
    </h1>
</div>
<div align="center">

    <div class="col-xs-offset-2 col-xs-8">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#home" data-toggle="tab">Information</a></li>
            <li><a href="#messages" data-toggle="tab">Team statistic</a></li>
            <li><a href="#settings" data-toggle="tab">Players</a></li>
        </ul>
    </div>

    <img src="/resources/image/IMG_6860.gif" class="img-responsive" alt="Отзывчивое изображение в Bootstrap">

    <div align="center">
        <h1>
        ${infT.name}
        </h1>
    </div>


    <!-- Tab panes -->
    <div class="tab-content">
        <div class="tab-pane active" id="home">
            <div align="center">
                <div class="panel-group" align="center" id="collapse-group">
                    <div class="col-xs-offset-2 col-xs-8">
                        <div class="panel panel-default">

                            <div class="panel-heading">
                                <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el1">Games </a>
                                </h4>
                            </div>
                            <div align="center">
                                <h2>
                                    The last game
                                </h2>
                            </div>
                            <div id="el1" class="panel-collapse collapse in">
                            <#list game_list as atr>
                                <div id="el1" class="panel-collapse collapse in">
                                    <table class="table">
                                        <tr>
                                            <th>
                                                <div class="btn-group btn-group-sm ">
                                                    <div class=" btn-group-justified btn-group-sm ">
                                                        <a class="btn btn-success disabled" href="/oafl/login"
                                                           role="button">${atr.leagueName}</a>
                                                    </div>
                                                </div>
                                                <div class="btn-group ">
                                                    <div class=" btn-group-justified">
                                                        <a class="btn btn-primary   " href="/oafl/team/${atr.team1name}"
                                                           role="button">${atr.team1name}</a>
                                                            <a class="btn btn-info btn-2  disabled" href="/oafl/login"
                                                        <#if atr.score??>
                                                               role="button">${atr.score}</a>
                                                        <#else >
                                                            role="button">---</a>
                                                        </#if>
                                                        <a class="btn btn-primary   " href="/oafl/team/${atr.team2name}"
                                                           role="button">${atr.team2name}</a>
                                                    </div>
                                                </div>
                                                <div class="btn-group btn-group-">
                                                    <div class="btn-group btn-group-xs ">
                                                        <a class="btn btn-success btn-block disabled " href="/oafl/login"
                                                           role="button">${atr.date}</a>
                                                    </div>
                                                </div>

                                            </th>
                                        </tr>
                                    </table>
                                </div>
                            </#list>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="tab-pane" id="messages">
            <div class="col-xs-offset-2 col-xs-8">
                <div class="panel-group" id="collapse-group">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#collapse-group" href="#el4">Games statistics</a>
                            </h4>
                        </div>
                        <div id="el4" class="panel-collapse collapse in">
                            <div class="panel-body">
                                Win: ${infT.win}
                            </div>
                            <div class="panel-body">
                                Lose: ${infT.lose}
                            </div>
                            <div class="panel-body">
                                Goals: ${infT.goals}
                            </div>
                            <div class="panel-body">
                                Missed goals: ${infT.misgoal}
                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#collapse-group" href="#el6">
                                    About team</a>
                            </h4>
                        </div>
                        <div id="el6" class="panel-collapse collapse">
                            <div class="panel-body">
                                since: ${infT.date}
                            </div>
                            <div class="panel-body">
                                about as
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="tab-pane" id="settings">
            <div class="col-xs-offset-2 col-xs-8">

                <table class="table navbar">
                    <thead>
                    <tr class="alert-info">
                        <th>Name</th>
                        <th>Skill</th>
                        <th>Goals</th>
                        <th>Card</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list players as atr>
                    <tr class="alert-success">
                        <td><a class="btn btn-link" href="/oafl/user/${atr.id}"
                               role="button">${atr.name} ${atr.surname}</a></td>
                        <td>${atr.skill}</td>
                        <td>${atr.goals}</td>
                        <td>${atr.card}</td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>

</html>