/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasi_aggregasi;

/**
 *
 * @author Feri Winarta
 */

class Customer {
    private String nama;
    private int totalBelanja;
    private int idPelanggan;

    public Customer(String nama, int idPelanggan, int totalBelanja) {
        this.nama = nama;
        this.idPelanggan = idPelanggan;
        this.totalBelanja = totalBelanja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    
     public int getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(int totalBelanja) {
        this.totalBelanja = totalBelanja;
    }
    
}

class Orders {
    private String tanggal;
    private Customer cust;
    
    public Orders(String tanggal, Customer cust) {
        this.tanggal = tanggal;
        this.cust = cust;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public void preSales(){
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Customer      : " + cust.getNama());
        System.out.println("id            : " + cust.getIdPelanggan());
        System.out.println("total belanja : " + cust.getTotalBelanja());
    }
    
    public void datfarPesanan(){
        System.out.println("masih banyak");
    }
    
}


public class AggregasiApp {
    
    public static void main(String[] args) {
        
        // lebih safe karen konstruktor wajib diisi dengan
        // objek customer, akan tetapi tetap dapat terkena 
        // null pointer exception
        Orders order = new Orders("26 mei 2021", new Customer("jajang", 20, 123000));
        
        
        order.preSales();
        
        
        
    }
    
}
