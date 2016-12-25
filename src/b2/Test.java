/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số sinh viên : ");
        int n = scan.nextInt();
        SinhVien[] arr = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ : " + (i + 1));
            SinhVien sv = new SinhVien();
            sv.nhap(scan);
            arr[i] = sv;
        }

        //buble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].tuoi > arr[j].tuoi) {
                    SinhVien tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }//bub

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ : " + (i + 1));
            arr[i].toString();
        }

    }
}
