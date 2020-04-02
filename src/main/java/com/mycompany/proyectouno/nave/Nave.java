/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectouno.nave;

/**
 *
 * @author alex
 */
public class Nave {
    private String nivel;
    private int espacios, costoDeProduccion;
    private double velocidad;

    public Nave(String nivel, int espacios, int costoDeProduccion, double velocidad) {
        this.nivel = nivel;
        this.espacios = espacios;
        this.costoDeProduccion = costoDeProduccion;
        this.velocidad = velocidad;
    }
    
    
}
