			<div class="block-body">
				<div class="block-body-title">
					<h2>Sản phẩm tiêu biểu</h2>
				</div>
				
				<div class="block-body-list">
					<ul>
					<?php 
						$rs = mysqli_query( $conn , "SELECT * FROM hoa" );
						while(  $r = mysqli_fetch_array($rs, MYSQLI_ASSOC) ):
					?>
						
						
						<li>	
							<div class="block-body-item">
								<img src="upload/<?php echo $r["avatar"] ?>" title="<?php echo $r["name"];?>" alt="<?php echo $r["name"]; ?>" style="width=100% ; max-width:200px ; height:auto ; display:block "  />
									
									<p class="block-body-title">
										<a href="index.php?r=single&id=<?php echo $r['id'];?>"><?php echo $r["name"];?></a>
									</p>
									
									<p> 
										<?php echo $r["excerpt"];?>
									</p>
									<p>
										</br><a href="index.php?r=cart&action=add&id=<?php echo $r['id']; ?>"><?php echo $r["price"];?></a>
									</p>
									<p class="block-body-button-tieu-bieu">
										<a href="index.php?r=cart&action=add&id=<?php echo $r['id']; ?>">Mua ngay</a>
									</p>
							</div>
						</li>

					<?php endwhile;?>


						
					</ul>
					
				</div><!-- end .block-body-list -->
			</div><!-- end .block-body -->
		
