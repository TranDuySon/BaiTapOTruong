/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OnKiemTraJava.CauHoiVaDapAn.De2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class KhachTro {
   ArrayList <Nguoi>thanhVien = new ArrayList() ; 
   int soNha;
   

   public void themThanhVien(Nguoi n){
       thanhVien.add(n);
   }
    
   public int getSoNguoi(){
       return thanhVien.size();
   }
   
   public int getSoNha(){
       return soNha;
   }
   
   public void nhap(Scanner scan){
       scan.nextLine();
       System.out.println("*****************************");
       System.out.print("nhập số nhà : ");
       soNha = scan.nextInt();
       
       System.out.println("nhập số thành viên muốn thêm : ");
       int soThanhVien = scan.nextInt();
       
       for( int i = 0 ; i < soThanhVien ; i++ ){
          Nguoi n = new Nguoi();
           System.out.println("Thành viên thứ : "  + ( i + 1  ));
          n.nhap(scan);
          thanhVien.add(n);
       }
       
       System.out.println("*****************************\n");
   }
   
   public void xuat(){
       System.out.println("*****************************");
       System.out.println("Hộ gia đình số : " + soNha);
       System.out.println( "--- " + getSoNguoi() + " thành viên --- " );
       for( Nguoi n : thanhVien ){
           n.xuat();
       }
       System.out.println("*****************************\n");
   }
   
}
