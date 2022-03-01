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
public class JenisLaundry {
     private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
     public JenisLaundry() {
         //methot setter
         //kegunaan untuk mengisi variabel
        this.jenisLaundry.add("Cuci Basah");
        this.durasi.add(1);
        this.harga.add(1500);
        this.jenisLaundry.add("Cuci Kering");
        this.durasi.add(2);
        this.harga.add(2000);
        this.jenisLaundry.add("Cuci Setrika");
        this.durasi.add(3);
        this.harga.add(4500);
     }
     /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "JmlLaundry" */
     public int getJmlLaundry(){
        return this.jenisLaundry.size();
    }
    //menambahkan jenislaundry
    public void setJenisLaundry(String jenisLaundry ){
        this.jenisLaundry.add(jenisLaundry);
    }
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idLaundry" */
    public String getJenisLaundry(int idLaundry){
        return this.jenisLaundry.get(idLaundry);
    } 
    //menambahkan durasilaundry atau berapa lama
    public void setDurasi(int durasi ){
        this.durasi.add(durasi);
    }
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idLaundry" */
    public int getDurasi(int idLaundry){
        return this.durasi.get(idLaundry);
    } 
    
    //untuk mengedit durasi dengan memanggil id laundry
    public void editDurasi(int idLaundry, int durasi){
        this.durasi.set(idLaundry, durasi);;
    } 
    //untuk menambahkan harga
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idLaundry" */
    public int getHarga(int idLaundry){
        return this.harga.get(idLaundry
        );
    } 


}


