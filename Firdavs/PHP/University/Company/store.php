<?php
$data = $_POST;
$db_name = 'employees.json';

if (
    isset($data['fname'], $data['lname'])
    && !empty($data['fname']) && !empty($data['lname'])
    && file_exists($db_name)
) {
    $db = file_get_contents($db_name);
    $db = json_decode($db,true);
    $db[] = [
        'fname' => $data['fname'],
        'lname' => $data['lname'],
    ];

    $db = json_encode($db);
    file_put_contents($db_name,$db);
    echo '<p><b>'.$data['fname'].' '.$data['lname'].'</b> Employer has been entered</p>';
    echo '<p><a href="./create.php">Add New Employer</a></p>';
    echo '<p><a href="./index.php">See All Employees</a></p>';
} else {
    header('Location: http://localhost:63342/University/Company/create.php');
    die();
}