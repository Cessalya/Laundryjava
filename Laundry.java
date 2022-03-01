/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laundry;

/**
 *
 * @author LENOVO
 */
public class Laundry {
/*
 *
public class Belajarukl2 {

    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
       //untul mengakses class dari beberapa class
       JenisLaundry laundry = new JenisLaundry();
       Laporan laporan = new Laporan();
       Client client= new Client();
       Transaksi transaksi = new Transaksi();
       laporan.laporan(laundry);
       laporan.laporan(client);
       transaksi.prosesTransaksi(client, transaksi, laundry);
       laporan.laporan(client);
    }
    
}