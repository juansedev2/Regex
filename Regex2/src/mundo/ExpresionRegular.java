/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Juan Sebastian Esta clase tendrá funciones para validar los siguiente casos con regex Validar un correo electrónico
 *
 */
public class ExpresionRegular {

    // Atributos de la clase
    private Pattern pat;
    private Matcher mat;

    public ExpresionRegular() {

    }

    // Validar un correo electrónico (que la cadena tenga la estructura ordinaria de un correo)
    public void validarCorreo(String email) {
        //¿? Acaso esto no se puede reducri con Pattern.matches(regex, cadena)?
        this.pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        this.mat = pat.matcher(email);
        if (mat.find()) {
            System.out.println("Correo electrónico válido");
        } else {
            System.out.println("Correo electrónico inválido");
        }
    }

    // Comprobar si la cadena contiene exactamente el patrón (matches) "xyz"
    public void validarCadena(String cadena) {
        this.pat = Pattern.compile("xyz");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI es xyz");
        } else {
            System.out.println("No es xyz");
        }
    }

    // Comprobar si la cadena contiene "xyz"
    public void validarCadena2(String cadena) {
        this.pat = Pattern.compile(".*xyz.*");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI contiene xyz");
        } else {
            System.out.println("No contiene xyz");
        }
    }

    // Comprobar si la cadena comienza por "xyz" ó "Xyz"
    public void validarInicioCadena(String cadena) {
        this.pat = Pattern.compile("^[xX]yz.*");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI comienza con xyz/Xyz");
        } else {
            System.out.println("No comienza con xyz/Xyz");
        }
    }

    // Comprobar si la cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10
    public void validarLetras(String cadena) {
        this.pat = Pattern.compile("[a-zA-Z]{5,10}");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("No");
        }
    }

    // Comprobar si la cadena no comienza por un dígito
    public void iniciarDigito(String cadena) {
        this.pat = Pattern.compile("^[^\\d].*");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI comienza por un dígito");
        } else {
            System.out.println("No comienza por un dígito");
        }
    }

    // Comprobar si la cadena no acaba por un dígito
    public void finalizarDigito(String cadena) {

        this.pat = Pattern.compile(".*[^\\d]$");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI termina por un dígito");
        } else {
            System.out.println("No termina por un dígito");
        }
    }

    // Comprobar si la cadena solo contiene los caracteres x o y
    public void incluirLetras(String cadena) {

        this.pat = Pattern.compile("(x|y)+");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Solo contiene x/y");
        } else {
            System.out.println("No contiene a x/y solamente");
        }
    }

    // Comprobar si la cadena contiene un 1 y ese 1 no está seguido por un 2
    public void excluirDigito(String cadena) {

        this.pat = Pattern.compile(".*1(?!2).*");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("Si contiene un 1 y no le sigue un 2");
        } else {
            System.out.println("No cumple para 1 sin ser seguido de 2");
        }
    }

    // Comprobar si un correo es común y no personalizado (que no sea hotmail ni gmail)
    public void esCorreoComun(String cadena) {
        if (this.validarCorreo2(cadena)) {  // Valida primero que sea un correo electrónico
            
            this.pat = Pattern.compile("(\\W|^)[\\w.\\-]{0,25}@(yahoo|hotmail|gmail)\\.com(\\W|$)");
            this.mat = pat.matcher(cadena);

            if (mat.matches()) {
                System.out.println("El correo es de dominio gmail/hotmail/yahoo");

            } else {
                System.out.println("Es un correo con dominio personalizado");
            }
        }else{
            System.out.println("Para empezar, no es un correo electrónico");
        }
    }

    // Comprobar si la dirección ip se encuentra en el rango (192.168.1.0 - 192.168.1.255)
    public void existeRangoIP(String cadena) {
        this.pat = Pattern.compile("192\\.168\\.1\\.\\d{1,3}");
        this.mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La dirección ip está dentro del rango");
        } else {
            System.out.println("La dirección ip NO está dentro del rango");
        }
    }

    // Validar un correo electrónico (que la cadena tenga la estructura ordinaria de un correo)
    public boolean validarCorreo2(String email) {
        //¿? Acaso esto no se puede reducri con Pattern.matches(regex, cadena)?
        this.pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        this.mat = pat.matcher(email);
        return mat.find();
    }

}
