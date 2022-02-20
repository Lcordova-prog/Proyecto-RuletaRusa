package com.mycompany.segundaevaluacion;

public class Juego {

    private Participantes[] jugadores;
    private Revolver revolver;

    public Juego(int cantidadJugadores) {

        jugadores = new Participantes[ComprobacionJugadores(cantidadJugadores)];

        rellenarJugadores();

        revolver = new Revolver();
        System.out.println(revolver);
    }

    private int ComprobacionJugadores(int cantidadJugadores) {
        if (!(cantidadJugadores > 1 && cantidadJugadores <= 6)) {
            cantidadJugadores = 6;
        }
        return cantidadJugadores;
    }

    private void rellenarJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Participantes(i + 1);
        }
    }

    public boolean finalDeljuego() {
        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }

        }
        return false;
    }

    public void ronditas() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].Fuego(revolver);
        }
    }

}
