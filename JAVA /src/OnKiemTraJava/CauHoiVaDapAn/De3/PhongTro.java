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

import OnKiemTraJava.CauHoiVaDapAn.De2.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class PhongTro {

    ArrayList<KhachTro> khachTro = new ArrayList();

    public void themKhachTro(KhachTro n) {
        khachTro.add(n);
    }

    public int getSoNguoi() {
        return khachTro.size();
    }

    public void nhap(Scanner scan) {
        scan.nextLine();
        System.out.println("*****************************");

        System.out.println("nhập số khách muốn thêm vào phòng : ");
        int soThanhVien = scan.nextInt();

        for (int i = 0; i < soThanhVien; i++) {
            KhachTro n = new KhachTro();
            System.out.println("Khách thứ : " + (i + 1));
            n.nhap(scan);
            khachTro.add(n);
        }

        System.out.println("*****************************\n");
    }

    public void xuat() {
        System.out.println("*****************************");
        System.out.println("--- " + getSoNguoi() + " khách --- ");
        for (KhachTro n : khachTro) {
            n.xuat();
        }
        System.out.println("*****************************\n");
    }

}
