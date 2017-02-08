/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_ketNoiSql.Cau1;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Main {

    TuyenSinh tuyenSinh = new TuyenSinh();

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số thí sinh dự thi : ");
        int n = scan.nextInt();

        //nhap n 
        for (int i = 0; i < n; i++) {
            System.out.println("\t Nhập thí sinh thứ :  " + (i + 1));
            tuyenSinh.nhap();
        }
    }

    public void xuat() {
        System.out.println("Thông tin của toàn bộ : " + tuyenSinh.getListThiSinh() + " : ");
        tuyenSinh.xuat();
    }
    
    public void timKiem(){
        tuyenSinh.timKiem();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main m = new Main();
        boolean running = true;
        while (running) {
            System.out.println("\n Chọn hành động muốn thực hiện: ");
            System.out.println("1 - Nhập thông tin thí sinh ");
            System.out.println("2 - Hiển thị tất cả thí sinh ");
            System.out.println("3 - Tìm kiếm thí sinh theo số báo danh ");
            System.out.println("4 - Thoát");

            int choose = scan.nextInt();
            
            switch( choose ){
                case 1 : 
                    m.nhap();
                    break;
                    
                case 2 : 
                    m.xuat();
                   break;
                   
                case 3 : 
                    m.timKiem();
                    break;
                    
                case 4 : 
                    System.out.println("Tạm biệt ~~ ");
                    running = false;
                    break;
                    
                default : 
                    System.out.println("Bạn chọn sai rồi !! ");
            }
        }


    }
}
