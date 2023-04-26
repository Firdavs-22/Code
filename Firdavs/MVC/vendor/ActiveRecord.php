<?php

namespace vendor;

use vendor\Query;
use vendor\Connection;

class ActiveRecord
{
	public $conn;
	private $is_saved;

	private $attributies = [];
	
	public $__attributies = [];
	public $find_conndition = [];
	public $binds = [];

	public function __construct($is_saved = false)
	{
		$this->conn = (new Connection)->getConnection();
		$this->is_saved = $is_saved;
		$this->init();
	}

	public static function tableName()
	{
		return '';
	}

	public function __set($name, $value)
	{
		if (isset($this->__attributies[$name])) {
			$this->__attributies[$name] = $value;
		} else {
			if ($this->attributies[$name]) {
				$this->__attributies[$name] = $value;
			}else {	
				echo 'Unexpected propeties: '.$name;
				exit();
			}
		}
	}

	public function __get($name)
	{
		if (isset($this->__attributies[$name])) {
			return $this->__attributies[$name];
		} else {
			if ($this->attributies[$name]) {
				return null;
			}else {
				echo 'Unexpected propeties :' . $name;
				exit();
			}
		}
	}

	public function save()
	{
		$table_name = $this::tableName();
		if ($this->is_saved) {
			$sql = 'UPDATE `' . $table_name . '` SET  ';
		} else {
			$row_name = '';
			$values = '';
			if (isset($this->__attributies) && !empty($this->__attributies)) {
				$last_count = count($this->__attributies);
				$count = 0;
				foreach ($this->__attributies as $key => $value) {
					$count++;
					$row_name .= $key;
					$values .= $value;
					if ($last_count != $count) {
						$row_name .= ' ,';
						$values .= ' ,';
					}
				}
			}
			$sql = 'INSERT INTO `' . $table_name . '` (' . $row_name . ') VALUES (' . $values . ')';
		}
		$prepared_sql = $this->conn->prepare($sql);
		return $prepared_sql->execute();
	}

	public static function find()
	{
		$class_name =  get_called_class();
		$class = new $class_name(true);
		return $class;
	}

	public function where($conn, $bind = false)
	{
		if (is_string($conn)) {
			$this->find_conndition[0] = $conn;
		} elseif (is_array($conn)) {
			if (isset($conn) && !empty($conn)) {
				$count = 0;
				foreach ($conn as $key => $value) {
					if (is_int($key)) {
						// $this->find_conndition[$count] = $conn[1] . $conn[0] . $conn[2];
						// break 1;
						if ($conn[0] == '=') {
						} elseif ($conn[0] == 'and') {
						} elseif ($conn[0] == 'or') {
						} elseif ($conn[0] == 'between') {
						} elseif ($conn[0] == 'not between') {
						} elseif ($conn[0] == 'in') {
						} elseif ($conn[0] == 'not in') {
						} elseif ($conn[0] == 'like') {
						} elseif ($conn[0] == 'or like') {
						} elseif ($conn[0] == 'not like') {
						} elseif ($conn[0] == 'or not like') {
						} elseif ($conn[0] == 'exists') {
						} elseif ($conn[0] == 'not exists') {
						} elseif (preg_match('~^(:?>|>=|<|<=)$~', $conn[0])) {
						} else {
							$this->find_conndition[$count] = $value;
						}
					} else {
						$this->find_conndition[$count] = $key . ' = ' . $value;
					}
					$count++;
				}
			}
		}

		if (is_array($bind)) {
			if (isset($bind) && !empty($bind)) {
				foreach ($bind as $key => $value) {
					$this->binds[$key] = $value;
				}
			}
		}
		return $this;
	}

	private function init()
	{
		$this->setAttributes();
	}

	private function setAttributes()
	{
		if ($this::tableName() != '') {
			try {
				$sql = 'SHOW COLUMNS FROM ' . $this::tableName();
				$prepared_sql = $this->conn->prepare($sql);
				$prepared_sql->execute();

				while ($field = $prepared_sql->fetch(\PDO::FETCH_ASSOC)) {
					$this->attributies[$field['Field']] = $field['Field'];
				}
				return true;
			} catch (\Throwable $e) {
				echo 'Unexpected tablename: ' . $this::tableName();
				exit();
				return false;
			}
		} else {
			echo 'You are no setted table name';
			exit();
			return false;
		}
	}

}
