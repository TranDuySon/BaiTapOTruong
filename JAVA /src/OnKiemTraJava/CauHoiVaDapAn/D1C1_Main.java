/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnKiemTraJava.CauHoiVaDapAn;

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
