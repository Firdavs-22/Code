<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Profile</title>
</head>
<body>
<?php
$form = $_POST;

if (
    isset($form['name']) && !empty($form['name'])
    && isset($form['age']) && !empty($form['age'])
    && isset($form['region']) && !empty($form['region'])
    && isset($form['gender']) && !empty($form['gender'])
) {
    ?>
    <p>Name: <?= $form['name'] ?></p>
    <p>Age: <?= $form['age'] ?></p>
    <p>Region: <?= $form['region'] ?></p>
    <p>Gender: <?= $form['gender'] ?></p>
    <?php
    if (isset($form['hobby']) && !empty($form['hobby']) && count($form['hobby']) > 0) {
        ?><p>Hobby: <?= implode(', ', $form['hobby']) ?> </p><?php
    }
    if (isset($_FILES['avatar']) && !empty($_FILES['avatar'])) {
        $mt = explode(' ', microtime());
        $file_name = intval( $mt[1] * 1E3 ) + intval( round( $mt[0] * 1E3 ) ).'.'.pathinfo($_FILES['avatar']['full_path'])['extension'];
        move_uploaded_file($_FILES['avatar']['tmp_name'],'files/'.$file_name);
        ?><img src="./files/<?=$file_name?>" alt="image" width="100"><?php
    }
} else {
    ?>
    <p>You entered incorrect form, please enter again</p>
    <a href="./login.php">Log In | Sing Up</a>
    <?php
}

?>
</body>
</html>