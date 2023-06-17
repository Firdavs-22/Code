<?php

use yii\helpers\Html;
use yii\widgets\ActiveForm;

if (!isset($model) || empty($model)) {
    $model = '';
}
?>

<?php $form = ActiveForm::begin(); ?>

    <?= $form->field($model, 'name')->label('Your name'); ?>

    <?= $form->field($model, 'email')->label('Your email'); ?>

<div class="form-group">
    <?= Html::submitButton('Send',[
        'class' => 'btn btn-primary'
    ]);?>
</div>

<?php ActiveForm::end(); ?>
