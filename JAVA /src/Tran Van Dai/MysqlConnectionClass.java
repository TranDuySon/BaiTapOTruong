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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class MysqlConnectionClass {
    private Connection conn = null;
    public MysqlConnectionClass() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/testjava?useUnicode=true&characterSet=UTF-8";
        conn= DriverManager.getConnection(url , "root" , "root");
    }
    
    public ResultSet getTable ( String tableName ) throws SQLException{
        ResultSet rs = null ;
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM " + tableName);
        return rs;
    }
    
    public boolean update( String name , int number ){
        try{
            String sql = "UPDATE products SET id=? , name=? , number=? WHERE id =  ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, number);
            pstmt.setInt(3, id);

            return pstmt.executeUpdate() > 0;

        }catch( Exception ex){
            return false;
        }
    }
    

    
    public boolean insert( int id , String name , int number  ){
        try{
            String sql = "INSERT INTO products(id , name , number) VALUES ( ? , ? , ? )";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id );
            pstmt.setString(2, name);
            pstmt.setInt(3, number);
            
            return pstmt.executeUpdate() > 0 ;
        }catch( Exception ex ){
            return false;
        }
    }
    public boolean delete ( int  id ){
        try{
            String sql ="DELETE FROM products WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            return pstmt.executeUpdate() > 0 ;
        }catch( Exception  ex){
            return false;
        }
    }
    
    public void show() throws SQLException{
            ResultSet rs = this.getTable("Products");
            while( rs.next() ){
            System.out.print("id : "  + rs.getInt("id"));
            System.out.print("|name: " + rs.getString("name"));
            System.out.print("|number : " + rs.getInt("number") +"\n");
            }

    }
    
    
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        MysqlConnectionClass conn = new MysqlConnectionClass();
       
        conn.show();
        
        System.out.println("insert : id: 1 , name : 'Dai' , number:4 ");
        
        
        conn.insert(6, "Tran Van Dai", 3);
        
        conn.insert(5,"yyyyy",5);
                
        conn.delete(4);
        
        conn.show();
        
        
        
//        conn.insert(5, "", 0);
    }
}
