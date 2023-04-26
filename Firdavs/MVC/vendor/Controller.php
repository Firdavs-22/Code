<?php

namespace vendor;

use vendor\View;

class Controller
{
    private $view;
    public $layout_directory = 'layouts';
    public $layout = 'main'; 

	public function __construct(){
		$this->view = new View();
	}

    public function render($file_name = 'index',$data = [])
    {
        $this->view->layout($this->layout_directory,$this->layout);
        $this->view->render($file_name,$data);
    }
}

?>