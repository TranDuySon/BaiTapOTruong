/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapotruong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        System.out.println("Nhập vào 1 dãy số , kêt thúc khi bạn nhập số 0 ");

        boolean isNext = true;

        while (isNext) {
            System.out.println("Nhập số : ");
            int n = scan.nextInt();
            if( n == 0 ) isNext = false;
            arr.add(n);
        }
        int tong = 0;

        for (int i = 0; i < arr.size(); i++) {
            tong += arr.get(i);
        }
        System.out.println("trung binh cong day so : " + (tong / arr.size()));
        Collections.sort(arr);
        System.out.println("Số lớn nhất : " + arr.get(arr.size() - 1));
        System.out.println("Số bé nhất : " + arr.get(0));
    }
}
