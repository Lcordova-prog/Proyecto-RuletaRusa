package com.mycompany.segundaevaluacion;

public class Revolver {

    private int PosicionDisparoActual;
    private int PosicionDisparo;

    public Revolver() {
        PosicionDisparoActual = Metodos.generarNumeroAleatorio(1, 6);
        PosicionDisparo = Metodos.generarNumeroAleatorio(1, 6);
    }

    public boolean disparar() { //Metodo que me devulve true si la bala concuerda con la posición actual

        boolean Fuego = true; //Metodo para disparar

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

   
}
