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
package OnKiemTraJava.CauHoiVaDapAn.De9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<PhieuMuon> phieuMuonArr = new ArrayList();
        Scanner scan = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n Chọn hành động : ");
            System.out.println("1 - Nhập thông phiếu mượn mới");
            System.out.println("2 - Hiển thị thông tin về các phiếu");
            System.out.println("3 - Thoát");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số phiếu cần thêm : ");
                    int n = scan.nextInt();
                    for (int i = 0; i < n; i++) {
                        PhieuMuon pm = new PhieuMuon();
                        System.out.println("--- PHiếu thứ : " + (i+1) + "---");
                        pm.nhap();
                        phieuMuonArr.add(pm);
                        System.out.println("----------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("Hiển thị toàn bô  " + phieuMuonArr.size() + " phiếu : ");
                    for (PhieuMuon pm : phieuMuonArr) {
                        pm.xuat();
                    }
                    break;

                case 3:
                    System.out.println("Gút bai !!! ~~~");
                    running = false;
                    break;

                default:
                    System.out.println("chọn lại đi, sai cmnr !");
            }
        }//whiel
    }
}
