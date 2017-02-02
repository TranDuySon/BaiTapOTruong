<?php require_once("../inc/lib.php"); ?>

<?php require_once("template-parts/head.php");  ?>
<?php require_once("template-parts/header.php");?>
<?php require_once("template-parts/menu.php");?>
<body>		
	<!-- start body  -->
		<div class="body">

		<?php 		
		if( !logged_in() )
			redirect("login.php?r=login");

		if( isset( $_GET["r"] ) )
					switch( $_GET["r"] ){
						case "add-flower":
						include_once 'add-flower.php';
						break;

						case "add-menu":
						include_once "add-menu.php";
						break;



						case "edit-flower":
						include_once "edit-flower.php";
						break;

						case "edit-menu":
						include_once 'edit-menu.php';


						case "delete":
						include_once 'delete.php';
						break;

						case "list-flower":
						include "list-flower.php";
						break;

						case "list-menu":
						include 'list-menu.php';
						break;

						case "list-user" : 
							include("list-user.php");
							break;

						case "edit-user":
							include("edit-user.php");
						break;

						case "add-user":
						include 'add-user.php';
						break;



						case "login":
						include 'login.php';
						break;

						case "logout":
							if(!empty($_SESSION))
							session_destroy();
						include "login.php";
						break;



						default:
						include_once 'list-flower.php';
					}
			else 
				include_once 'list-flower.php';

		?>
		</div>
	<!-- end body -->


		<!-- start footer -->
		<?php require_once("template-parts/footer.php");?>
		<!-- end footer -->
</body>

</html>
