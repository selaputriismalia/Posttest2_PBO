/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.util.ArrayList;
import Entitas_Costume.Costume;
import Entitas_Costume.Costume_Anime;
import Entitas_Costume.Costume_Game;
/**
 *
 * @author SELLA
 */
final public class KontrolKarakter {
    final private ArrayList<Costume> costumes;
    
    public KontrolKarakter() {
        this.costumes = new ArrayList<>();
    }

    final public void tambahcostume(Costume costume) {
        costumes.add(costume);
    }

    final public void menghapuskostume(String namekarakter) {
        Costume costumeToRemove = null;
        for (Costume costume : costumes) {
            if (costume.getnamekarakter().equals(namekarakter)) {
                costumeToRemove = costume;
                break;
            }
        }
        if (costumeToRemove != null) {
            costumes.remove(costumeToRemove);
            System.out.println(" ");
            System.out.println("Karakter \"" + namekarakter + "\" berhasil dihapus.");
        } else {
            System.out.println("Karakter \"" + namekarakter + "\" tidak ditemukan.");
        }
    }

    final public void updateHarga(String name, double hargabaru) {
        Costume costumeToUpdate = null;
        for (Costume costume : costumes) {
            if (costume.getnamekarakter().equals(name)) {
                costumeToUpdate = costume;
                break;
            }
        }
        if (costumeToUpdate != null) {
            costumeToUpdate.setHargaRental(hargabaru);
            System.out.println(" ");
            System.out.println("Harga sewa kostum karakter  \"" + name + "\" berhasil diubah menjadi $" + hargabaru);
        } else {
            System.out.println("Karakter \"" + name + "\" tidak ditemukan.");
        }
    }

    final public void tampilkanCostumeGame() {
        System.out.println(" ");
        System.out.println("Daftar Kostum Game:");
        System.out.println(" ");
        for (Costume costume : costumes) {
            if (costume instanceof Costume_Game) {
                costume.tampilan();
            }
        }
    }

    final public void tampilkanCostumeAnime() {
        System.out.println( " ");
        System.out.println("Daftar Kostum Anime:");
        System.out.println(" ");
        for (Costume costume : costumes) {
            if (costume instanceof Costume_Anime) {
                costume.tampilan();
            }
        }
    }

    final public void tampilkansemuaCostume() {
        System.out.println(" ");
        System.out.println("Daftar Semua Kostum:");
        System.out.println(" ");
        for (Costume costume : costumes) {
            costume.tampilan();
        }
    }
    
    final public boolean costumeExists(String name) {
        for (Costume costume : costumes) {
            if (costume.getnamekarakter().equals(name)) {
                return true;
            }
        }
        return false;
    }

    final public ArrayList<Costume> getSemuaCostume() {
        return costumes;
    }
}
