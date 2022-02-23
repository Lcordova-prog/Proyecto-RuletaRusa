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

    public void siguienteTiro() { /* Metodo para pasar al siguiente tiro, es decir si estamos en la posición 1 
        y eso es igual a 6, no. Entonces paso al siguiente y asi sucesivamente, pero cuando llegue al 6to, que deberia pasar al siguiente, vulve al 1*/
        if (PosicionDisparoActual == 6) {
            PosicionDisparoActual = 1;
        } else {
            PosicionDisparoActual++;
        }
    }

   
}
