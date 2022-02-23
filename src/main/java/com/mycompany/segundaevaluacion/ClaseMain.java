
package com.mycompany.segundaevaluacion;




import java.io.IOException;



public class ClaseMain {

    
    public static void main(String[] args) throws IOException {
       Juego play = new Juego(6);
       Participantes parti = new Participantes(1);
      parti.Ganar("Ganar.out"); //Crear archivo
      parti.Archivo("Muertos.out");//Crear archivo
       
       
        while(!play.finalDeljuego()){ //Metodo para determinar si termina el juego
            play.ronditas();
         
        }
       
        System.out.println("EL JUEGO A FINALIZADO");
       
      
          
       
    }
    
    
}
