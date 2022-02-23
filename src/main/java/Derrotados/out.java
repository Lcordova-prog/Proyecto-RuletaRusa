
package Derrotados;

import com.mycompany.segundaevaluacion.Participantes;


public class out {
    int cuantosMuertosHay = 0;
    private Nodo ultimoMuerto;

   
 
   public out(){
    cuantosMuertosHay = 0;
    ultimoMuerto = null;
} 
    public void Muertos(String nombre){
     Nodo nuevo_nodo = new Nodo(nombre);
     nuevo_nodo.siguiente = ultimoMuerto;
     ultimoMuerto = nuevo_nodo;
     cuantosMuertosHay ++;
 }
    
    
    public String muertos(){
      
     
         
     

     
     
        return null;
      
     
         
     

     
     
 }   
}
