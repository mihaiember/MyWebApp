<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=yes">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <title>SearchResults</title>
</head>


<body>
<div class="container">
    <div class="page-header">
        <h1> Rezultatele cautarii </h1>
    </div>

    <form role="form" action="/results" method="post">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>Doctor</th>
                <th>Cabinet</th>
                <th>Data</th>
                <th>Nume</th>
                <th>Prenume</th>
                <th>Numar de telefon</th>
                <th>Bilet de trimitere</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="result" items="${requestScope.results}">
                <tr>
                    <td><c:out value="${result.doctor.doctorName}"/></td>
                    <td><c:out value="${result.cabinet.cabinetName}"/></td>
                    <td><c:out value="${result.date}"/></td>
                    <td><c:out value="${result.patientLastName}"/></td>
                    <td><c:out value="${result.patientFirstName}"/></td>
                    <td><c:out value="${result.patientPhoneNumber}"/></td>
                    <td><c:out value="${result.sendingLetter}"/></td>

                    <td><input type="submit" class="btn btn-success btn-block" value="Editare"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </form>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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