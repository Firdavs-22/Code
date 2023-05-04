<?php
$data = $_GET;

if (isset($data['id']) && !empty($data['id']) && file_exists('poor_database.json')) {
    $db = file_get_contents('poor_database.json');
    $db = json_decode($db,true );

    foreach ($db as $key => $student) {
        if ($student['id'] == $data['id']){
            unset($db[$key]);
            break;
        }
    }
    $db = json_encode($db);
    file_put_contents('poor_database.json', $db);
}
header('Location: http://localhost:63342/University/CRUD/read.php');
die();