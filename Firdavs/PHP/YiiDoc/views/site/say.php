<?php

use yii\helpers\Html;

if (!isset($message) || empty($message))
    $message = '';
?>
<?= 'Hello '.Html::encode($message) ?>
