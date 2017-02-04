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
package OnKiemTraJava.CauHoiVaDapAn.De6;

import java.util.Scanner;

/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class TaiLieu {
    private String maTaiLieu ; 
    private String tenNhaXuatBan ; 
    private int soBanPhatHanh;

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu: " );
        maTaiLieu = scan.nextLine();
        System.out.println("nhập tên nhà xuất bản : ");
        tenNhaXuatBan = scan.nextLine();
        System.out.println("Nhập số bản phát hành : ");
        soBanPhatHanh = scan.nextInt();
    }
    
    public void xuat(){
        System.out.println("Mã tài liệu : " + maTaiLieu  +"| tên nhà xuất bản: " + tenNhaXuatBan +"| số bản phát hành: " + soBanPhatHanh);
    }
    
    
    
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public double getSoBanPhatHanh() {
        return soBanPhatHanh;
    }
    
    
}
