/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Laundry;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */    
    /** implementasi inherintace */

public class Client implements User{
    /**class Client hanya menambahkan attribut idClient dan saldo
     untuk nama, alamat, dan telepon mewariskan dari claas User*/
    
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
     public Client() {
        //0
        this.namaClient.add("adi");
        this.alamat.add("sawojajar");
        this.telepon.add("08123456666");
        this.saldo.add(100000);

        //1
        this.namaClient.add("budi");
        this.alamat.add("bululawang");
        this.telepon.add("081222233344");
        this.saldo.add(200000);
    }
     //untuk menambahkan saldo
      public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
      
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idClient" */
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    } 
    
    //untuk mengedit saldo dari client, caranya dengan memasukkan idclient
    public void editSaldo(int idClient, int saldo){
         this.saldo.set(idClient, saldo);;
    } 
    
    public int getJmlClient(){
         return this.saldo.size();                                                                                                               
    } 
    
    @Override
    //untuk menambahkan nama client
    public void setNama(String namaClient ){
        this.namaClient.add(namaClient);
    }

    @Override
    //untuk menambahkan alamat
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    
    @Override
    //untuk menambahkan telepon
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }
    
    @Override
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas" */
    public String getNama(int idPetugas){
        return this.namaClient.get(idPetugas);
    }

    @Override
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas" */
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }

    @Override
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas" */
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    } 
}    