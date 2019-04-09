/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.animales.Ave;
import ec.edu.ups.animales.Perro;
import ec.edu.ups.animales.Pez;

/**
 *
 * @author Domenika Delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Cookie", 2, 20, "Macho");
        Perro perro2 = new Perro("Diva", 2, 18, "Hembra");
        
        perro1.comer();
        perro1.dormir();
        perro1.jugar();
        perro1.moverse();
        perro1.reproducirse();
        
        perro2.comer();
        perro2.dormir();
        perro2.jugar();
        perro2.moverse();
        perro2.reproducirse();
        
        Ave ave1 = new Ave("Larry", 3, 2, "Macho");
        Ave ave2 = new Ave("Lily", 3, 1.5, "Hembra");
        
        ave1.comer();
        ave1.dormir();
        ave1.jugar();
        ave1.moverse();
        ave1.reproducirse();
        
        ave2.comer();
        ave2.dormir();
        ave2.jugar();
        ave2.moverse();
        ave2.reproducirse();
        
        Pez pez1 = new Pez("Nemo", 1, 5.5, "Macho");
        Pez pez2 = new Pez("Dory", 1, 4.5, "Hembra");
        
        pez1.comer();
        pez1.dormir();
        pez1.jugar();
        pez1.moverse();
        pez1.reproducirse();
        
        pez2.comer();
        pez2.dormir();
        pez2.jugar();
        pez2.moverse();
        pez2.reproducirse();
    }
    
}
