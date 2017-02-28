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
package OnThi;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Cau2 {

    public static void main(String[] args) {
        //Câu 2: Viết chương trình nhập vào một số các số nguyên và in ra màn hình các số hoàn chỉnh,
        //Biết : Số hoàn chỉnh là số nguyên dương có tổng các ước số bé hơn nó bằng chính nó.
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số ");
        int so = scan.nextInt();
        //check so hoan hao 
        int i = 1;
        int sum = 0;
        while (i < so) {
            if( so % i == 0 ){
                sum += i;
            }
            i++;
        }
        if( sum == so ){
            System.out.println("Đây là số hoàn hảo");
        }else{
            System.out.println("Ko phải số hh ");
        }

    }
}
