/* 
 * Copyright (C) 2017 Cường <duongcuong96 at gmail dot com>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
// Đại khái là dùng thoải mái đuê :3 , cái này t code ở mức chạy dc thôi chứ ko bắt exception đâu, cho nhanh =))
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
