/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.pkg8_metodos_abstractos;

/**
 *
 * @author jefeg
 */
public class Escalador extends Ciclista{
    float aceleracion_subida;
    float grado_rampa;
    public Escalador(int id, String nombre, float aceleracion_subida, float grado_rampa){
        super(id,nombre);
        this.aceleracion_subida = aceleracion_subida;
        this.grado_rampa = grado_rampa;
    }
    float getAceleracionPromedio(){
        return aceleracion_subida;
    }
    void setAceleracionPromedio(float aceleracion_subida){
        this.aceleracion_subida = aceleracion_subida;
    }
    float getGradoRampa(){
        return grado_rampa;
    }
    void setGradoRampa(float grado_rampa){
        this.grado_rampa = grado_rampa;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Aceleración promedio en subida= "+aceleracion_subida+"\nGrado de rampa= "+grado_rampa);
    }
    String imprimirTipo(){
        return "Es un escalador";
    }
}   
   