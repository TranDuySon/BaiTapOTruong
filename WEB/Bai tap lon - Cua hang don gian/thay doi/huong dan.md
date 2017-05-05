copy nhung dong nay vao file lib.php : 

( Bỏ hết, trừ những tham số như này thì gĩư : 

	từ cái :

		// config

				cho tới

		//end db config 

 )




	$hien_loi = false; // hien thi thong bao loi : true / false

		//language 
	require_once( "lang.php" );

	$conn = mysqli_connect( $host, $db_username, $db_password, $db_name);


	//end config 


	if( !$hien_loi ){
		ini_set("display_errors" , 0 );
	}

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

	function login_user($user,$password){

		global $conn;
		$sql = "SELECT id FROM dang_ky WHERE username='{$user}' AND password=('{$password}') ";

		if( $rs = mysqli_query( $conn , $sql) ){
			if( mysqli_num_rows($rs) > 0  ){
				$_SESSION["username"] = $user;
				return true;
			}
		}
		return false;
	};




// lay config theo key trong bang config ;
	function get_config($id){
		global $conn;
		$sql = "SELECT v FROM config WHERE k='{$id}' ";
		if( $rs = mysqli_query( $conn , $sql ) ){
			$content =  mysqli_fetch_array($rs, MYSQLI_ASSOC);
			return $content["v"];
		}
		return false;
	}


	function vnd_format($money){
		return number_format( intval($money) );
	}

	//validate functions 

	function validate_phone($phone){
		$pattern = "/^\+84[0-9]+|[0-9]+$/";
		return preg_match($pattern, $phone);
	}

	function validate_email( $email ){
		$pattern = "/^\S+@gmail\.com|hotmail\.com|yahoo\.com$/";
		return preg_match($pattern, $email);
	}

	function validate_username( $username ){
		$pattern = "/(\s)+/";
		return !preg_match( $pattern, $username );
	}

	function validate_name( $name ){

		return true;
	}

	function validate_password($pass){
		return strlen($pass) > 6 ? true : false;
	}
	//end validate functions 


	function username_exists($username){
		global $conn;
		$sql = "SELECT id FROM dang_ky WHERE username='{$username}' ";
		return  mysqli_num_rows(mysqli_query( $conn , $sql )) > 0  ;
	}

	function email_exists( $email ){
		global $conn;
		$sql = "SELECT id FROM dang_ky WHERE email='{$email}' ";
		return  mysqli_num_rows(mysqli_query( $conn , $sql )) > 0  ;
	}








---



Tạo file login.php ở web root, với nội dung : 

<?php 
	if( empty($_SESSION) ){
		session_start();
	}

	if( !empty( $_SESSION["username"] ) ){
		redirect( "index.php?r=home" );
	} 
?>
<?php require_once("template-parts/head.php");  ?>
<?php require_once("template-parts/header.php");?>
<?php require_once("template-parts/menu.php");?>

<?php require_once("inc/lib.php"); ?>
<body>		
	<!-- start body  -->
		<div class="body">
<?php 

	if(  isset($_POST["submit"])){
		$username = mysqli_real_escape_string($conn, $_POST["username"]);
		$password = mysqli_real_escape_string($conn, $_POST["password"] );

		if( login_user( $username , $password  ) ){
			$_SESSION["username"] = $username;
			redirect("index.php?r=home");
		}else{
			echo alert("Sai mật khẩu hoặc tên tài khoản ! " , "alert-error");
		}
	}
?>
		
			<h2 class="alert alert-success">Bạn cần đăng nhập </h2>
			<div class="form">
				<form  method="post">
				
					<h2>Tên tài khoản</h2>
					<input type="text" name="username" />
					
					<h2>Mật khẩu</h2>
					<input type="password" name="password" class="textarea">


					<br/>
					<input type="submit" name="submit" class="btn btn-submit" value="Đăng nhập"/>
				</form>

			</div><!--form-->

		</div>
	<!-- end body -->


		<!-- start footer -->
		<?php require_once("template-parts/footer.php");?>
		<!-- end footer -->
</body>

</html>


----

Tạo file đăng kí register.php ở web root với nội dung : 

<?php 

	if( $_SERVER["REQUEST_METHOD"] == "POST" ){
		$errors_arr = array();


		$ten = (trim(strip_tags($_POST["ten"]) )) ;
		$email = mysqli_real_escape_string($conn,trim(strip_tags( $_POST["email"] )));
		$username = mysqli_real_escape_string($conn, trim( strip_tags($_POST["username"]) ) ) ;
		$password1 = trim( strip_tags( $_POST["password"] ) );
		$password2 = trim( strip_tags( $_POST["password2"] ) );


		if( empty( $ten ) || !validate_name( $ten ) )  {
			$errors_arr["ten"] = "Tên không được để trống ! ";
		};


		if( empty( $email  ) || !validate_email( $email ) ){
				$errors_arr["email"] = "Email trống hoặc không hợp lệ, chúng tôi chỉ chấp nhận email từ Gmail, Yahoo, hoặc Microsoft mail! ";
		}

		if(  empty( $username ) || !validate_username( $username ) ){
			$errors_arr["username"] = "Tên tài khoản không được để có khoảng trống ";
		}

		if( empty( $password1 ) || empty( $password2 ) || !validate_password( $password1 ) || ( $password1 != $password2  ) ){
			$errors_arr["password"] = "Mật khẩu phải thỏa mãn yêu cầu :  không được để trống, mật khẩu và xác nhận mật khẩu phải giống nhau, mật khẩu phải dài hơn 6 kí tự !  ";
		} 



		if( username_exists($username ) ){
			$errors_arr["username_exists"] = "Tài khoản này đã tồn tại, vui lòng chọn tên tài khoản khác ! " ;
		}


		if(email_exists( $email ) ){
			$errors_arr["email"] = "Email này đã tồn tại, vui lòng chọn email khác !";
		}


		if( empty( $errors_arr ) ){

			$ten = mysqli_real_escape_string($conn, $ten);
			$email = mysqli_real_escape_string($conn, $email);
			$password1 = mysqli_real_escape_string($conn, $password1);
			$username = mysqli_real_escape_string($conn, $username);

			$sql = "INSERT INTO dang_ky( username ,password , email ,ten   )
				    VALUES ( '{$username}' , '{$password1}' , '{$email}' , '{$ten}'  ) ";

			$rs = mysqli_query( $conn , $sql );

			if( $rs  ){
				redirect( "index.php?r=dk&action=complete" );
			}else{
				echo alert(  "Có lỗi xảy ra , vui lòng kiểm tra lại "  . mysqli_error($conn) , "alert-error" );
			}
		}else{
			$str = "Kiểm tra những trường sau  : <br/> " ;
			foreach( $errors_arr as $v ){
				$str .=  "- ". $v . " <br/> ";
			}
			echo $str;
			// 	var_dump( $errors_arr );
		}

	}//post	
 ?>


<div id="contact">
<div class="cart-fill-wrap">

	<?php if( isset($errors_arr) && empty( $errors_arr ) ){
		echo "<h2>Đăng kí thành công ! bây giờ bạn có thể đăng nhập hệ thống ! </h2>"; 						
	}
	?>

	<div class="about-contact">
		<form  method="post" accept-charset="utf-8">
			
		<label>
			Tên của bạn : 
			<input type="text" name="ten" required />
		</label>		

		<label>
		 	Tên đăng nhập
			<input type="text" name="username"  required />
		</label>

		<label>
			
			Mật khẩu : 
			<input type="password" name="password"  required />
		</label>


		<label>
			
		  Nhập lại mật khẩu : 
			<input type="password" name="password2"  required />
		</label>



		<label>
			Địa chỉ email : 
			<input type="text" name="email"  required>
		</label>


		<button type="submit">Đăng ký !  </button>

		</form>
	</div><!-- .cart-fill -->

</div>
</div><!-- #contact -->

<!-- <div class="alert alert-success">
	<p>
		Ngoài bán hoa ra thì chúng tôi còn bán C4 , Lựu đạn,....... và một số vũ khí hóa học khác...
	</p>

	<p>
		© 2016 Shop hoa Thủy Tiên - All Rights Reserved.
Địa chỉ: Shop hoa Thủy Tiên - Tả Thanh Oai - Thanh Trì - Hà Nội.(Xem bản đồ)
Điện thoại: 01674.694.503 - Gmail: ntthuytien1202@gmail.com - Skype: nguyentien171
Thiết kế bởi Nguyễn Thị Thủy Tiên 
	</p>


</div> -->

---

Xóa file index.php cũ đi, ghi đè với nội dung  : 


<?php
 require_once "inc/lib.php"; ?>
<?php require_once("template-parts/head.php");  ?>
<?php require_once("template-parts/header.php");?>
<?php echo("<script>window.homeUrl = '{$home_url}'</script>"); ?>
<?php require_once 'template-parts/menu.php'; ?>
<body>		
	<!-- start body  -->
		<div class="body">

			<?php 
			if( isset($_GET["r"]) ){
				switch( $_GET["r"] ){
					case "single":
						include "template-parts/single.php";
						include "template-parts/body-right.php";
						break;

					case "cart" : 
						include "template-parts/cart/cart.php";
						break;


					case "category" : 
						include "template-parts/category.php";
						break;

						
					case "about":
						include 'about.php';
						break;

					
					case "dk" : 
						include "register.php";
						break;

			
					case "login" :
						include "login.php";
					break;


					default : 
						include 'template-parts/home.php';


				}
			}else

			if( isset($_GET["s"]) ){
				include "template-parts/search.php";
			}else{
				include 'template-parts/home.php';
			}

			?>

		</div>
	<!-- end body -->


		<!-- start footer -->
		<?php require_once("template-parts/footer.php");?>
		<!-- end footer -->
</body>

</html>

----


Vào trong phpmyadmi -> chọn db đang dùng -> ở tab Query -> copy paste cái này vào : 

-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 03, 2017 at 09:52 AM
-- Server version: 5.7.17-0ubuntu0.16.04.2
-- PHP Version: 5.6.30-10+deb.sury.org~xenial+2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tien`
--

-- --------------------------------------------------------

--
-- Table structure for table `dang_ky`
--

CREATE TABLE `dang_ky` (
  `id` int(11) NOT NULL,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(120) COLLATE utf8_unicode_ci NOT NULL,
  `ten` varchar(200) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dang_ky`
--
ALTER TABLE `dang_ky`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dang_ky`
--
ALTER TABLE `dang_ky`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;



--- 

