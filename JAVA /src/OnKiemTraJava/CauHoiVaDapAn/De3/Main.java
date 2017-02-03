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
