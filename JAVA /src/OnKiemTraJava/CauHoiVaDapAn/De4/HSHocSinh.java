/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
