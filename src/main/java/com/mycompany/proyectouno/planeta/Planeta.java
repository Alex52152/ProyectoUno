/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectouno.planeta;

/**
 *
 * @author alex
 */
public class Planeta {
    protected String nombre;
    private double porcentajeDeMuerte, probabilidadDeAparecer; 
    private int cantidadDeDinero, cantidadDeCostructores, cantidadDeNaves,
            cantidadDeGuerreros;

    public Planeta(String nombre, double porcentajeDeMuerte, double probabilidadDeAparecer, int cantidadDeDinero, int cantidadDeCostructores, int cantidadDeNaves, int cantidadDeGuerreros) {
        this.nombre = nombre;
        this.porcentajeDeMuerte = porcentajeDeMuerte;
        this.probabilidadDeAparecer = probabilidadDeAparecer;
        this.cantidadDeDinero = cantidadDeDinero;
        this.cantidadDeCostructores = cantidadDeCostructores;
        this.cantidadDeNaves = cantidadDeNaves;
        this.cantidadDeGuerreros = cantidadDeGuerreros;
    }
   
    
}
