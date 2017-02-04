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
package OnKiemTraJava.CauHoiVaDapAn.De8;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    public static void main(String[] args) {
        float tongLuong = 0;

        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Chọn hành động : ");
            System.out.println("1 - nhập nhân viên văn phòng ");
            System.out.println("2 - nhập nhân viên sản xuất ");
            System.out.println("3 - Xem tổng lương nhân viên");
            System.out.println("4 - Thoát ");
            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    NhanVienVanPhong vp = new NhanVienVanPhong();
                    vp.nhap();
                    tongLuong += vp.luong + vp.luongNghiViec;
                    break;

                case 2:
                    NhanVienSanXuat sx = new NhanVienSanXuat();
                    sx.nhap();
                    tongLuong += sx.luong;
                    break;

                case 3 : 
                    double luong = Math.round( tongLuong * 100  )/100; // lay 2 so thap phan cuoi
                    System.out.println("Tổng lương toàn bộ nhân viên ( làm tròn lấy 2 chữ số thập phân ) : " + luong );
                    
            }
        }
    }
}
