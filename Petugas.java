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
//implementasi inheritance
public class Petugas implements User {
    // class Petugas hanya menambahkan attribut idPetugas dan jabatan untuk nama, alamat, telepon,dan jabatan//
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    //pemanggilan atau menambahkan data petugas
    public Petugas() {
        this.namaPetugas.add("admin");
        this.alamat.add("kedung kandang");
        this.telepon.add("081112223333");
        this.jabatan.add(0);
    }
    // menambahkan jabatan 
      public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
    }
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "id" */
    public int getJabatan(int id){
        return this.jabatan.get(id);
    } 
    // implementasi banyaknya petugas
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    } 
    //menggunakan method dati class induk abstrak
    @Override
    public void setNama(String namaPetugas ){
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat ){
        this.namaPetugas.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon ){
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    } 
  
}

//kenapa menggunakan override? karena biar mengakses beberapa kelas dan dibantu dengan interface "implements"
// Menggunakan polimor override/overiding kenapa menggunakan override karena 
//memudahkan penggunaan atau pemanggilan method dengan fungsionalitas yang mirip.
//Mode akses overriding method harus sama atau lebih luas daripada override method.
//Subclass hanya dapat dan boleh meng-override method superclass satu kali saja. 
//Tidak boleh ada lebih dari satu method yang sama pada kelas.
//Soal aturan hak akses, setiap subclass tidak boleh mempunyai hak akses method overriding yang ketat dibandingkan dengan hak akses method pada superclass ataupun parent class.
//asesor "get"
//mutator "set"
//dinamis "overide"
//statis "overload"