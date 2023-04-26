<?php

namespace vendor;

class Connection
{
    public $conn;

    public function __construct()
    {
        $db = require 'config/db.php';

        try {
            $db_conn = new \PDO($db['dsn'].';charset='.$db['charset'], $db['username'], $db['username']);
            $this->conn = $db_conn;
        } catch (\PDOException $e) {
            echo 'Connection to db failed: ' . $e->getMessage();
            exit();
        }
    }

    public function getConnection()
    {
        return $this->conn;
    }
}