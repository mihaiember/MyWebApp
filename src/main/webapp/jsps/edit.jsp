<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Appointment</title>
    <meta charset="UTF-8">
    <meta name="viewpoint" content="width=width-device, initial-scale=1">
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
-->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet"/>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.standalone.min.css"/>
    <title>Edit</title>
</head>


<body>
<div class="container">
    <div class="page-header">
        <h1> Editare </h1>
    </div>


    <form role="form" action="/edit" method="post">

        <div class="form-group row">
            <label for="doctor" class="col-md-3 col-form-label">Doctor</label>
            <div class="col-md-6">

                <select class="form-control" id="doctor" name="doctor">
                    <c:forEach var="doctor" items="${requestScope.doctors}">
                        <option value="<c:out value="${doctor.doctorId}"/>"><c:out
                                value="${doctor.doctorName}"/></option>
                    </c:forEach>
                </select>

            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Data </p>
            </div>

            <div class='col-md-6'>
                <script
                        src="https://code.jquery.com/jquery-2.2.4.min.js"
                        integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
                        crossorigin="anonymous"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>

                <div class="form-group">
                    <div class="input-group date" data-provide="datepicker" data-date-format="dd/mm/yyyy">
                        <input type="text" class="form-control" name="data" value="">
                        <div class="input-group-addon">
                            <span class="glyphicon glyphicon-th"></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Ora </p>
            </div>
            <div class="col-md-3">
                <div class="form-group">
                    <select class="form-control" name="hour">

                        <option>09</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
                        <option>21</option>

                    </select>
                </div>
            </div>


            <div class="col-md-3">
                <div class="form-group">
                    <select class="form-control" name="minute">
                        <option>00</option>
                        <option>30</option>
                    </select>
                </div>
            </div>
        </div>


        <div class="form-group row">
            <label for="cabinet" class="col-sm-3 col-form-label">Cabinet</label>
            <div class="col-md-6">
                <div class="form-group">
                    <select class="form-control" id="cabinet" name="cabinet">
                        <c:forEach var="cabinet" items="${requestScope.cabinets}">
                            <option value="<c:out value="${cabinet.cabinetId}"/>"><c:out
                                    value="${cabinet.cabinetName}"/></option>
                        </c:forEach>
                    </select>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Nume </p>
            </div>
            <div class="col-md-6">
                <input class="form-control" placeholder="Nume" name="nume" type="text" id="Nume">
            </div>
        </div>


        <div class="form-group row">
            <div class="col-md-3">
                <p> Prenume </p>
            </div>
            <div class="col-md-6">
                <input class="form-control" placeholder="Prenume" name="prenume" type="text" class="form-control"
                       id="Prenume">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Telefon </p>
            </div>
            <div class="col-md-6">
                <input class="form-control" placeholder="Telefon" type="number" name="telefon" class="form-control"
                       id="Telefon">
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Bilet de trimitere </p>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <select class="form-control" id="sel1" name="sendingLetter">
                        <option>NU</option>
                        <option>DA</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-6">
            </div>

            <div class="col-md-3">
                <button class="btn btn-success btn-block"> Salvare</button>
            </div>
        </div>
    </form>
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