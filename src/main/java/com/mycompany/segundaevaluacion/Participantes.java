
package com.mycompany.segundaevaluacion;


public class Participantes {
    int usuario;
    String nombre;
   
    boolean vivo;
   
    
    public Participantes(int id){
        this.usuario = id;
        this.nombre = "Participante "+id;
        this.vivo = true;
    }

    public void Fuego(Revolver r){
        if(usuario <= 5){
        usuario += 1;
        System.out.println("El "+nombre+" apunta al participante: "+usuario);
        
        }else{
            usuario = 1;
             System.out.println("El "+nombre+" apunta al participante: "+usuario);

        }      
   if (r.disparar()) {
            this.vivo = false;
           
            System.out.println("EL "+nombre+ "  ha matado... al participante "+usuario);
           
        }else{
            System.out.println(" se ha salvado.... el participante: "+usuario);

   }
       
    }
    
        
        
    

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
     
}
