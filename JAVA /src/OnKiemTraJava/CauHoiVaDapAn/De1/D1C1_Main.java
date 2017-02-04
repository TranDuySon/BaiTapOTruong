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

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class D1C1_Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thí sinh dự thi : ");
        int n = scan.nextInt();
        D1C1_TuyenSinh tuyenSinh = new D1C1_TuyenSinh();
        //nhap n 
        for (int i = 0; i < n; i++) {
            tuyenSinh.nhap(scan);
        }

        //in ra toan bo thi sinh : 
        tuyenSinh.xuat();
        
        //tim kiem theo ma so : 
        tuyenSinh.timKiem(scan);
        
        //CÁI ĐỀ DỞ HƠI, CÂU B Ý 1 THÌ BẢO HIỂN THỊ THÔNG TIN CỦA 1 THÍ SINH, Ý 2 THÌ LẠI BẢO TÌM THÍ SINH THEO SBD !? -> CLGV ? CHỈ CÓ 1 THÍ SINH THÌ TÌM THEO SBD LÀM GÌ :| 
        

    }
}
