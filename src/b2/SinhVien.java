/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class SinhVien {

    String msv;
    String ten;
    String Atm;
    int tuoi;

    public SinhVien() {

    }

    public SinhVien(String msv, String ten, String Atm, int tuoi) {
        this.msv = msv;
        this.ten = ten;
        this.Atm = Atm;
        this.tuoi = tuoi;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setAtm(String Atm) {
        this.Atm = Atm;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getAtm() {
        return Atm;
    }

    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        System.out.println("-------------------");
        System.out.println("Tuổi sv : " + this.tuoi);
        System.out.println("Tên sv: " + this.ten);
        System.out.println("Msv : " + this.msv);
        System.out.println("atm : " + this.msv);
        System.out.println("-------------------");

        return "";
    }

    public void nhap(Scanner scan) {
        
        System.out.println("Nhâp tuổi sv " );
        this.tuoi = scan.nextInt();
        System.out.println("Nhập tên sv : " );
        this.ten = scan.next().toString();
        scan.nextLine();
        System.out.println("Nhập msv ");
        this.msv = scan.nextLine().toString();
        System.out.println("nhập atm : ");
        this.Atm = scan.nextLine();
        
    }
}
