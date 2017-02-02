/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnKiemTraJava.CauHoiVaDapAn;

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
