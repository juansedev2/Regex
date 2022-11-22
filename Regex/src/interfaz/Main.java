/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import mundo.ExpresionRegular;

/**
 *
 * @author Juan Sebastian Esta es una aplicación que permite validar varias expresiones regulares, así que por favor leer cada módulo en su documentación
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vamos a usar todas las funciones que se encargan de los casos mencionados en la clase ExpresionRegular
        ExpresionRegular regex = new ExpresionRegular();
        String fecha = "15/11/2022";
        System.out.println("Validando expresiones regulares...");
        System.out.println("¿" + fecha + " es una fecha?");
        System.out.println(regex.esUnaFecha(fecha));
        String nombre = "Sebastian";
        System.out.println("¿" + nombre + " es una fecha?");
        System.out.println(regex.esUnNombre(nombre));
        String nombre2 = "1Sebastian2";
        System.out.println("¿" + nombre2 + " es una fecha?");
        System.out.println(regex.esUnNombre(nombre2));
        String telefono = "401-120933";
        System.out.println("¿" + telefono + " es un teléfono?");
        System.out.println(regex.esUnTelefono(telefono));
        String telefono2 = "401-A120933";
        System.out.println("¿" + telefono2 + " es un teléfono?");
        System.out.println(regex.esUnTelefono(telefono2));
    }

}
