<#ftl encoding='UTF-8'>
<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="/resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/css.css">
    <script type="application/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
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
                <a class="navbar-brand" href="/oafl">OAFL</a>
            </div>

            <!-- Button trigger modal -->
            <ul class="nav navbar-nav navbar-right">
            <#if user?has_content>
                <#if id==1>
                    <a class="btn btn-link" href="/admin" role="button">admin</a>
                <#else >
                    <#if teamid==1>
                        <a class="btn btn-default btn-success" href="/oafl/team/create-team" role="button"> Create new
                            team</a>
                        <a class="btn btn-default btn-info" href="/oafl/team/find-team" role="button">Find team </a>
                    </#if>
                </#if>

                <a class="btn btn-link" href="/oafl/user/${id}" role="button">${user}</a>
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

                </form>
            </#if>
            </ul>


        </div>
    </nav>
</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel"> About us </h4>
            </div>
            <div class="modal-body">
                sem work by Astashev Nikita
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<div class="container">

    <div class="page-header">
        <h1>OAFL
            <small>Open amateur football league</small>
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
                    <a class="btn btn-default" href="/oafl/rates" role="button">Check games</a>
                </div>
                <div class="panel-body">
                    Create your own team!
                </div>
                <div class="panel-body">
                    Chose tournament!
                </div>
            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#collapse-group" href="#el2">
                        Grow with us!</a>
                </h4>
            </div>
            <div id="el2" class="panel-collapse collapse">
                <div class="panel-body">
                    Upgrade your skill!
                </div>
                <div class="panel-body">
                    Score goals.
                </div>
            </div>
        </div>
    </div>

    <div class="col-xs-offset-1 col-xs-10">
        <table class="table navbar">
            <thead>
            <tr class="alert-info">
                <th> <div align="center">News</div></th>
            </tr>
            </thead>
            <tbody>
                <#list game_list as atr>
                <tr class="alert-warning">
                    <td>
                        <div align="center"></div>
                    </td>
                </tr>
                <tr class="alert-danger">
                    <td> <div align="center">${atr.topic}</div></td>
                </tr>
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


                </#list>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>