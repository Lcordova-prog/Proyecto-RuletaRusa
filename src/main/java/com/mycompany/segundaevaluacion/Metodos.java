
package com.mycompany.segundaevaluacion;


public class Metodos {
    public static int generarNumeroAleatorio(int minimo, int maximo){ // Metodo para generar numeros aleatorios
    int num = (int) Math.floor(Math.random()  * (maximo - minimo + 1) + (minimo));
        return num;    
    }
}
