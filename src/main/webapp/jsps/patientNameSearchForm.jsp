<%--
  Created by IntelliJ IDEA.
  User: A693832
  Date: 19.05.2018
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=yes">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <title>Cautare</title>
</head>



<body>
<div class="container">
    <div class="page-header">
        <h1> Cautare dupa nume pacient </h1>
    </div>


    <div class="form-group row">
        <div class="col-md-3">
            <p> Introdu numele </p>
        </div>
        <div class="col-md-6">
            <input class="form-control" placeholder="Nume" type="text" name="last_name" class="form-control" >
        </div>
    </div>
    <div class="form-group row">
        <div class="col-md-3">
            <p> Introdu prenumele </p>
        </div>
        <div class="col-md-6">
            <input class="form-control" placeholder="Prenume" type="text" name="first_name" class="form-control" >
        </div>
    </div>

    <div class="form-group row">
        <div class="col-md-3">
        </div>

        <div class="col-md-3">
            <input type="button" class="btn btn-info" value="Home" onclick=" relocate()">
            <script>
                function relocate() {
                    location.href = "/home";
                }
            </script>
        </div>

        <div class="col-md-3">
            <button class="btn btn-success btn-block"> Cautare </button>
        </div>
    </div>
</div>






<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
        integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
        crossorigin="anonymous"></script>
</body>
</html>
