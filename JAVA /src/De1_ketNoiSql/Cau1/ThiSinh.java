package De1_ketNoiSql.Cau1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class ThiSinh {

    public String Sbd;
    public String HoTen;
    public String DiaChi;
    public boolean uuTien;
    public String khoiThi;

    public ThiSinh() {

    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.print("Nhập số báo danh : ");
        Sbd = scan.nextLine();
        System.out.print("Nhập họ tên : ");
        HoTen = scan.nextLine();
        System.out.print("Nhập địa chỉ : ");
        DiaChi = scan.nextLine();
        System.out.print("Có là đối tượng ưu tiên ?, nhập 'y' để đồng ý, `n` để hủy: ");
        String isUuuTien = scan.nextLine();
        this.uuTien = isUuuTien.equals("y");
        System.out.println("------------------------------------- \n");
        
    }

    public void xuat() {
        System.out.println("Thông tin của thí sinh : " + this.HoTen + "| Khối thi: " + this.khoiThi + "| Số báo danh: " + this.Sbd + "| Địa chỉ : " + this.DiaChi + " | Thuộc đối tượng ưu tiên : " + (this.uuTien ? "có " : "không "));
    }
}
