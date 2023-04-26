<?php

namespace vendor;

use vendor\Connection;

class Query
{
    public $conn;
    public $query = '';

    public function __construct()
    {
        $this->conn = (new Connection)->getConnection();
        return $this;
    }

    public function select($select)
    {
        if (is_string($select)) {
            $this->query .= 'SELECT ' . $select . ' ';
            return $this;
        } elseif (is_array($select)) {
            $select_count = count($select);
            if ($select_count != 0) {
                $count_for = 0;
                $parsed_select = '';
                foreach ($select as $key => $value) {
                    if (is_int($key)) {
                        if (is_object($value)) {
                            if (isset($value->query)) {
                                $parsed_select .=  '(' . $value->query . ') ';
                            } else {
                                echo 'Unexpected object';
                                exit();
                            }
                        } else {
                            $parsed_select .=  $value . ' ';
                        }
                    } else {
                        if (isset($value->query)) {
                            $parsed_select .=  '(' . $value->query . ') AS ' . $key;
                        } else {
                            $parsed_select .=  $value . ' AS ' . $key . ' ';
                        }
                    }
                    $count_for++;
                    if ($select_count != $count_for) {
                        $parsed_select .= ',';
                    }
                }
                $this->query .= 'SELECT ' . $parsed_select;
            } else {
                echo 'Unexpected value in array';
                exit();
            }
            return $this;
        } else {
            echo 'Unexpected type in select: ' . gettype($select);
            exit();
        }
    }

    public function from($from)
    {
        return $this;
    }
}
