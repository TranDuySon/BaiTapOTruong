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
package OnKiemTraJava.CauHoiVaDapAn.De5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    public static void main(String[] args) {
        //khai báo 
        Scanner scan = new Scanner(System.in);
        ArrayList<SinhVien> svArr = new ArrayList();

        //chạy
        boolean running = true;
        while (running) {
            System.out.println("Chọn công việc cần thực hiện, bấm số tương ứng !  ");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Hiển thị");
            System.out.println("3. Sắp xếp Theo điểm tích lũy giảm dần ");
            System.out.println("4. Thoát ");
            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    //nhap du lieu 
                    System.out.println("Nhập số sinh viên cần thêm : ");
                    int soSv = scan.nextInt();
                    for (int i = 0; i < soSv; i++) {
                        SinhVien s = new SinhVien();
                        s.nhapDuLieu();
                        svArr.add(s);
                    }
                    break;

                case 2:
                    //hien thi du lieu : 
                    System.out.println("\t Hiển thị tất cả " + svArr.size() + " Sinh viên: ");
                    for (SinhVien s : svArr) {
                        s.hienThi();
                    }
                    break;

                case 3:
                    System.out.println("\t Số sinh viên lúc chưa sắp xếp theo điểm tích lũy giảm : ");
                    for (SinhVien s : svArr) {
                        s.hienThi();
                    }
                    
                    System.out.println("--------------------------------------------------------------------------------------");

                    System.out.println("\t Số sinh viên sắp xếp theo điểm tích lũy giảm ( dùng bb sort huyền cmn thoại :))  )");
                    for (int i = 0; i < svArr.size() - 1; i++) {
                        for (int j = i + 1; j < svArr.size(); j++) {
                            if (svArr.get(i).getDiemTl() > svArr.get(j).getDiemTl()) {
                                SinhVien tmp = svArr.get(i); // get object o index thu i cho vao tmp 
                                svArr.set(i, svArr.get(j)); // set object o index thu i thanh object o index thu j 
                                svArr.set(j, tmp); // hoàn thành việc tráo
                            }
                        }
                    }
                    for (SinhVien s : svArr) {
                        s.hienThi();
                    }
                    break;

                case 4:
                    System.out.println("Bye~");
                    running = false;
                    break;

                default:
                    System.out.println(" \n === Chọn sai cmnr , chọn lại đuê, chọn hẳn hoi :| === \n  ");
            }//end switch case 
        }//end while 
    }

}
