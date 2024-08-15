package ejercicio4.pkg8_metodos_abstractos;

public class Velocista extends Ciclista {
    private double potencia_promedio;
    private double velocidad_sprint;
    public Velocista(int id, String nombre, double potencia_promedio, double velocidad_sprint){
        super(id,nombre);
        this.potencia_promedio = potencia_promedio;
        this.velocidad_sprint = velocidad_sprint;
    }
    double getPotenciaPromedio(){
        return potencia_promedio;
    }
    void setPotenciaPromedio(double potencia_promedio){
        this.potencia_promedio = potencia_promedio;
    }
    double getVelocidadPromedio(){
        return velocidad_sprint;
    }
    void setVelocidadPromedio(double velocidad_sprint){
        this.velocidad_sprint = velocidad_sprint;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Potencia promedio= "+ potencia_promedio + "\nVelocidad promedio= " + velocidad_sprint);
    }
    String imprimirTipo(){
        return "Es un velocista";
    }
}
