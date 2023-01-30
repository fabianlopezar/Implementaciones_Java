/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion_en_java;

import javax.swing.JOptionPane;

/**
 *
 * @author INTEL i 7
 */
public class Implementacion_en_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-------------------- INSTANCIAS --------------------------------------

        //Para hacer una instancia debo hacer:
        //1. Refencia a la clase creada.
        //2. Crear nombre de referencia
        //(al crear una instancia de una clase estoy creando un objeto).
        Vehiculo nombreObjeto1 = new Vehiculo();
        Vehiculo nombreObjeto2 = new Vehiculo("Ford", "Blanco", 40000, 60, 120);
        Vehiculo nombreObjeto3 = new Vehiculo("Nissan", "rojo", 41000, 52, 320);

        nombreObjeto1.arrancar();
        System.out.println(nombreObjeto1.KilometrosRecorridos());
        nombreObjeto1.frenar();

        //---------------------Recuperar(traer) atributo de un objeto ----------
        int klObj1 = nombreObjeto1.kilometros;
        System.out.println("Soy kilometros del objeto1: " + klObj1 + " kl");

        //------------------Modificar atributo de un objeto --------------------
        nombreObjeto1.kilometros = 499;
        System.out.println("Soy kilometros del objeto1: " + nombreObjeto1.kilometros + " kl");

        //------------ Encapsulamiento y métodos accesores ---------------------
        //Encapsulamiento es ocultar variables
        System.out.println("La velocidad es de: " + nombreObjeto1.getVelocidad() + " kl/h");
        nombreObjeto1.setVelocidad(15);
        System.out.println("La velocidad es de: " + nombreObjeto1.getVelocidad() + " kl/h");

        //----------- Impresion usando ventanas emergentes ---------------------
        //1.paso debo importar  import javax.swing.JOptionPane;
        //--> variables
        String cadena;
        int entero;
        char letra;
        double decimal;
        //--- Lectura de cadenas usando ventanas emergentes ---
        cadena = JOptionPane.showInputDialog("Digite una cadena de texto: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        //--- Impresion usando ventanas emergentes ---
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);

    }

}
