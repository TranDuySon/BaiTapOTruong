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