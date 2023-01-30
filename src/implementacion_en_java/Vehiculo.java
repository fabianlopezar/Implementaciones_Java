/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion_en_java;

/**
 *
 * @author INTEL i 7
 */
public class Vehiculo {

    public int kilometros;
    private int velocidad;
    public int precio;
    public String marca;
    public String color;
    static double descuento = 2000;
//--- Metodo constructor ---

    public Vehiculo() {
        kilometros = 500;
        velocidad = 300;
    }
//--- Metodo constructor ---

    public Vehiculo(String marca, String color, int precio, int kilometros, int velocidad) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.kilometros = kilometros;
        this.velocidad = velocidad;
    }

    //--- Metodos Accesores ---
    //--- (Setters) ---
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //--- (Getters) ---
    public int getVelocidad() {
        return velocidad;
    }

    public void arrancar() {
        System.out.println("El carro arranco");
    }

    void detenerse() {
        System.out.println("El carro se detuvo");
    }

    public int KilometrosRecorridos() {
        int recorrido = kilometros * velocidad;
        return recorrido;
    }

    void frenar() {
        System.out.println("El automovil freno");
    }

    void propiedades() {
        System.out.println("La marca es: " + marca);
        System.out.println("El color es: " + color);
        System.out.println("Su precio es: " + precio);
    }

}
