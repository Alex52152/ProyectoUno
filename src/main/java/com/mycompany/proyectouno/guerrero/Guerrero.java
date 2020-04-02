package com.mycompany.proyectouno.guerrero;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alex
 */
public class Guerrero {
    protected String nombre;
    protected String ataqueEspecial;
    protected double factorDeMuerte;
    protected int lugarQueOcupa;
    
    
    public Guerrero(String nombre, String ataqueEspecial, double factorDeMuerte, int lugarQueOcupa) {
        this.nombre = nombre;
        this.ataqueEspecial = ataqueEspecial;
        this.factorDeMuerte = factorDeMuerte;
        this.lugarQueOcupa = lugarQueOcupa;
    }

}
