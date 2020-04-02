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

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turno = 1;
        int contador = 0, contadorDeTurno = 0;
        String jugador1, jugador2;
       
        //creacion de objetos
        AccionesDelJugador acciones = new AccionesDelJugador();
        DiseñoDeMapas mapa = new DiseñoDeMapas();
        
        //instrucciones del juego
        System.out.println("BIENVENID@S A KONQUEST");
        System.out.println("Instrucciones: Este juego trata de una batalla espacial");
        System.out.println("que se realiza entre dos jugadores el proposito es conquistar");
        System.out.println("todos los planetas del juego para lo cual cada jugador iniciara");
        System.out.println("con un planeta y cierta cantidad de guerreros y naves. Al iniciar");
        System.out.println("los jugadores crearan el tablero de juego e ingresaran su nombre");
        System.out.println("para comenzar a jugar");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        mapa.CrearMapa();
        
        System.out.println("Ingrese el Nombre del Jugador No. 1");
        jugador1 = scanner.nextLine();
        
        System.out.println("Ingrese el Nombre del Jugador No. 2");
        jugador2 = scanner.nextLine();
        
       
        
        do {
            if (turno == 1) {
                mapa.ImprimirMapa();
                System.out.println("");
                System.out.println("Es el turno de: "+jugador1);
                acciones.MenuDeOpciones();
            }
            else if (turno == 2) {
                mapa.ImprimirMapa();
                System.out.println("");
                System.out.println("Es el turno de: "+jugador2);
                acciones.MenuDeOpciones();
            }
            
            turno = alternarTurno(turno);
            contadorDeTurno ++;
            System.out.println("Turno: "+contadorDeTurno);
            System.out.println("Ingrese el caracter que finaliza el ciclo prueba");
            contador = Integer.parseInt(scanner.nextLine());
            
        } while (contador != 1);          
    }
    
     public static int alternarTurno(int turnoActual) {

        if (turnoActual == 1) {
            return 2;
        } else {
            return 1;
        }
    }
    
}
