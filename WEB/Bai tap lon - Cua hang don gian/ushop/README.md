# Làm 1 mạch 6 tiếng, xong :v

###Một số tính năng cơ bản : 
    
- Xem sửa xoá hàng hóa 

- Tính năng đặt hàng 

- Thêm người dùng mới 

- Đăng nhập / tạo người dùng 

- blah blah 
    
    
---


Cái thứ này dùng để làm bài tập thôi, mang ra chạy web thật khả năng cao là bị DDos  sập ngay !!! 


---

### Cấu hình yêu cầu:

- php 5

- mysql

- apache 



---

### Cách cài đặt và sử dụng :


    
- import file `db.php` mẫu vào trong `phpmyadmin` or `mysql`
    
    - Sau đó copy folder code này vào bất kì chỗ nào
    
    - mở lên = trình duyệt web là chạy thôi
    
    - cấu hình database + user trong file  lib.php (  `inc/lib.php`) 
    
    - username : admin | password: admin

- Sửa `home_url` trong file `inc/lib.php` thành địa chỉ url của các thím 

- Tiến hành vào admin sau đó vào sửa giao diện trong phần config -> sửa từng cái

__Hướng dẫn nâng cao để tự viết giao diện home__

 - Trong folder `template-parts` có 1 file là `hơme.php` -> vào đó mà sửa lại các bố cục , blah blah của trang 

 - t có viết 1 hàm tên là `get_config($key)` -> hàm này nhận $key là tên của key trong bảng config trong trang admin, nếu muốn thêm 1 cái gì đó thì vào bảng config này và ấn thêm mới -> muốn gọi cái vừa thêm thì dùng `get_config` rồi truyền tham số là $key của nó vào ! 

- sửa menu thì vào `template-parts/menu.php` 

- các giao diện kiểu trang đơn, trang tóm tắt blah blah thì trong folder `template-parts` ý  
---

### HAVE FUN :)) 



---



#CREDIT

- Design: Tiên điên


- Code: Tớ
 
