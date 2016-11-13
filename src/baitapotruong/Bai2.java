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
