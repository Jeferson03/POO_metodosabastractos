package ejercicio4.pkg8_metodos_abstractos;

public class Contrarrelojista extends Ciclista{
    double velocidad_maxima;
    public Contrarrelojista(int id,String nombre,float velocidad_maxima){
        super(id, nombre);
        this.velocidad_maxima = velocidad_maxima;
    }
    double getVelocidadMáxima() {
    return velocidad_maxima;
    }
   
    void setVelocidadMáxima(double velocidad_maxima) {
    this.velocidad_maxima = velocidad_maxima;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio = "+velocidad_maxima);
    }
    String imprimirTipo(){
        return "es un contrarrelojista";
    }
}
