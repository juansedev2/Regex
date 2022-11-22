/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intefaz;

import java.util.Scanner;
import mundo.ExpresionRegular;

/**
 *
 * @author Juan Sebastian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vamos a comprobar los casos de expresiones regulares
        ExpresionRegular regex = new ExpresionRegular();
        Scanner scn = new Scanner(System.in);
        String cadena;
        System.out.println("Digite un correo electrónico");
        cadena = scn.next();
        regex.validarCorreo(cadena);
        System.out.println("Comprobar si la cadena contiene exactamente el patrón (matches) \"xyz\"");
        cadena = scn.next();
        regex.validarCadena(cadena);
        System.out.println("Comprobar si la cadena contiene xyz como por ejemplo 123xyzabc");
        System.out.println("Digite uno del mismo tipo");
        cadena = scn.next();
        regex.validarCadena2(cadena);
        System.out.println("Comprobar si la cadena comienza por xyz ó Xyz");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.validarInicioCadena(cadena);
        System.out.println("Comprobar si la cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.validarLetras(cadena);
        System.out.println("Comprobar si la cadena no comienza por un digito");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.iniciarDigito(cadena);
        System.out.println("Comprobar si la cadena no acaba con un dígito");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.finalizarDigito(cadena);
        System.out.println("Comprobar si la cadena solo contien los caracteres x o y");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.incluirLetras(cadena);
        System.out.println("Comprobar si la cadena contiene un 1 y ese 1 no está seguido por un 2");
        System.out.println("Digite una cadena");
        cadena = scn.next();
        regex.excluirDigito(cadena);
        System.out.println("Digite un nuevo correo:");
        cadena = scn.next();
        regex.esCorreoComun(cadena);
        System.out.println("Digite la dirección ip para conocer si está en el rango válido:");
        cadena = scn.next();
        regex.existeRangoIP(cadena);
        
        
        
    }

}
