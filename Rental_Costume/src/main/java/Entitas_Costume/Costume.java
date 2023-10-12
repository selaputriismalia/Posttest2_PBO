/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitas_Costume;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SELLA
 */
public abstract class Costume {
    private final String namekarakter;
    private double HargaRental;

    public Costume(String namekarakter, double HargaRental) {
        this.namekarakter = namekarakter;
        this.HargaRental = HargaRental;
    }

    
    final public String getnamekarakter() {
        return namekarakter;
    }

    final public double getHargaRental() {
        return HargaRental;
    }

    final public void setHargaRental(double HargaRental) {
        this.HargaRental = HargaRental;
    }

    public abstract void tampilan();
}

