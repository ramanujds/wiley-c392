<%@page import="com.wiley.app.model.Trainee" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
   <div>
       <h2>Trainee Saved Successfully</h2>
       <p>${trainee.id()}</p>
       <p>${trainee.name()}</p>
       <p>${trainee.email()}</p>
       </div>
</body>
</html>