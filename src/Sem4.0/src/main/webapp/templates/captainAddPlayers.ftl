<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign tg=JspTaglibs["http://www.springframework.org/tags"]>
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
    <h1>
        They want playing in your team
    </h1>
</div>


<div align="center">

    <div class="col-xs-offset-2 col-xs-8">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#home" data-toggle="tab">Information</a></li>
        <#if hasTournament?has_content>
            <li><a href="#tournamet" data-toggle="tab">Choose tournament</a></li>
        </#if>
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
                               role="button">${atr.name}</a></td>
                        <td>${atr.goals}</td>
                        <td>${atr.card}</td>
                        <td>${atr.email}</td>
                        <td>
                            <a class="btn btn-success" href="/oafl/add-players/success${atr.id}"
                               role="button">add</a>
                            <a class="btn btn-danger" href="/oafl/add-players/danger${atr.id}"
                               role="button">delete</a>
                        </td>
                    </tr>
                    </#list>

                    </tbody>
                </table>
            </div>
        </div>
        <div class="tab-pane " id="tournamet">
            <div class="col-xs-offset-2 col-xs-8">

                <table class="table navbar">
                    <thead>
                    <tr class="alert-info">
                        <th>Name</th>
                        <th>League</th>
                        <th>Information</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>

                    <#list tournament as atr>
                    <tr class="alert-success">
                        <td><a class="btn btn-link" href="/oafl/team/${atr.name}"
                               role="button">${atr.name}</a></td>
                        <td>${atr.leaguename}</td>
                        <td>${atr.inf}</td>
                      <!--  <td>
                            <a class="btn btn-success" href="/oafl/tournament/success${atr.id}"
                               role="button">add</a>
                        </td> -->
                    </tr>
                    </#list>

                    </tbody>
                </table>
            </div>
        </div>


    </div>
</div>


</html>