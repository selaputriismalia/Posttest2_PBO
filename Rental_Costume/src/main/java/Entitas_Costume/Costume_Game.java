/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitas_Costume;

/**
 *
 * @author SELLA
 */
final public class Costume_Game extends Costume{
    private final String Nama_Game;

    public Costume_Game(String namekarakter, double HargaRental, String Nama_Game) {
        super(namekarakter, HargaRental);
        this.Nama_Game= Nama_Game;
    }

    final public String getNama_Game() {
        return Nama_Game;
    }

    @Override
    final public void tampilan() {
        System.out.println("Nama Karakter: " + getnamekarakter());
        System.out.println("Nama Anime: " + getNama_Game());
        System.out.println("Harga Rental: $" + getHargaRental());
    }
}
