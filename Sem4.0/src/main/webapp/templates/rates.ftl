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


</body>
</html>