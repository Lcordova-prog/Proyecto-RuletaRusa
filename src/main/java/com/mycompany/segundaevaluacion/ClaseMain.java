
package com.mycompany.segundaevaluacion;




import java.io.IOException;



public class ClaseMain {

    
    public static void main(String[] args) throws IOException {
       Juego play = new Juego(6);
       Participantes parti = new Participantes(1);
      parti.Ganar("Ganar.out");
      parti.Archivo("Muertos.out");
       
       
        while(!play.finalDeljuego()){
            play.ronditas();
         
        }
       
        System.out.println("EL JUEGO A FINALIZADO");
       
      
          
       
    }
    
    
}
