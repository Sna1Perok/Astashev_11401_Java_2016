<#ftl encoding='UTF-8'>

<!doctype html>
<html lang="en">
<head>
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
    <h2>Регистрация</h2>
</div>
<form class="form-horizontal">
    <div align="center" class="form-group">
        <label class="control-label col-xs-4" for="lastName">Фамилия:</label>

        <div class="col-xs-4">
            <input type="text" class="form-control" id="lastName" placeholder="Введите фамилию">
        </div>
    </div>
    <div class="form-group" align="center">
        <label class="control-label col-xs-4" for="firstName">Имя:</label>

        <div class="col-xs-4">
            <input type="text" class="form-control" id="firstName" placeholder="Введите имя">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="fatherName">Отчество:</label>

        <div class="col-xs-4"></dr>
            <input type="text" class="form-control" id="fatherName" placeholder="Введите отчество">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="fatherName">Дата рождения:</label>

        <div class="col-xs-4"></dr>
            <input type="text" class="form-control" id="age" placeholder="Введите дату рождения">
        </div>
    </div>
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
        <label class="control-label col-xs-4" for="confirmPassword">Подтвердите пароль:</label>

        <div class="col-xs-4">
            <input type="password" class="form-control" id="confirmPassword" placeholder="Введите пароль ещё раз">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="phoneNumber">Телефон:</label>

        <div class="col-xs-4">
            <input type="tel" class="form-control" id="phoneNumber" placeholder="Введите номер телефона">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4" for="postalAddress">Адрес:</label>

        <div class="col-xs-4">
            <textarea rows="3" class="form-control" id="postalAddress" placeholder="Введите адрес"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-xs-4">Пол:</label>

        <div class="col-xs-2">
            <label class="radio-inline">
                <input type="radio" name="genderRadios" value="male"> Мужской
            </label>
        </div>
        <div class="col-xs-2">
            <label class="radio-inline">
                <input type="radio" name="genderRadios" value="female"> Женский
            </label>
        </div>
    </div>
    <div class="form-group">
        <div class="col-xs-offset-4 col-xs-8">
            <label class="checkbox-inline">
                <input type="checkbox" value="agree"> Я согласен с <a href="#">условиями</a>.
            </label>
        </div>
    </div>
    <br/>

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