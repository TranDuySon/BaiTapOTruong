/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnKiemTraJava.CauHoiVaDapAn.De2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số hộ  muốn thêm : ");
        int n = scan.nextInt();
        
        ArrayList <KhachTro>cacHoGiaDinh = new ArrayList(); //  ArrayList <HoGiaDinh> <---- cái <> là ÉP KIỂU, nếu ko ép kiểu thì mặc định ArrayList sẽ chứa Object ( Object là đối tượng base mà mọi đối tượng trong Java đều extends )
        //nhap
        for (int i = 0; i < n; i++) {
            KhachTro hoGiaDinh = new KhachTro();
            System.out.println("\t  Nhập thông tin hộ dân số : " + ( i + 1  ) + "\t ");
            hoGiaDinh.nhap(scan);
            cacHoGiaDinh.add(hoGiaDinh);
        }
        //in
        for( KhachTro h : cacHoGiaDinh ){
            h.xuat();
        }
    }
}
