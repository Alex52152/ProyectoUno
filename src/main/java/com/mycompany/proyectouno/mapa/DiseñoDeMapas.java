/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectouno.mapa;

import com.mycompany.proyectouno.planeta.Planeta;
import com.mycompany.proyectouno.planeta.Tierra;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class DiseñoDeMapas {

    private int filas, columnas, planetasNeutrales;
    //public Planeta[] planeta 
    Random random = new Random();
    
    Scanner scanner = new Scanner(System.in);
    
    public DiseñoDeMapas(int filas, int columnas, int planetasNeutrales) {
        this.filas = filas;
        this.columnas = columnas;
        this.planetasNeutrales = planetasNeutrales;
    }

    public DiseñoDeMapas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    public void CrearMapa() {
        //ingreso de filas y columnas 
        System.out.println("Ingrese la cantidad de filas que desea que "
                           + "tenga el mapa");
        filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas que desea que "
                + "tenga el mapa");
        columnas = scanner.nextInt();
        
        System.out.println("Cuantos Planetas Neutrales Desea que Tenga el Mapa");
        planetasNeutrales = scanner.nextInt();
        
        //creacion de planetas en el mapa
        
    }

    //metodo para la creacion del mapa
    public void ImprimirMapa() {
        String mapa[][];
        mapa = new String[filas][columnas];
        
        //ciclo para colocar el numero de columna 
        System.out.print("Columna   ");
        for (int i = 0; i < columnas; i++) {
            System.out.print((i + 1) + "     ");
        }
        System.out.println("");

        //ciclo para la creacion del mapa 
        for (int j = 0; j < filas; j++) {
            System.out.print("fila " + (j + 1) + ":");
            for (int i = 0; i < columnas; i++) {
                System.out.print("[ " + mapa[j][i] + " ]");
            }
            System.out.println("");
        }

    }   

}
