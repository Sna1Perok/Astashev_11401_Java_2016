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
    <title>ajax</title>
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

                <a class="btn btn-link" href="/oafl/user/1" role="button">${user.surname} ${user.name}</a>
                <a class="btn btn-default" href="/logout" role="button">go out</a>

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



<script type="text/javascript">
    function getAllBooksByPublisher() {
        jQuery.ajax(
                {
                    url: "/index/ajax/getAllBooksByPub",
                    type: "GET",
                    data: {"select": jQuery("#select_publ").val()},
                    headers: {
                        Accept: 'application/json'
                    },
                    success: function (response_data) {
                        jQuery("#table_header").html("All books by "+jQuery("#select_publ").val());
                        jQuery("#table_content").html("");
                        for (var i = 0; i < response_data.length; i++) {
                            jQuery("#table_content").append("<tr>"
                                    + "<td>" + response_data[i].book.name + "</td>"
                                    + "<td>" + response_data[i].book.author + "</td>"
                                    + "<td>" + response_data[i].book.description + "</td>"
                                    + "<td>" + response_data[i].book.price + "</td>"
                                    + "<td>" + response_data[i].publisher.name + " (" + response_data[i].publisher.credential.login + ")" + "</td>"
                                    + "<td>" + response_data[i].shop.name + ", "+response_data[i].shop.address+"</td>"
                                    + "</tr>");
                        }
                    }
                }
        );
    }
</script>
</body>
</html>