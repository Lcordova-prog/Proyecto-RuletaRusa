package com.mycompany.segundaevaluacion;

import java.io.IOException;

public class Juego {

    private Participantes[] jugadores;
    private Revolver revolver;

    public Juego(int cantidadJugadores) { 

        jugadores = new Participantes[ComprobacionJugadores(cantidadJugadores)];

        rellenarJugadores();

        revolver = new Revolver();
        System.out.println(revolver);
    }

    private int ComprobacionJugadores(int cantidadJugadores) { //Metodo para comprobar jugadores 
        if ((cantidadJugadores > 1 && cantidadJugadores <= 6)) {
            cantidadJugadores = 6;
        }
        return cantidadJugadores;
    }

    private void rellenarJugadores() { //Metodo para crear jugadores
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Participantes(i + 1);
        }
    }

    public boolean finalDeljuego() { // Metodo para recorrer jugadores y verificar si estan vivos los jugadores, esto determinara si se termina el juego
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }

        }
        return false;
    }

    public void ronditas() throws IOException { // Esto recorrer rondas
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].Fuego(revolver);
        }
    }
   
        }
    


