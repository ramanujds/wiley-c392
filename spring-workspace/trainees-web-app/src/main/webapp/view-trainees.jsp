<%@ page import="com.wiley.app.model.Trainee" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   <div>
       <h2>Trainees</h2>
       <table>
           <thead>
           <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Email</th>
           </tr>
           </thead>
           <tbody>
           <% List<Trainee> trainees = (List<Trainee>) request.getAttribute("trainees"); %>
          <% for (Trainee trainee : trainees) { %>
               <tr>
                   <td><%= trainee.id() %></td>
                   <td><%= trainee.name() %></td>
                   <td><%= trainee.email() %></td>
               </tr>
           <% } %>
           </tbody>
       </table>
       </div>
</body>
</html>