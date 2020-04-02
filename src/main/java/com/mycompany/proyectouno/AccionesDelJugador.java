/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectouno;

import com.mycompany.proyectouno.mapa.DiseñoDeMapas;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class AccionesDelJugador {
    Scanner scanner = new Scanner(System.in);
    private int opcionDeJuego;
    
    
    
    public void MenuDeOpciones(){
       
       
       System.out.println("Ingrese el numero de la opcion que desea realizar");
       System.out.println("1. Medir Distancia");
       System.out.println("2. Ver Planeta");
       System.out.println("3. Consultar Flota");
       System.out.println("4. EnviarFlota");
       System.out.println("5. Construir Nave");
       System.out.println("6. Finalizar Turno");
       opcionDeJuego = scanner.nextInt();
       
        if (opcionDeJuego == 1) {
            MedirDistancia();
        }
        else if (opcionDeJuego == 2) {
            VerPlaneta();
        }
        else if (opcionDeJuego == 3) {
            ConsultarFlota();
        }
        else if (opcionDeJuego == 4) {
            EnviarFlota();
        }
        else if (opcionDeJuego == 5) {
            ConstruirNave();
        }
        else if (opcionDeJuego == 6) {
            System.out.println("Turno Finalizado");
        }
        
       // MenuDeOpciones();
               
    }
    
    public void MedirDistancia(){
        int planetaOrigen;
        System.out.println("Ingrese el planeta de origen");
        planetaOrigen = scanner.nextInt();
        MenuDeOpciones();
    }
    
    public void VerPlaneta(){
        
    }
    
    public void ConsultarFlota(){
        
    }
    
    public void EnviarFlota(){
        
    }
    
    public void ConstruirNave(){
        
    }
    
    public void ModificarMapa(){
        DiseñoDeMapas mapa = new DiseñoDeMapas();
        mapa.CrearMapa();
        mapa.ImprimirMapa();
    }
    
    
}

