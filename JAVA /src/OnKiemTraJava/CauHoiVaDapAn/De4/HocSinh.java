/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnKiemTraJava.CauHoiVaDapAn.De4;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class HocSinh {

    String hoTen;
    String maHs;
    String queQuan;
    int namSinh;

    public void nhap(Scanner scan) {
        scan.nextLine(); // bỏ qua dòng đầu tiên cho chắc :)) 
        System.out.print("Nhập họ tên :");
        hoTen = scan.nextLine();
        System.out.print("Nhập Quê quán : ");
        queQuan = scan.nextLine();
        System.out.print("Nhập năm sinh: ");
        namSinh = scan.nextInt();
        System.out.print("nhập mã hs  : ");
        scan.nextLine(); // sử dụng nextLine ở đây để skip 1 dòng !! Vì  .nextInt ( cũng như các thể loại next khác ( next , nextInt , nextFloat .... ) trừ nextLine ra  ) ko tạo 1 kí tự đánh dấu dòng mới -> nextLine sử dụng luôn dòng mới vừa nhập -> nên phải skip nextLine 1 dòng ! 
        maHs = scan.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + hoTen + " | quê: " + queQuan + " | Năm sinh: " + namSinh + " | mãHS : " + maHs);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            HocSinh n = new HocSinh();
            n.nhap(scan);
        }
    }
}
