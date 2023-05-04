<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Read</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
<a class="button-create" href="./create.php">Create</a>
<table>
    <tr>
        <th>№</th>
        <th>Username</th>
        <th>Age</th>
        <th>Image</th>
        <th></th>
    </tr>
    <?php
    $db_name = 'poor_database.json';
    $has_data = false;
    if (file_exists($db_name)) {
        $db = file_get_contents($db_name);
        $db = json_decode($db, true);
        if (!(count($db) > 0)) {
            $has_data = 1;
        }
        $number = 0;
        foreach ($db as $student) {
            $number++
            ?>
            <tr>
                <td><?= $number ?></td>
                <td><?= $student['username'] ?></td>
                <td><?= $student['age'] ?></td>
                <td><img src="./images/<?= $student['img'] ?>" width="100" alt="img"></td>
                <td class="operations">
                    <a href="./update.php?id=<?= $student['id'] ?>" class="update operation">Update</a>
                    <a href="./delete.php?id=<?= $student['id'] ?>" class="delete operation">Delete</a>
                </td>
            </tr>
            <?php
        }
    }
    if ($has_data) {
        ?>
        <tr>
            <td class="has-not" colspan="5"><span>students not founded</span></td>
        </tr>
        <?php
    }
    ?>
</table>
</body>
</html>