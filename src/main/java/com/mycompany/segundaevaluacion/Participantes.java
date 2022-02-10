
package com.mycompany.segundaevaluacion;


public class Participantes {
    private int usuario;
    private String nombre;
    private boolean vivo;
    
    public Participantes(int id){
        this.usuario = id;
        this.nombre = "Participante"+id;
        this.vivo = true;
    }
    public boolean Fuego(Revolver r){
        System.out.println("EL" +nombre+" apunta con el revolver al siguiente jugador");
        if (r.disparar()) {
            this.vivo = false;
            System.out.println("EL"+nombre+"ha matado... al"+nombre);
        }else{
            System.out.println("El"+nombre+"se ha salvado....");
        }
        return vivo;
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
    
}
