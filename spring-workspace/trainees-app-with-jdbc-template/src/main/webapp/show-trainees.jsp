<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <title>Title</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        </head>

        <body>
            <h1>Trainees</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Location</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="trainee" items="${trainees}">
                        <tr>
                            <td>${trainee.id()}</td>
                            <td>${trainee.name()}</td>
                            <td>${trainee.email()}</td>
                            <td>${trainee.location()}</td>
                            <td>
                                <button onclick="deleteTrainee(${trainee.id()})" class="btn btn-danger">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </body>

<script>
  let deleteTrainee = (id)=>{
            if(confirm("Deleting trainee with id: "+id)){
                window.location.href = "delete-trainee?id=" + id;
            }
        }

        </script>

        </html>