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
