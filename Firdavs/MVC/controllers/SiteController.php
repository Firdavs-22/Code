<?php

use vendor\Controller;
use vendor\Query;
use models\Users;

class SiteController extends Controller
{
    public function index()
    {   
        $query = new Query();
        // $query->select('fisrname');
        // $this->pre($query);

        // $user = new Users();
        // $user->first_name = 1;
        // $user->last_name = 2;
        // $user->status = 3;
        // $user->save();

        // $user->first_name = 1;
        // $user->save();
        // $stat = Users::find()->where(['static=1','static=2','static=3']);
        // $this->pre($stat);

        $this->render('index',[
            'text' => '1334'
        ]);
    }

    private function pre($die)
    {
        echo '<pre>';
        print_r($die);
        die();
    }
}
