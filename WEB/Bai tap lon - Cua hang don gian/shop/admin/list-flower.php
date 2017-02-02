<?php 
	$sql = " SELECT * FROM hoa";
	$rs = mysqli_query($conn, $sql);

	if(  $rs->num_rows <= 0  ){
			echo "<div class='alert alert-error'>Không có hoa trong cửa hàng, vui lòng thêm mới</div>";
			return;
	}
?>

<table class="table">
	<caption class="alert alert-success">Tất cả hoa</caption>
	
	<thead>
		<tr>
			<th>id</th>
			<th>ảnh</th>
			<th>Tên hoa</th>
			<th>giới thiệu</th>
			<th>Danh mục</th>
			<th>Giá tiền</th>
			<th>Sửa</th>
			<th>Xóa</th>
		</tr>
	</thead>

	<tbody>
		<?php 
		$counter = 1 ;
		while( $hoa = mysqli_fetch_array( $rs , MYSQLI_ASSOC ) ):  ?>

		<tr>
			<td><?php echo $counter++;?></td>
			<td>
				<a href="edit-flower.php?id=<?php echo $hoa['id'];?>">
					 <img class="avatar" src="../upload/<?php echo $hoa['avatar'] ?>" title='<?php echo $hoa["name"]; ?>' />
				 </a>
			 </td>
			<td><?php echo $hoa["name"]; ?></td>
			<td><?php echo $hoa["excerpt"];?></td>
			<td><?php echo get_menu_name_by_id($hoa["menu"]) ;?></td>
			<td> <p class="price"><?php echo $hoa["price"];?></p></td> 
            <td><a  onclick='return confirm("Ban thực sự muốn xóa")' href="delete.php?type=flower&id=<?php echo $hoa['id'];?>">xóa</a></td>
			<td><a href="index.php?r=edit-flower&id=<?php echo $hoa['id'];?>">Sửa</a></td>
		</tr>

	<?php endwhile;?>
	</tbody>
</table>