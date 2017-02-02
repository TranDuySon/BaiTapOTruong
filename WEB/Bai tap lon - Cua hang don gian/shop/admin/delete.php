<?php 
	 require_once("../inc/lib.php"); 
	if( !empty( $_GET["type"]  ) && !empty( $_GET["id"] ) && ( is_numeric($_GET["id"]) ) ){
		switch( $_GET["type"] ){
			case "flower":
				$sql = "DELETE FROM hoa WHERE id= {$_GET['id']} ";
				if( mysqli_query($conn, $sql) &&  (mysqli_affected_rows($conn) > 0) ) {
					redirect("index.php?r=list-flower");
				}else{
					echo alert("Xóa thất bại :'( " , "alert-error");
				}
			break;


			case "menu" : 
				$sql = "DELETE FROM menu WHERE id= {$_GET['id']} ";
				if( mysqli_query($conn, $sql) &&  (mysqli_affected_rows($conn) > 0) ){
					redirect("index.php?r=list-menu");	
				}else{
					echo alert("Xóa thất bại :'( " , "alert-error");
				}

			break;


			case "user":
				$sql = "DELETE FROM user WHERE id = {$_GET['id']}";
				if( mysqli_query($conn, $sql) &&  (mysqli_affected_rows($conn) > 0) ){
						redirect("index.php?r=list-user");	
					}else{
						echo alert("Xóa thất bại :'( " , "alert-error");
				}
				break;
		}
	}
?>