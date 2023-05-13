<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create</title>
</head>
<body>
<p><a href="./index.php">See All Employees</a></p>
<form action="./store.php" method="post">
    <fieldset>
        <legend><h2>Employer</h2></legend>
        <p>
            <label for="fname">First name:</label>
            <input type="text" id="fname" name="fname" required>
        </p>
        <p>
            <label for="lname">Last name:</label>
            <input type="text" id="lname" name="lname" required>
        </p>
        <p>
            <input type="submit" value="Submit">
        </p>
    </fieldset>
</form>

</body>
</html>