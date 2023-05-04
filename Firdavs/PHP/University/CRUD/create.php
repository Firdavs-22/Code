<?php
$data = $_POST;
$db_name = 'poor_database.json';
// Check

if (
    isset($data['submit']) && !empty($data['submit'])
    && isset($data['name']) && !empty($data['name'])
    && isset($data['age']) && (!empty($data['age']) || $data['age'] >= 0)
    && isset($_FILES['image']) && !empty($_FILES['image'])
    && file_exists($db_name)
    && strlen($data['name']) > 0
) {

    $db = file_get_contents($db_name);
    $db = json_decode($db, true);

    $mt = explode(' ', microtime());
    $file_name = intval($mt[1] * 1E3) + intval(round($mt[0] * 1E3)) . '.' . pathinfo($_FILES['image']['full_path'])['extension'];
    move_uploaded_file($_FILES['image']['tmp_name'], 'images/' . $file_name);
    $id = 1;
    if (count($db) > 0){
        $id = end($db)['id'] + 1;
    }
    $new_student = [
        'id' => $id,
        'username' => $data['name'],
        'age' => intval($data['age']),
        'img' => $file_name
    ];

    $db[] = $new_student;
    $db = json_encode($db);

    file_put_contents($db_name, $db);
    header('Location: http://localhost:63342/University/CRUD/read.php');
    die();
}
?>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
<form action="create.php" method="post" enctype="multipart/form-data">
    <div>
        <label for="username">Username</label>
        <input type="text" id="username" name="name" placeholder="username" required <?= (isset($data['name']) && !empty($data['name'])) ? 'value=\''.$data['name'].'\'': '';?>>
    </div>
    <div>
        <label for="age">Age</label>
        <input type="number" id="age" name="age" placeholder="age"  min="0" value="<?= (isset($data['age']) && !empty($data['age'])) ? intval($data['age']): 0;?>">
    </div>
    <div>
        <label for="img">Image</label>
        <input type="file" id="img" name="image" required>
    </div>
    <div>
        <input type="submit" class="button-create" value="create" name="submit">
    </div>
</form>
</body>
</html>