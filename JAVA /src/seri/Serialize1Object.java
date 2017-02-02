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

/**
 *
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Serialize1Object {

    public static void main(String[] args) {
        System.out.println("Write object ! ");
        EmployeeSerializable e = new EmployeeSerializable("hú la", 2, "Sao Kim ");

        //tạo 2 đối tượng để GHI(output) object 
        // chỉ những class nào implement Serialize mới có khả năng LƯU THÀNH FILE 
        FileOutputStream fout = null;
        ObjectOutputStream ous = null;
        
        
        //tạo 2 đối tượng để ĐỌC (input) object
        FileInputStream fin = null;
        ObjectInputStream oin = null;

        try {
            fout = new FileOutputStream("employee.ser");
            ous = new ObjectOutputStream(fout);
            ous.writeObject(e);
        } catch (Exception ex) {
            ex.printStackTrace(); // in chi tiết thông tin lỗi 
        }

        System.out.println("Read object : ");
        try {
            fin = new FileInputStream("employee.ser");
            oin = new ObjectInputStream(fin);
            EmployeeSerializable eOut = (EmployeeSerializable) oin.readObject();
            System.out.println("info of object :  " + eOut.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
