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
                </#if>
                <#if id==1>
                    <a class="btn btn-link" href="/admin" role="button">admin</a>
                </#if>

                <a class="btn btn-link" href="/oafl/user/${id}" role="button">${user.surname} ${user.name}</a>
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

<#if successT??>
    <div class="alert alert-success" align="centr">
        <strong>Yep!</strong>Your request has been done.
    </div>
</#if>

<#if conf??>
    <div class="alert alert-info" align="centr">
        The request is sent.
    </div>
</#if>
    <div class="col-xs-offset-2 col-xs-8">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#home" data-toggle="tab">Information</a></li>
            <li><a href="#profile" data-toggle="tab">Profile</a></li>
        <#if  infT.id!=1>
            <li><a href="#messages" data-toggle="tab">Team statistic</a></li></#if>
        </ul>
    </div>

    <img src="/resources/image/IMG_6860.gif" class="img-responsive" alt="Отзывчивое изображение в Bootstrap">

    <div align="center">
        <h1>
        ${inf.surname} ${inf.name}

        </h1>
    </div>
    <form class="form-horizontal">
        <div class="form-group">
            League: <a class="btn btn-default disabled" href="/oafl/league/${inf.leaguename}"
                       role="button"> ${inf.leaguename}</a>
        </div>
        <div class="form-group">
            pdf: <a class="btn btn-default" href="/oafl/pdf/${inf.login}"
                    role="button"> create </a>
        </div>
    <#if infT.id!=1>
        <div class="form-group">
            Team: <a class="btn btn-default" href="/oafl/team/${inf.teamname}" role="button"> ${inf.teamname}</a>
        </div>
    </#if>
    </form>
    <!-- Tab panes -->

    <div class="tab-content">
        <div class="tab-pane active" id="home">

        </div>
        <div class="tab-pane" id="profile">
            <div class="col-xs-offset-2 col-xs-8">
                <div class="panel-group" id="collapse-group">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#collapse-group" href="#el1">My statistics</a>
                            </h4>
                        </div>
                        <div id="el1" class="panel-collapse collapse in">
                            <div class="panel-body">
                                Goals: ${inf.goals}
                            </div>
                            <div class="panel-body">
                                Card: ${inf.card}
                            </div>
                        </div>
                    </div>
                <#if  infT.id!=1>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#collapse-group" href="#el2">
                                    Team statistics</a>
                            </h4>
                        </div>
                        <div id="el2" class="panel-collapse collapse">
                            <div class="panel-body">
                                Goal: ${infT.goals}
                            </div>
                            <div class="panel-body">
                                Missed goals: : ${infT.misgoal}
                            </div>
                        </div>
                    </div>
                </#if>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#collapse-group" href="#el3">
                                    About me</a>
                            </h4>
                        </div>
                        <div id="el3" class="panel-collapse collapse">
                            <div class="panel-body">
                                Mail: ${inf.mail}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <#if  infT.id!=1>
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
    </#if>
        <div class="tab-pane" id="settings"></div>
    </div>

</html>