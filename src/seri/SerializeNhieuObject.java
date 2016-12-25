/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class SerializeNhieuObject {

    public static void main(String[] args) {
        //vars
        ArrayList<EmployeeSerializable> arrNhanVien = new ArrayList();
        ArrayList<EmployeeSerializable> arrNhanVienSered = null;
        Scanner scan = new Scanner(System.in);

        //              gồm 2 pha : tạo file +  lưu object vào file và đọc object từ file 
        FileOutputStream fout = null;
        FileInputStream fin = null;

        ObjectInputStream obin = null;
        ObjectOutputStream obout = null;

        //init 
        System.out.println("nhập số nhân viên muốn thêm: ");
        int counter = scan.nextInt();

        for (int i = 0; i < counter; i++) {
            EmployeeSerializable ob = new EmployeeSerializable();
            ob.setData(scan);
            arrNhanVien.add(ob);
        }

        System.out.println("nhập tên file muốn lưu : ");
        String filename = scan.next();
        System.out.println("Lưu toàn bộ thông tin trên vào file:  " + filename);

        try {
            fout = new FileOutputStream(filename);
            obout = new ObjectOutputStream(fout);
            obout.writeObject(arrNhanVien);
            System.out.println("Lưu mảng nhân viên thành công, tiến hành đọc ra từ file: " + filename);

            fin = new FileInputStream(filename);
            obin = new ObjectInputStream(fin);
            arrNhanVienSered = (ArrayList<EmployeeSerializable>) obin.readObject();

            System.out.println("đã đọc từ file: " + filename + " thành công !, tiến hành in ra thông tin:  ");

            for (EmployeeSerializable nv : arrNhanVienSered) {
                System.out.println(nv.toString());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
