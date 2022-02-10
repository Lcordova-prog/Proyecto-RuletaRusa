
package com.mycompany.segundaevaluacion;


public class Metodos {
    public static int generarNumeroAleatorios(int minimo, int maximo){
    int num = (int) Math.floor(Math.random())*(maximo - minimo + 1) + (minimo);
        return num;    
    }
}
