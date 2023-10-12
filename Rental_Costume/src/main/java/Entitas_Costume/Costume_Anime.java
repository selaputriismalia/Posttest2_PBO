/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitas_Costume;

/**
 *
 * @author SELLA
 */
final public class Costume_Anime extends Costume {
    private final String Nama_Anime;

    public Costume_Anime(String namekarakter, double HargaRental, String Nama_Anime) {
        super(namekarakter, HargaRental);
        this.Nama_Anime= Nama_Anime;
    }

    final public String getNama_Anime() {
        return Nama_Anime;
    }
    
    
    @Override
    final public void tampilan() {
        System.out.println("Nama Karakter: " + getnamekarakter());
        System.out.println("Nama Anime: " + getNama_Anime());
        System.out.println("Harga Rental: $" + getHargaRental());
    }
}
    
