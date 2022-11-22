/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mundo;

// Importamos los módulos de reges de Matcher y Pattern para usar las regex
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Juan Sebastian
 * Esta clase contendrá expresiones en funciones para trabajar validar los siguientes casos:
 * La fecha con formato dd/mm/aa
 * Un nombre que contenga solo letras
 * Un número de teléfono con formato 000-000000
 */
public class ExpresionRegular {
    
    // Esta clase solo cargará con funciones
    public ExpresionRegular(){
    }
    
    // Validar que una fecha tenga el formato dd/mm/aa
    public boolean esUnaFecha(String fechaLeida){
        return Pattern.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d", fechaLeida);
    }
    
    // Validar que un nombre solamente contenga letras
    public boolean esUnNombre(String nombre){
        return Pattern.matches("[A-z][a-zA-Z]*", nombre);
    }
    
    // Validar que un núermo de teléfono tenga el formato 000-000000 y sin letras
    public boolean esUnTelefono(String telefono){
        return Pattern.matches("\\d\\d\\d-\\d\\d\\d\\d\\d\\d", telefono);
    }
    
    
    
    
}
