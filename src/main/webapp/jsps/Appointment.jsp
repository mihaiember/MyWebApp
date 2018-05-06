<!DOCTYPE html>
<html lang="en">
<head>
    <title>Clinica</title>
    <meta charset="UTF-8">
    <meta name="viewpoint" content="width=width-device, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .jumbotron {
            background-color: rgba(128, 123, 162, 0.74);
            color: #000000;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1> Programare </h1>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Doctor </p>
        </div>
        <div class="col-md-6">
            <div class="form-group">

                <select class="form-control" id="sel1">
                    <option>Doctor1</option>
                    <option>Doctor2</option>
                    <option>Doctor3</option>
                    <option>Doctor4</option>

                </select>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Data & Ora </p>
        </div>


        <div class='col-md-6'>
            <div class="form-group">
                <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control"/>
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Cabinet </p>
        </div>
        <div class="col-md-6">
            <div class="form-group">
                <select class="form-control" id="sel1">
                    <option>Cabinet1</option>
                    <option>Cabinet2</option>
                    <option>Cabinet3</option>
                    <option>Cabinet4</option>
                </select>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Nume </p>
        </div>
        <div class="col-md-6">
            <input class="form-control" placeholder="Nume" type="text" class="form-control" id="Nume">
        </div>
    </div>


    <div class="row">
        <div class="col-md-3">
            <p> Prenume </p>
        </div>
        <div class="col-md-6">
            <input class="form-control" placeholder="Prenume" type="text" class="form-control" id="Prenume">
        </div>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Telefon </p>
        </div>
        <div class="col-md-6">
            <input class="form-control" placeholder="Telefon" type="text" class="form-control" id="Telefon">
        </div>
    </div>

    <div class="row">
        <div class="col-md-3">
            <p> Bilet de trimitere </p>
        </div>
        <div class="col-md-6">
            <div class="form-group">
                <select class="form-control" id="sel1">
                    <option>Nu</option>
                    <option>Da</option>
                </select>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
        </div>

        <div class="col-md-3">
            <button class="btn btn-success btn-block"> Salvare</button>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
        </div>
        <div class="col-md-3">
            <button class="btn btn-danger btn-block"> Sterge Formularul</button>
        </div>
    </div>


</div>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>