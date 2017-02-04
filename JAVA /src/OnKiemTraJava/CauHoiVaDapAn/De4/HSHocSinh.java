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
package OnKiemTraJava.CauHoiVaDapAn.De4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class HSHocSinh {

    ArrayList<HocSinh> listHocSinh = new ArrayList();

    public void themKhachTro(HocSinh n) {
        listHocSinh.add(n);
    }

    public int getSoNguoi() {
        return listHocSinh.size();
    }

    public void nhap(Scanner scan) {
        scan.nextLine();
        System.out.println("*****************************");

        System.out.println("nhập số khách muốn thêm vào phòng : ");
        int soThanhVien = scan.nextInt();

        for (int i = 0; i < soThanhVien; i++) {
            HocSinh n = new HocSinh();
            System.out.println("Khách thứ : " + (i + 1));
            n.nhap(scan);
            listHocSinh.add(n);
        }

        System.out.println("*****************************\n");
    }

    public void xuat() {
        System.out.println("*****************************");
        System.out.println("--- " + getSoNguoi() + " khách --- ");
        for (HocSinh n : listHocSinh) {
            n.xuat();
        }
        System.out.println("*****************************\n");
    }

    void tim() {
        // tim hs nam 1995 + que hn 
        int found  = 0 ;
        for( HocSinh s : listHocSinh  ){
            if( s.namSinh == 1995 && s.queQuan.equals("Hà Nội") ){
                found++;
            }
        }
        System.out.println("Có : " + found + " học sinh thỏa mãn điều kiện sinh năm 1995 và quê ở Hà Nội ! " );
    }

}
