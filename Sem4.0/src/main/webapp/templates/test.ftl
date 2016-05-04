<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="../resources/bootstrap/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/css.css">
    <script type="application/javascript" src="../resources/bootstrap/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body><div class="row">
    <div class="col-lg-6 text-center">
        <div class="panel panel-default">
            <div class="panel-body">
            <#if error??>
                <div class="alert alert-danger">
                    <strong>Oh snap!</strong> Change a few things up and try submitting again.
                </div>
            </#if>
                <form role="form" action="/registration/moderator" method="post">
                    <div class="form-group">
                        <label>Login</label>
                        <input class="form-control" placeholder="Enter login" type="text" name="login" required>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input class="form-control" placeholder="Enter password" type="password" name="password" required>
                    </div>
                    <div class="form-group">
                        <label>Email</label>
                        <input class="form-control" placeholder="Enter email" type="email" name="email" required>
                    </div>
                    <div class="form-group">
                        <label>Name</label>
                        <input class="form-control" placeholder="Enter name" type="text" name="name" required>
                    </div>

                    <button type="submit" class="btn btn-default">Register</button>
                </form>
            </div>
        </div>
    </div>
    <div class="col-lg-6">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">Info</h3>
            </div>
            <div class="panel-body">
                <div class="jumbotron">
                    Moderators are able to check which books will be sold in shop
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>