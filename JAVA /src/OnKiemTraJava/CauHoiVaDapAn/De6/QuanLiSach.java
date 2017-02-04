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

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class QuanLiSach {

    public ArrayList<TaiLieu> taiLieuArr = new ArrayList();

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n Chọn loại tài liệu múôn nhập : ");
            System.out.println("1 - Báo ");
            System.out.println("2 - Sách");
            System.out.println("3 - Tạp chí ");
            System.out.println("4 - Thoát về màn hình chính");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    Bao b = new Bao();
                    b.nhap();
                    taiLieuArr.add(b);
                    break;

                case 2:
                    Sach s = new Sach();
                    s.nhap();
                    taiLieuArr.add(s);
                    break;

                case 3:
                    TapChi t = new TapChi();
                    t.nhap();
                    taiLieuArr.add(t);
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("chọn lại đi !");
            }
        }
    }

    public void xuat() {
        System.out.println("Thông tin của toàn bộ tài liệu : ");
        for (Object t : taiLieuArr) {
            switch (t.getClass().getSimpleName()) { //lấy tên class !! 
                case "Bao":
                    Bao b = (Bao) t; //ép kiểu 
                    b.xuat();
                    break;

                case "Sach":
                    Sach s = (Sach) t;
                    s.xuat();
                    break;

                case "TapChi":
                    TapChi tc = (TapChi) t;
                    tc.xuat();
                    break;
            }
        }
    }

    public void tim() {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n Chọn loại tài liệu múôn tìm  : ");
            System.out.println("1 - Báo ");
            System.out.println("2 - Sách");
            System.out.println("3 - Tạp chí ");
            System.out.println("4 - Thoát về màn hình chính");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Tất cả Báo ");
                    locTheoLoai("Bao");
                    break;

                case 2:
                    System.out.println("Tất cả Sách ");
                    locTheoLoai("Sach");
                    break;

                case 3:
                    System.out.println("Tất cả tạp chí: ");
                    locTheoLoai("TapChi");
                    break;

                case 4:
                    running = false;

            }
        }
    }

    public void locTheoLoai(String className) {
        for (Object t : taiLieuArr) {
            switch (className) { //lấy tên class !! 
                case "Bao":
                    Bao b = (Bao) t; //ép kiểu 
                    b.xuat();
                    break;

                case "Sach":
                    Sach s = (Sach) t;
                    s.xuat();
                    break;

                case "TapChi":
                    TapChi tc = (TapChi) t;
                    tc.xuat();
                    break;
                    
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        QuanLiSach ql = new QuanLiSach();

        while (running) {
            System.out.println("\n Chọn hành động: ");
            System.out.println("1 - nhập thông tin  ");
            System.out.println("2 - hiển thị thông tin ");
            System.out.println("3 - Tìm kiếm theo loại ");
            System.out.println("4 - Thoát ");

            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    ql.nhap();
                    break;

                case 2:
                    ql.xuat();
                    break;

                case 3:
                    ql.tim();
                    break;

                case 4:
                    System.out.println("Chúc bé ngủ ngon :)) ");
                    running = false;
            }
        }
    }
}
