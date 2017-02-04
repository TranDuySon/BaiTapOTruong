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
package OnKiemTraJava.CauHoiVaDapAn.De1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class D1C1_TuyenSinh {

    public D1C1_TuyenSinh() {
    }

    private ArrayList<D1C1_Base> listThiSinh = new ArrayList();

    public void nhap(Scanner scan) {
        scan.nextLine();
        System.out.println("Nhập khối thi :(A|B|C) ");
        String khoiThi = scan.nextLine();
        switch (khoiThi) {
            case "A":
                D1C1_A a = new D1C1_A();
                a.nhap(scan);
                listThiSinh.add(a);
                break;

            case "B":
                D1C1_B b = new D1C1_B();
                b.nhap(scan);
                listThiSinh.add(b);

                break;

            default:
                System.out.println("Khoi thi nhap : " + khoiThi);
                D1C1_C c = new D1C1_C();
                listThiSinh.add(c);
                c.nhap(scan);

        }

    }

    public void xuat() {
        for (D1C1_Base ts : listThiSinh) {
            ts.xuat();
        }
    }

    public void timKiem(Scanner scan) {
        String sbd = scan.nextLine();
        for (D1C1_Base ts : listThiSinh) {
            if (ts.Sbd.equals(sbd)) {
                ts.xuat();
                break; //tim duoc roi thi dung vong for lai ! 
            }
        }
        //neu ko tim thay 
        System.out.println("Không tim thấy thí sinh với mã : " + sbd );
    }

}
