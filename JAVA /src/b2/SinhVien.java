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
package b2;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class SinhVien {

    String msv;
    String ten;
    String Atm;
    int tuoi;

    public SinhVien() {

    }

    public SinhVien(String msv, String ten, String Atm, int tuoi) {
        this.msv = msv;
        this.ten = ten;
        this.Atm = Atm;
        this.tuoi = tuoi;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setAtm(String Atm) {
        this.Atm = Atm;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getAtm() {
        return Atm;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        System.out.println("-------------------");
        System.out.println("Tuổi sv : " + this.tuoi);
        System.out.println("Tên sv: " + this.ten);
        System.out.println("Msv : " + this.msv);
        System.out.println("atm : " + this.msv);
        System.out.println("-------------------");

        return "";
    }

    public void nhap(Scanner scan) {
        
        System.out.println("Nhâp tuổi sv " );
        this.tuoi = scan.nextInt();
        System.out.println("Nhập tên sv : " );
        this.ten = scan.next().toString();
        scan.nextLine();
        System.out.println("Nhập msv ");
        this.msv = scan.nextLine().toString();
        System.out.println("nhập atm : ");
        this.Atm = scan.nextLine();
        
    }
}
