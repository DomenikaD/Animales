/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.animales;

import ec.edu.ups.interfaz.Accion;

/**
 *
 * @author Domenika Delgado
 */
public class Perro extends Animal implements Accion {
    
    public Perro(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }
    
    @Override
    public void comer() {
        System.out.println("El perro " + this.getNombre() + " está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + this.getNombre() + " está durmiendo.");
    }

    @Override
    public void moverse() {
        System.out.println("El perro " + this.getNombre() + " está moviendose.");
    }

    @Override
    public void jugar() {
        System.out.println("El perro " + this.getNombre() + " está jugando.");
    }

    @Override
    public void reproducirse() {
        System.out.println("El perro " + this.getNombre() + " está reproduciendose.");
    }
    
    
}
