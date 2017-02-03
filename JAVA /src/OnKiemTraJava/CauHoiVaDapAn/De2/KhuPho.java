/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OnKiemTraJava.CauHoiVaDapAn.De2;

import java.util.ArrayList;

/**
 * 
 * @author Cường <duongcuong96 at gmail dot com>
 */
public class KhuPho {
    ArrayList <KhachTro>hoGiaDinh = new ArrayList();
    String tenKhuPho;
    
    public void themHoGiaDinh( KhachTro gd ){
        hoGiaDinh.add(gd);
    }
}
