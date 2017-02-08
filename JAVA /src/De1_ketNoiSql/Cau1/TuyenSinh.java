/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1_ketNoiSql.Cau1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class TuyenSinh {

    public TuyenSinh() {
    }

    private ArrayList<ThiSinh> listThiSinh = new ArrayList();

    public int getListThiSinh() {
        return listThiSinh.size();
    }

    public void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập khối thi :(A|B|C) ");
        String khoiThi = scan.nextLine();
        switch (khoiThi.toLowerCase()) {
            case "a":
                KhoiA a = new KhoiA();
                a.nhap();
                listThiSinh.add(a);
                break;

            case "b":
                KhoiB b = new KhoiB();
                b.nhap();
                listThiSinh.add(b);
                break;

            default:
                System.out.println("Khoi thi nhap : " + khoiThi);
                KhoiC c = new KhoiC();
                c.nhap();
                listThiSinh.add(c);
        }

    }

    public void xuat() {
        for (Object ts : listThiSinh) {
            switch (ts.getClass().getSimpleName()) {
                case "KhoiA":
                    KhoiA a = (KhoiA) ts;
                    a.xuat();
                    break;

                case "KhoiB":
                    KhoiB b = (KhoiB) ts;
                    b.xuat();
                    break;

                case "KhoiC":
                    KhoiC c = (KhoiC) ts;
                    c.xuat();
                    break;
            }
        }
    }

    public void timKiem() {
        System.out.println("Nhập số báo danh thí sinh : ");
        Scanner scan = new Scanner(System.in);
        String sbd = scan.nextLine();
        for (ThiSinh ts : listThiSinh) {
            if (ts.Sbd.equals(sbd)) {
                ts.xuat();
                return; //tim duoc roi thi dung vong for lai ! 
            }
        }
        //neu ko tim thay 
        System.out.println("Không tim thấy thí sinh với mã : " + sbd);
    }

}
