<?php

use yii\helpers\Html;

if (!isset($model) || empty($model)) {
    $model = '';
}
?>

<p>You are entered this Information:</p>

<ul>
    <li>
        <label>Name</label>: <?= Html::encode($model->name) ?>
    </li>
    <li>
        <label>Email</label>: <?= Html::encode($model->email) ?>
    </li>
</ul>