<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=yes">

    <!-- Bootstrap CSS -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet"/>

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.standalone.min.css"/>
</head>


<body>
<div class="container">
    <div class="page-header">
        <h1> Cautare dupa doctor </h1>
    </div>


    <form role="form" action="/doctorAndDateSearchForm" method="post">
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
                <p> Data de start </p>
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
                        <input type="text" class="form-control" name="startDate" value="">
                        <div class="input-group-addon">
                            <span class="glyphicon glyphicon-th"></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <div class="col-md-3">
                <p> Data de sfarsit</p>
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
                        <input type="text" class="form-control" name="endDate" value="">
                        <div class="input-group-addon">
                            <span class="glyphicon glyphicon-th"></span>
                        </div>
                    </div>
                </div>
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
                <input type="submit" class="btn btn-success btn-block" value="Cautare">
            </div>
        </div>
    </form>
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
