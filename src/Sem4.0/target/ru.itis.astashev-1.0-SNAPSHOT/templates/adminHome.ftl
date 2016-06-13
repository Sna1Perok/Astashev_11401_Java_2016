<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign tg=JspTaglibs["http://www.springframework.org/tags"]>
<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="../resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/css.css">
    <script type="application/javascript" src="../resources/bootstrap/js/bootstrap.min.js"></script>
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
<!-- Nav tabs -->


<div class="page-header" align="center">
    <h1>
    </h1>
</div>
<div align="center">


<#if error??>
    <div class="alert alert-danger" align="centr">
        <strong>Oops!</strong>You should change something and try submitting again.
    </div>
</#if>

<#if successT??>
    <div class="alert alert-success" align="centr">
        <strong>Yep!</strong>Your request has been done.
    </div>
</#if>

    <div class="tab-content">
        <div align="center">
            <div class="col-xs-offset-2 col-xs-8">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#home" data-toggle="tab">Delete User</a></li>
                   <!-- <li><a href="#createT" data-toggle="tab">Create Tournament</a></li> -->
                    <li><a href="#createNews" data-toggle="tab">Create news</a></li>
                </ul>
            </div>


            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane active" id="home">
                    <div class="col-xs-offset-2 col-xs-8">
                        <table class="table navbar">
                            <thead>
                            <tr class="alert-info">
                                <th>Name</th>
                                <th>Team</th>
                                <th>Goals</th>
                                <th>Card</th>
                                <th>Email</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>

                            <#list team as atr>
                            <tr class="alert-success">
                                <td><a class="btn btn-link" href="/oafl/user/${atr.id}"
                                       role="button">${atr.login}</a></td>
                                <td>
                                    <#if atr.teamid!=1>${atr.teamname}
                                    <#else>
                                        ---
                                    </#if></td>
                                <td>${atr.goals}</td>
                                <td>${atr.card}</td>
                                <td>${atr.mail}</td>
                                <td>
                                    <a class="btn btn-danger" href="/oafl/admin/delete${atr.id}"
                                       role="button">delete</a>
                                </td>
                            </tr>
                            </#list>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="tab-pane " id="createT">
                    <div class="col-xs-offset-2 col-xs-8">
                    <@form.form action="/admin/review" class="form-horizontal" method="post" commandName="reg_form" role="form">
                        <div class="form-group" align="center">
                            <label class="control-label col-xs-4" for="firstName">Name of new tournament:</label>

                            <div class="col-xs-4">
                                <@form.input path="name" name="name" id="name" cssClass="form-control" placeholder="tournament name"/>
                            </div>
                        </div>
                        <div class="form-group" align="center">
                            <label class="control-label col-xs-4" for="firstName">Information:</label>

                            <div class="col-xs-4">
                                <@form.textarea path="textarea" name="textarea" id="textarea" cssClass="form-control" placeholder="inf about tournament"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-xs-offset-2 col-xs-9">
                                <input type="reset" class="btn btn-default" value="clean the form">
                                <input type="submit" class="btn btn-primary" value="add">
                            </div>
                        </div>
                    </@form.form>
                    </div>
                </div>

                <div class="tab-pane " id="createNews">
                    <div class="col-xs-offset-2 col-xs-8">

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
                                                       role="button" >${atr.score}</a>
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
                                        <div class="btn-group btn-group-">
                                            <div class="btn-group btn-group-xs ">
                                                <a class="btn btn-success btn-block " href="/admin/review${atr.game_id}"
                                                   role="button">Make review</a>
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

</html>