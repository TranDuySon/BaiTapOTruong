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
package OnKiemTraJava.CauHoiVaDapAn.De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class QLCB {

    public ArrayList<CanBo> canBoArr = new ArrayList();

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Chọn loại cán bộ cần thêm : ");
            System.out.println("1 - Công nhân");
            System.out.println("2 - Kĩ sư");
            System.out.println("3 - Nhân viên");
            System.out.println("4 - Về màn hình chính ");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    CongNhan c = new CongNhan();
                    c.nhap();
                    canBoArr.add(c);
                    break;

                case 2:
                    KySu ks = new KySu();
                    ks.nhap();
                    canBoArr.add(ks);
                    break;

                case 3:
                    NhanVien nv = new NhanVien();
                    nv.nhap();
                    canBoArr.add(nv);
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("chọn sai cmnr, chọn lại đê ! ");

            }
        }
    }// nhap

    public void tim() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên cán bộ cần tìm : ");
        String name = scan.nextLine();

        System.out.println("Danh sách cán bộ có tên : " + name);
        for (CanBo c : canBoArr) {
            if (c.hoTen.equals(name)) {
                c.xuat();
            }
        }
    }//tim 

    public void xuat() {
        System.out.println("Danh sách thông tin toàn bộ cán bộ : ");
        for (Object o : canBoArr) {
            switch (o.getClass().getSimpleName()) {
                case "CongNhan":
                    CongNhan cn = (CongNhan) o;
                    cn.xuat();
                    break;

                case "KySu":
                    KySu ks = (KySu) o;
                    ks.xuat();
                    break;

                case "NhanVien":
                    NhanVien nv = (NhanVien) o;
                    nv.xuat();
                    break;
            }
        }
    }//xuat

    public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n Chọn hành động : ");
            System.out.println("1 - Nhập thông tin mới cho cán bộ ");
            System.out.println("2 - Tìm kiếm theo họ tên");
            System.out.println("3 - Hiển thị thông tin về danh sách các cán bộ");
            System.out.println("4 - Thoát");
            
            int choose = s.nextInt();
            switch( choose  ){
                case 1 : 
                    ql.nhap();
                    break;
                    
                case 2 : 
                    ql.tim();
                    break;
                    
                case 3 : 
                    ql.xuat();
                    break;
                    
                case 4 :
                    System.out.println("U cant run forever, i will find you........~~~");
                    break;
                    
                default :
                    System.out.println("chọn sai rồi :| ");
            }
        }
    }
}
