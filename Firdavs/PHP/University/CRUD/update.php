<?php
$data = $_POST;
$id = $_GET;
$db_name = 'poor_database.json';
$relocate = true;
if (isset($id['id']) && !empty($id['id']) && file_exists($db_name)) {
    $id = $id['id'];
    $db = file_get_contents($db_name);
    $db = json_decode($db, true);
    foreach ($db as $key => $student_db) {
        if ($student_db['id'] == $id) {
            $student = $db[$key];
            break;
        }
    }
    if (isset($student) && !empty($student)) {
        $relocate = false;
    }


    if (
        isset($data['name']) && !empty($data['name'])
        && isset($data['age']) && (!empty($data['age']) || $data['age'] >= 0)
        && strlen($data['name']) > 0
    ) {
        $db[$key] = [
            'id' => $id,
            'username' => $data['name'],
            'age' => intval($data['age']),
            'img' => $student['img']
        ];
        $relocate = true;
    }

    if (isset($_FILES['image']) && !empty($_FILES['image'])) {
        $file_true_name = explode('.',$student['img']);
        $file_name =  $file_true_name[0]. '.' . pathinfo($_FILES['image']['full_path'])['extension'];
        move_uploaded_file($_FILES['image']['tmp_name'], 'images/' . $file_name);
        $db[$key]['img'] = $file_name;
    }

    $db = json_encode($db);
    file_put_contents($db_name, $db);
    if ($relocate) {
        header('Location: http://localhost:63342/University/CRUD/read.php');
        die();
    } else {

        ?>

        <!doctype html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Update</title>
            <link rel="stylesheet" href="./style.css">
        </head>
        <body>
        <form action="update.php?id=<?= $id ?>" method="post" enctype="multipart/form-data">
            <div>
                <label for="username">Username</label>
                <input type="text" id="username" name="name" placeholder="username"
                       value="<?= (isset($data['name']) && !empty($data['name'])) ? $data['name'] : $student['username']; ?>"
                       required>
            </div>
            <div>
                <label for="age">Age</label>
                <input type="number" id="age" name="age" placeholder="age" min="0"
                       value="<?= (isset($data['age']) && !empty($data['age'])) ? intval($data['age']) : $student['age']; ?>">
            </div>
            <div>
                <label for=" img">Image</label>
                <input type="file" id="img" name="image">
                <img src="./images/<?= $student['img'] ?>" width="100" alt="img">
            </div>
            <div>
                <input type="submit" class="button-create" value="update" name="submit">
            </div>
        </form>
        </body>
        </html>
        <?php
    }
}
if ($relocate) {
    header('Location: http://localhost:63342/University/CRUD/read.php');
    die();
}
?>