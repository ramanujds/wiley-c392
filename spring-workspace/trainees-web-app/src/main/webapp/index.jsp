<html>
<body>
<h2>Hello World!</h2>
<h3><a href="trainees">View All Trainees</a></h3>
<div>
    <form action="add-trainee" method="post">
        <label for="id">ID :</label>
        <input type="number" id="id" name="id" required>
          <label for="name">Name :</label>
        <input type="text" id="name" name="name" required>
        <label for="email">Email :</label>
        <input type="email" id="email" name="email" required>
        <button type="submit">Add Trainee</button>
    </form>
</div>


</body>
</html>
