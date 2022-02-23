
package com.mycompany.segundaevaluacion;
import java.io.*;


public class Participantes {
    int usuario;
    String nombre;
    boolean vivo;
    
    
    
    
    public Participantes(int id){
        this.usuario = id;
        this.nombre = "Participante "+id; //Metodo para que aparezcan varios jugadores
        this.vivo = true; // Metodo que hace que todos empiecen vivos
      
        
    }
   
    public String Fuego(Revolver r) { //Metodo que dispara
        
        if(usuario <= 5){
        usuario += 1;
            System.out.println("El "+nombre+" apunta al participante: "+usuario+"\n");
        
        }else{
            usuario = 1;
             System.out.println("El "+nombre+" apunta al participante: "+usuario+" \n");

        }      
   if (r.disparar()) {
            this.vivo = false; //Jugador muere
           
            System.out.println("EL "+nombre+ "  ha matado... al participante "+usuario+" \n");
            System.out.println("Participante eliminado: "+usuario);
           
        }else{
            System.out.println(" se ha salvado.... el participante: "+usuario+"  \n");
               System.out.println("Participante ganardos: "+usuario+"\n");}
  return nombre;
  
   
    }
    public void Archivo(String nombre1){ // Metodo para enseñar los eliminados en un archivo
        usuario = Metodos.generarNumeroAleatorio(1, 6);
       
         File f;   
         FileWriter w;
         BufferedWriter bw;
         PrintWriter wr;
         try{
           f = new File(nombre1);
           w = new FileWriter(f);
           bw = new BufferedWriter(w);
           wr = new PrintWriter(bw);
           
    
           
          
             wr.write("Participante eliminado: "+usuario+"\t");
             usuario ++;
              wr.write("Participante eliminado: "+usuario+"\t");
                usuario ++;
               wr.write("Participante eliminado: "+usuario+"\t");
              usuario ++;
                wr.write("Participante eliminado: "+usuario+"\t");
                usuario ++;
                wr.write("Participante eliminado: "+usuario+"\t");
               usuario ++;
            
           
            wr.close();
           bw.close();
         }catch(IOException e){
             
         }
    }
          public void Ganar(String nombre2){// Metodo para enseñar los eliminados en un archivo
          usuario = Metodos.generarNumeroAleatorio(1, 6);
         File f;   
         FileWriter w;
         BufferedWriter bw;
         PrintWriter wr;
         try{
           f = new File(nombre2);
           w = new FileWriter(f);
           bw = new BufferedWriter(w);
           wr = new PrintWriter(bw);
    
            wr.write("Participante ganardos: "+usuario+"\n");
               
   
            wr.close();
           bw.close();
         }catch(IOException e){
             
         }
        
    } 
        
    // Aqui comienzan los Getters and setters, modifican y obtienen informacion de los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    String Fuego(int usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String Fuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }     

    

    
    
}
