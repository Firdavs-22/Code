<?php

namespace vendor;

class View
{
	private $layout;
	private $has_layuot = false;

	public function layout($directory, $file_name)
	{
		$this->layout = 'views/' . $directory . '/' . $file_name . '.php';
		if (file_exists($this->layout)) {
			$this->has_layuot = true;
		} else {
			$this->has_layuot = false;
		}
	}

	public function render($file, $data)
	{
		$url = $_SERVER['REQUEST_URI'];
		$parse_url = explode('/', $url);

		if (isset($parse_url[2]) && !empty($parse_url[2])) {
			$views_folder = $parse_url[2];
		} else {
			$views_folder = 'site';
		}

		extract($data);
		
		ob_start();
		require 'views/' . $views_folder . '/' . $file . '.php';
		$content = ob_get_contents();
		ob_end_clean();

		if ($this->has_layuot) {
			require $this->layout;
		} else {
			echo $content;
		}
	}
}
