<?php

use telegram\Telegram;

require 'Telegram.php';

$tel = new Telegram('12', []);

echo '<pre>';
print_r($tel);
echo '</pre>';

