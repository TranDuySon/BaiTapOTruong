/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b2;

/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Tien {
    String name;
    int age ;
    String address;
    
    
    public Tien(){
        name = "Tiên";
        age = 20 ;
        address  = "Hà Nội";
    }
    
    public Tien(String name , int age , String address ){
        this.name = name ;
        this.age = age ;
        this.address = address ;
    }
    
    public static void main(String[] args) {
        Tien tien = new Tien();
        
    }
}
