
package com.mycompany.segundaevaluacion;


public class ClaseMain {

    
    public static void main(String[] args) {
       Juego play = new Juego(6);
       Participantes jugador = new Participantes(1);
       
        while(!play.finalDeljuego()){
            play.ronditas();
        }
       
        System.out.println("EL JUEGO A FINALIZADO");
       
           System.out.println("Ganador "+jugador.usuario);
        
          
       
    }
    
}
