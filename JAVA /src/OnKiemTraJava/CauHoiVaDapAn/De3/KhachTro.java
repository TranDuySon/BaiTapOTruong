/* 
 * Copyright (C) 2017 Cường <duongcuong96 at gmail dot com>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
// Đại khái là dùng thoải mái đuê :3 , cái này t code ở mức chạy dc thôi chứ ko bắt exception đâu, cho nhanh =))
package OnKiemTraJava.CauHoiVaDapAn.De3;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class KhachTro {

    String hoTen;
    String cmt;
    int tuoi;
    int namSinh;

    public void nhap(Scanner scan) {
        scan.nextLine(); // bỏ qua dòng đầu tiên cho chắc :)) 
        System.out.print("Nhập họ tên :");
        hoTen = scan.nextLine();
        System.out.print("Nhập tuổi : ");
        tuoi = scan.nextInt();
        System.out.print("Nhập năm sinh: ");
        namSinh = scan.nextInt();
        System.out.print("nhập CMT : ");
        scan.nextLine(); // sử dụng nextLine ở đây để skip 1 dòng !! Vì  .nextInt ( cũng như các thể loại next khác ( next , nextInt , nextFloat .... ) trừ nextLine ra  ) ko tạo 1 kí tự đánh dấu dòng mới -> nextLine sử dụng luôn dòng mới vừa nhập -> nên phải skip nextLine 1 dòng ! 
        cmt = scan.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + hoTen + " | tuổi: " + tuoi + " | Năm sinh: " + namSinh + " | CMT : " + cmt);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            KhachTro n = new KhachTro();
            n.nhap(scan);
        }
    }
}
