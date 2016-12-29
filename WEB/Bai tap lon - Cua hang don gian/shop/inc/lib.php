<?php 
	//config 
	
	$host = "localhost";
	$db_username = "root";
	$db_password = "root"; 
	$db_name = "tien"; //database name


	$conn = mysqli_connect("localhost", "root", "root", "tien");

	if( !$conn ){
		echo "<h1>Có lỗi xảy ra khi kết nối db </h1>";
		die;
	}else{
		mysqli_set_charset($conn, "utf8");
	}

	function alert($content , $type= "alert-success"){
		return "<div class='alert {$type}'>{$content}</div>";
	}

	function redirect($url){
		return header("Location: " . $url);
	}

	function get_menu_name_by_id($id){
		global $conn;
		$rs = mysqli_query($conn,  "SELECT name FROM menu WHERE id = {$id} ");
		$name =  mysqli_fetch_object($rs);
		if (!empty($name->name) ){
			return $name->name;
		}else{
			return "---";
		}
	}

	function logged_in(){
		return empty($_SESSION["username"]) ? false : true;
	}

	function login($user,$password){

		global $conn;
		$sql = "SELECT id FROM user WHERE username='{$user}' AND password=md5('{$password}') ";

		if( $rs = mysqli_query( $conn , $sql) ){
			if( mysqli_num_rows($rs) > 0  ){
				$_SESSION["username"] = $user;
				return true;
			}
		}
		return false;
	}

	function vnd_format($money){
		return number_format( intval($money) );
	}


?>