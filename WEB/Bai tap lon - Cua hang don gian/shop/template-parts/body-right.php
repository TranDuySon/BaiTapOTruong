

			<div class="body-right">
				<div class="body-right-title">
					<h2>Sản phẩm đã mua</h2>


					<p class="block-body-button">
						<a href="index.php?r=cart&action=checkout">Tiến hành thanh toán</a>
					</p>
				</div>
				
				<?php 
					if( empty( $_SESSION["products"])){
						return;
					}
				?>
				<ul>
					<?php for( $i = 0 ; $i < sizeof($_SESSION["products"]) ; $i++ ):

							$p = $_SESSION["products"][$i];
					?>

					<li>	
						<div class="body-right-item">
							<img src="upload/<?php echo $p['avatar'] ;?>" title="<?php echo $p['name'];?>" alt="<?php echo $p['name'];?>" style="width=100% ; max-width:200px ; height:auto ; display:block "  />
							<p class="body-right-title">
								<a href="index.php?r=single&id=<?php echo $p['id'];?>"><?php echo $p['name'];?></a>
							</p>
							<p> 
								<?php echo $p['excerpt'];?>
							</p>
							<p>
								</br><a href="#"><?php echo $p['price'] . " x " . $p['amount'];?></a>
							</p>
							<p class="block-body-button">
								<a href="index.php?r=cart&action=add&id=<?php echo $p['id'];?>">Mua thêm</a>
							</p>
						</div>
					</li>

				<?php endfor;?>
					
				</ul>
			</div><!---end .body-right-->