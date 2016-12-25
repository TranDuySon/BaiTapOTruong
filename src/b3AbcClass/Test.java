/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b3AbcClass;

/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class Test extends AbcAbstract implements AbcInterface{

    
    
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("abc ");
        t.abc();
    }

    @Override
    public void beA() {
        System.out.println("beA");
    }

    @Override
    public void beB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abc() {
        System.out.println("Không là abc");
    }

    @Override
    public void def() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
