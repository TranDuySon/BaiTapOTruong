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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soPhut = 0 ;
        long tongTien = 0 ;
        System.out.println("Nhập số phút gọi : ");
        soPhut = scan.nextInt();
        
        for(int i = 0 ; i < soPhut ; i++){
            tongTien += i * 120;
            if( i >= 201 && i <= 400){
                tongTien += i * 80;
            }
            if( i >= 401 ){
                tongTien += i * 40;
            }
        }
        System.out.println("Số phút gọi : " +  soPhut + " | Số tiền phải trả là : " + tongTien + "vnd" );
    }
    
}
