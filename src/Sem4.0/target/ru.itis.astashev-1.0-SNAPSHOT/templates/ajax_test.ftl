<!doctype html>
<html lang="en">
<head>
    <script type="application/javascript" src="/resources/bootstrap/js/jquery.js"></script>
    <script type="application/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/bootstrap/css/css.css">
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>ajax</title>
</head>
<body>
<script type="text/javascript">
    function getAllAcceptedBooks() {
        jQuery.ajax(
                {
                    url: "index/ajax/getAllAcceptedBooks",
                    type: "GET",
                    headers: {
                        Accept: 'application/json'
                    },
                    success: function (response_data) {
                        jQuery("#table_header").html("");
                        jQuery("#table_header").append("<div class=\"row\">"
                                + "<div class=\"col-lg-12 text-left\">"
                                + "<h2><span id=\"table_header\">All users</span></h2>"
                                + "<div class=\"table-responsive\">"
                                + "<table class=\"table table-bordered table-hover\">"
                                + "<thead> <tr>"
                                + "<th>Name</th> <th>Surname</th> <th>Email</th> <th>Team</th> <th>Team</th> <th>Goals</th>"
                                + "</tr> </thead>"
                                + "<tbody id=\"table_content\">");
                        for (var i = 0; i < response_data.length; i ++) {
                            jQuery("#table_header").append("<tr>"
                                    + "<td>"+ response_data[i].team.name +"</td>"
                                    + "<td>"+ response_data[i].team.win +"</td>"
                                    + "<td>"+ response_data[i].team.lose +"</td>"
                                    + "<td>"+ response_data[i].team.goals +"</td>"
                                    + "</tr>");
                        }
                        jQuery("#table_header").append("</tbody> </table> </div> </div> </div>");
                    }
                }
        );
    }
</script>

<script type="text/javascript">
    function Ajax() {
        $.ajax({
            url: '/ajaxtest',
            type: "POST",
            success: function (data) {
                $('#result').html(data);
            }
        });
    }
</script>

<script>
    $(document).ready(function()  {
        $("#button").on("click", function () {
            $.ajax(
                    {
                        url: "/ajax/approve",
                        type: "POST",
                        success: function () {
                            $("#book").html("true")
                        }
                    }
            );
        })
    });
</script>

<script>
    $(document).ready(function()  {
        $("#button_param").on("click", function () {
            var param = $('#button_param').val();
            $.ajax(
                    {
                        url: "/ajax/getParam",
                        type: "POST",
                        data: param
                        success: function (id) {
                            $("#param").html(id)
                        }
                    }
            );
        })
    });
</script>
<script>
    $(document).ready(function()  {
        $("#button_approve").on("click", function () {
            var param = $('#button_approve').val();
            $.ajax(
                    {
                        url: "/admin/moder_applications/approve",
                        type: "POST",
                        data: param,
                        success: function (response) {
                            $("#isAccepted").html("Approved");
                            /* $("#buttons").html(response);*/
                        }
                    }
            );
        })
    });
</script>
<#macro m_body>
<div class="col-lg-12 text-left" id="result" onclick="Ajax()">
${ajax}
</div>
<div id="book">ololo</div>
<button id="button" type="button" class="btn btn-xs btn-default">book</button>
<div id="param">no param</div>
<button id="button_param" type="button" class="btn btn-xs btn-default" value="moder">param</button>


<div id="isAccepted">lol</div>
<div id="buttons">
    <button id="button_approve" type="button"
            class="btn btn-sm btn-default fa-anchor"
            value="moder1">Approve</button>
</div>
</#macro>
</body>
</html>