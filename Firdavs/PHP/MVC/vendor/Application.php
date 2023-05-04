<?php

namespace vendor;

class Application
{

    public function run()
    {
        $user_url = $_SERVER['REQUEST_URI'];
        $parse_url = explode('/', $user_url);

        if (isset($parse_url[2], $parse_url[3])) {
            if (!empty($parse_url[2])) {
                $controller_class = ucfirst($parse_url[2]).'Controller';
            } else {
                $controller_class = 'SiteController';
            }
            if (!empty($parse_url[3])) {
                $action_function = $parse_url[3];
            } else {
                $action_function = 'index';
            }
        } else {
            $controller_class = 'SiteController';
            $action_function = 'index';
        }

        $data_get = '';
        if (isset($parse_url[4]) && !empty($parse_url[4])) {
            $data_get = $parse_url[4];
        }

        $controller_file = $controller_class . '.php';
        $controller_directory = 'controllers/' . $controller_file;
        if (file_exists($controller_directory)) {
            require $controller_directory;
            $controller = new $controller_class;
            if (method_exists($controller, $action_function)) {
                $controller->{$action_function}($data_get);
            } else {
                echo '<h1><b>404</b> error page not found</h1>';
                exit();
            }
        } else {
            echo '<h1><b>404</b> error page not found</h1>';
            exit();
        }
    }
}
