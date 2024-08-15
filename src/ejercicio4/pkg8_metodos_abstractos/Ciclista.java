package ejercicio4.pkg8_metodos_abstractos;

 public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempo_acumulado = 0;
    
    public Ciclista(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    abstract String imprimirTipo();
    
    int getIdentificador(){
        return id;
    }
    void setIdentificador(int id){
        this.id = id;
    }    
    String getNombre(){
        return nombre;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    int getPosicionGeneral(int posicion_general){
        return posicion_general;
    }
    void setPosicionGeneral(int posicion_general){
        posicion_general = posicion_general;
    }
    int getTiempoAcumulado(){
        return tiempo_acumulado;    
    }
    void setTiempoAcumulado(int tiempo_acumulado){
        this.tiempo_acumulado = tiempo_acumulado;
    }
    void imprimir(){
        System.out.println("Identificador = " + id + "\nNombre = " + nombre + "\nTiempo Acumulado = " + tiempo_acumulado);
    }
            
}
