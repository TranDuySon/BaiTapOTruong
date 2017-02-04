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
package OnKiemTraJava.CauHoiVaDapAn.De10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<BienLai> bienLaiArr = new ArrayList();
        Scanner scan = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n Chọn hành động : ");
            System.out.println("1 - Nhập thông tin hộ sử dụng điện");
            System.out.println("2 - Hiển thị thông tin về các biên lai ");
            System.out.println("3 - Tính tiền điện của mỗi hộ ");
            System.out.println("4 - Thoát");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\n  Nhập số biên lai muốn thêm : ");
                    int n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Biên lai : " + (i + 1));
                        BienLai bl = new BienLai();
                        bl.nhap();
                        bienLaiArr.add(bl);
                    }
                    break;

                case 2:
                    System.out.println("\n  Thông tin về " + bienLaiArr.size() + " biên lai đã nhập");
                    for (BienLai b : bienLaiArr) {
                        b.inThongTin();
                    }
                    break;

                case 3:
                    System.out.println("\n Tiền điện của " + bienLaiArr.size() + " hộ : ");
                    for (BienLai b : bienLaiArr) {
                        b.inTien();
                    }
                break;
                
                case 4 : 
                    System.out.println("Nu pa ga gi !!~~~");
                    running = false;
                    break;
                    
                default : 
                    System.out.println("Nhập sai cmnr !!! ");
            }
        }
    }
}
