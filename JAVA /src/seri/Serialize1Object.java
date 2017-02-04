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
