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
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số phòng cần thêm : ");
        int n = scan.nextInt();
        
        ArrayList <PhongTro>phongTro = new ArrayList(); //  ArrayList <HoGiaDinh> <---- cái <> là ÉP KIỂU, nếu ko ép kiểu thì mặc định ArrayList sẽ chứa Object ( Object là đối tượng base mà mọi đối tượng trong Java đều extends )
        //nhap
        for (int i = 0; i < n; i++) {
            PhongTro khachSan = new PhongTro();
            System.out.println("\t  Nhập thông tin phòng số : " + ( i + 1  ) + "\t ");
            khachSan.nhap(scan);
            phongTro.add(khachSan);
        }
        //in
        for( PhongTro h : phongTro ){
            h.xuat();
        }
    }
}
