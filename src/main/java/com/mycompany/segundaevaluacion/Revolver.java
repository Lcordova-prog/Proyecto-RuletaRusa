package com.mycompany.segundaevaluacion;

public class Revolver {

    private int PosicionDisparoActual;
    private int PosicionDisparo;

    public Revolver() {
        PosicionDisparoActual = Metodos.generarNumeroAleatorio(1, 6);
        PosicionDisparo = Metodos.generarNumeroAleatorio(1, 6);
    }

    public boolean disparar() {

        boolean Fuego = true;

        if (PosicionDisparoActual == PosicionDisparo) {

            Fuego = false;
        }

        siguienteTiro();

        return Fuego;
    }

    public void siguienteTiro() {
        if (PosicionDisparoActual == 6) {
            PosicionDisparoActual = 1;
        } else {
            PosicionDisparoActual++;
        }
    }

    public String toString() {
        return "Posicion de la Bala Actual: " + PosicionDisparoActual + ", Sitio de la Bala" + PosicionDisparo;
    }
}
