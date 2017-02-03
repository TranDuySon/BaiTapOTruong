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
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số phòng cần thêm : ");
        int n = scan.nextInt();

        //nhap
        HSHocSinh hsHocSinh = new HSHocSinh();
        hsHocSinh.nhap(scan);
        //in
        hsHocSinh.xuat();
        
        //tim sn 1995 + que hn 
        hsHocSinh.tim();
        
    }
}
