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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class D1C1_Base {

    public String Sbd;
    public String HoTen;
    public String DiaChi;
    public boolean uuTien;
    public String khoiThi;

    public D1C1_Base() {

    }

    public void nhap(Scanner scan) {
        System.out.println("--------------------------------------");
        System.out.println("\t \t Nhập thông tin thí sinh \t \t");
        System.out.print("Nhập số báo danh : ");
        Sbd = scan.nextLine();
        System.out.print("Nhập họ tên : ");
        HoTen = scan.nextLine();
        System.out.print("Nhập địa chỉ : ");
        DiaChi = scan.nextLine();
        System.out.print("Có là đối tượng ưu tiên ?, nhập 'y' để đồng ý, `n` để hủy  ");
        String isUuuTien = scan.nextLine();
        this.uuTien = isUuuTien.equals("y");
        System.out.println("------------------------------------- \n");
        
    }

    public void xuat() {
        System.out.println("--------------------------------------");
        System.out.println("Thông tin của thí sinh : " + this.HoTen);
        System.out.println("Khối thi: " + this.khoiThi);
        System.out.println("Số báo danh: " + this.Sbd);
        System.out.println("Địa chỉ : " + this.DiaChi);
        System.out.println("Thuộc đối tượng ưu tiên : " + (this.uuTien ? "có " : "không "));
        System.out.println("--------------------------------------\n");

    }
}
