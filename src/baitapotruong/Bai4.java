/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapotruong;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập độ dài dãy n : ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += 1 / i;
        }
        System.out.println("tong : " + tong);
    }
}
