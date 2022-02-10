
package com.mycompany.segundaevaluacion;


public class Revolver {
    private int PosicionDisparoActual;
        private int PosicionDisparo;
    
        
        public Revolver(){
            PosicionDisparoActual = Metodos.generarNumeroAleatorios(1, 6);
            PosicionDisparo = Metodos.generarNumeroAleatorios(1, 6);
        }
        
        public boolean disparar(){
            
            boolean Fuego = false;
            
            if (PosicionDisparoActual == PosicionDisparo) {
                
                Fuego = true;
            }
            
            siguienteTiro();
            
            
            return Fuego;
        }
        
        
        public void siguienteTiro(){
            if (PosicionDisparoActual == 6) {
                PosicionDisparoActual = 1;
        }else{
                PosicionDisparoActual ++;
            }
        }
        public String String(){
            return "Posicion de la Bala Actual: "+ PosicionDisparoActual + ", Sitio de la Bala"+ PosicionDisparo;
        }
}
