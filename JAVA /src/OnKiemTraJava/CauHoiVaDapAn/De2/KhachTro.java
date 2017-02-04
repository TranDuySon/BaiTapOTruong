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
