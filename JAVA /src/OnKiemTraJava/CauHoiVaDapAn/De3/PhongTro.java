/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
