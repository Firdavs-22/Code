<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Log In | Sing Up</title>
</head>
<body>

<h3>
    Log In | Sing Up
</h3>
<form action="profile.php" method="post" enctype="multipart/form-data">
    <p>
        <label for="name">Name: </label>
        <input id="name" type="text" name="name" required placeholder="name">
    </p>
    <p>
        <label for="age">Age: </label>
        <input id="age" type="number" name="age" required placeholder="age">
    </p>
    <p>
        <label for="region">Region: </label>
        <select name="region" id="region" required>
            <option value="Tashkent">Tashkent</option>
            <option value="Jizzakh">Jizzakh</option>
        </select>
    </p>
    <p>
        <span>Gender: </span>
        <label for="Male">Male</label>
        <input type="radio" name="gender" id="Male" value="Male" required checked>
        <label for="Female">Female</label>
        <input type="radio" name="gender" id="Female" value="Female" required>
    </p>
    <p>
        <span>Hobby: </span>
        <label for="IT">IT</label>
        <input type="checkbox" name="hobby[]" value="IT" id="IT">
        <label for="Sport">Sport</label>
        <input type="checkbox" name="hobby[]" value="Sport"  id="Sport">
        <label for="Book">Book</label>
        <input type="checkbox" name="hobby[]" value="Book" id="Book">
    </p>
    <p>
        <label for="avatar">Avatar: </label>
        <input type="file" name="avatar" id="avatar">
    </p>
    <input type="submit" value="Send">
</form>

</body>
</html>