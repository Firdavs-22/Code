<?php
namespace models;

use vendor\ActiveRecord;

class Users extends ActiveRecord{
	
	public static function tableName(){
        return 'users';
    }
	
}