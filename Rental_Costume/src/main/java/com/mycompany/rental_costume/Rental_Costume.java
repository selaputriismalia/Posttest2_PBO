/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rental_costume;
import Entitas_Costume.Costume;
import Entitas_Costume.Costume_Anime;
import Entitas_Costume.Costume_Game;
import Control.KontrolKarakter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author SELLA
 */

final public class Rental_Costume {
    final public static void main(String[] args) {
        KontrolKarakter controller = new KontrolKarakter();
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("=======================================================");
            System.out.println("|       Selamat Datang Dimenu Rental Costume Sela     |");
            System.out.println("=======================================================");
            System.out.println("| 1. Tambah Kostum Anime                              |");
            System.out.println("| 2. Tambah Kostum Game                               |");
            System.out.println("| 3. Edit Harga Kostum                                |");
            System.out.println("| 4. Hapus Kostum                                     |");
            System.out.println("| 5. Tampilkan Semua Kostum                           |");
            System.out.println("| 6. Tampilkan Semua Kostum Anime                     |");
            System.out.println("| 7. Tampilkan Semua Kostum Game                      |");
            System.out.println("| 8. Keluar                                           |");
            System.out.println("=======================================================");
            System.out.println(" ");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Menangani karakter newline

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.print("Masukkan nama karakter Anime: ");
                    String karakterAnime = scanner.nextLine();
                    System.out.print("Masukkan harga sewa: $");
                    double hargaAnime = scanner.nextDouble();
                    scanner.nextLine();  // Menangani karakter newline
                    System.out.print("Masukkan nama anime: ");
                    String namaAnime = scanner.nextLine();
                    Costume_Anime anime = new Costume_Anime(karakterAnime, hargaAnime, namaAnime);
                    controller.tambahcostume(anime);
                    System.out.println(" ");
                    System.out.println("Costume \"" + karakterAnime + "\"Telah ditambahkan");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.print("Masukkan nama Karakter Game: ");
                    String karakterGame = scanner.nextLine();
                    System.out.print("Masukkan harga sewa: $");
                    double hargaGame = scanner.nextDouble();
                    scanner.nextLine();  // Menangani karakter newline
                    System.out.print("Masukkan nama game: ");
                    String namaGame = scanner.nextLine();
                    Costume_Game game = new Costume_Game(karakterGame, hargaGame, namaGame);
                    controller.tambahcostume(game);
                    System.out.println(" ");
                    System.out.println("Costume \"" + karakterGame + "\" Telah ditambahkan");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print("Masukkan nama Karakter yang akan diubah harganya: ");
                    String namaCostume = scanner.nextLine();
                    System.out.print("Masukkan harga sewa baru: $");
                    double hargaBaru = scanner.nextDouble();
                    scanner.nextLine();  // Menangani karakter newline
                    controller.updateHarga(namaCostume, hargaBaru);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    boolean found = false;
                    int attempts = 0;
                    final int maxAttempts = 3;
                    String nameToRemove = "";
                    while (!found && attempts < maxAttempts) {
                        System.out.print("Masukkan nama karakter kostum yang akan dihapus: ");
                        nameToRemove = scanner.nextLine();
                        found = controller.costumeExists(nameToRemove);
                        System.out.println(" ");
                        
                        if (!found) {
                            System.out.println("Karakter \"" + nameToRemove + "\" tidak ditemukan. Silakan coba lagi.");
                            attempts++;
                        }
                    }
                    if (found) {
                        controller.menghapuskostume(nameToRemove);
                    } else {
                        System.out.println("Percobaan telah habis. Kembali ke menu utama.");
                    }
                    break;
                case 5:
                    controller.tampilkansemuaCostume();
                    break;
                case 6:
                    controller.tampilkanCostumeAnime();
                    break;
                case 7:
                    controller.tampilkanCostumeGame();
                    break;
                case 8:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            if (shouldContinue) {
                System.out.println(" ");
                System.out.print("Apakah Anda ingin kembali ke menu awal? (y/n): ");
                String response = scanner.nextLine();
                if (!response.equalsIgnoreCase("y")) {
                    shouldContinue = false;
                    System.out.println("Terima kasih! Keluar dari program.");
                }
            }
            
        }
    }
}