/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnKiemTraJava.CauHoiVaDapAn.De2;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Nguoi {

    String hoTen;
    String ngheNghiep;
    int tuoi;
    int namSinh;

    public void nhap(Scanner scan) {
        scan.nextLine(); // bỏ qua dòng đầu tiên cho chắc :)) 
        System.out.print("Nhập họ tên :");
        hoTen = scan.nextLine();
        System.out.print("Nhập tuổi : ");
        tuoi = scan.nextInt();
        System.out.print("Nhập năm sinh: ");
        namSinh = scan.nextInt();
        System.out.print("nhập nghề nghiệp : ");
        scan.nextLine(); // sử dụng nextLine ở đây để skip 1 dòng !! Vì  .nextInt ( cũng như các thể loại next khác ( next , nextInt , nextFloat .... ) trừ nextLine ra  ) ko tạo 1 kí tự đánh dấu dòng mới -> nextLine sử dụng luôn dòng mới vừa nhập -> nên phải skip nextLine 1 dòng ! 
        ngheNghiep = scan.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + hoTen + " | tuổi: " + tuoi + " | Năm sinh: " + namSinh + " | nghề nghiệp: " + ngheNghiep);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Nguoi n = new Nguoi();
            n.nhap(scan);
        }
    }
}
