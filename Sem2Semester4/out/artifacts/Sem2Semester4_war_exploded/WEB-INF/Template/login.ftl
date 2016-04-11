<#ftl encoding='UTF-8'>
<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="../../resources/b"></script>
    <script type="application/javascript" src="../../resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../../resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../../resources/bootstrap/css/css.css">
    <script type="application/javascript" src="../../resources/bootstrap/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<div align="center">
    <h2>Вход</h2>
</div>
<form class="form-horizontal">

    <div class="form-group">
        <label class="control-label col-xs-4" for="inputEmail">Email:</label>

        <div class="col-xs-4">
            <input type="email" class="form-control" id="inputEmail" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="inputPassword">Пароль:</label>

        <div class="col-xs-4">
            <input type="password" class="form-control" id="inputPassword" placeholder="Введите пароль">
        </div>
    </div>


    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-9">
            <input type="submit" class="btn btn-primary" value="Регистрация">
            <input type="reset" class="btn btn-default" value="Очистить форму">
            <input type="submit" class="btn btn-primary" value="Войти">
        </div>
    </div>
</form>
</body>
</html>