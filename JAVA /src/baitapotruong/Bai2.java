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

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Giải phương trình ax^2 + bx + c  = ");
        System.out.println("nhập số a : ");
        float a = scan.nextFloat();
        System.out.println("nhập số b : ");
        float b = scan.nextFloat();
        System.out.println("Nhập số c : ");
        float c = scan.nextFloat();
        float delta = (b * b) - (4 * a * c);
        float sqrtDelta = sqrtDelta = (float) Math.sqrt(delta);
        System.out.println("delta: " + delta);

        if (sqrtDelta > 0) {

            System.out.println("PHương trình có 2 nghiệm phân biệt x1 và x2 : ");
            System.out.println("x1: " + (-b + sqrtDelta) / 2 * a + "| x2: " + (b + sqrtDelta) / 2 * a);
        } else if (sqrtDelta == 0) {
            System.out.println("PHương trinhf có nghiệm kép : ");
            System.out.println("x1 = x2 = " + (-b / 2 * a));
        } else {
            System.out.println("PHương trình vô nghiệm :( ");
        }

    }
}
