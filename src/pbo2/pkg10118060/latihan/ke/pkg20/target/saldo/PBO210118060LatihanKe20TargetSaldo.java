/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg20.target.saldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 
 * Nama : Permai Ramadhan
 * NIM : 10118060
 * Deskripsi Program : Target saldo
 */
public class PBO210118060LatihanKe20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("");
        dfs.setMonetaryDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        df.setDecimalFormatSymbols(dfs);
    
        double saldo=3500000;
        int i=1;
        String hsl;
       
        do {            
           saldo=saldo+(saldo*0.08);
            hsl = "Rp. " + df.format(saldo);
            System.out.println("Saldo di bulan ke-"+i+" "+hsl);
            i++;
        } while (saldo <6000000);
    }
    
}
