
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        String respuesta = "No es letra ni número";
        if (48<=caracter && caracter<=57) respuesta = "Es número";
        if (65<=caracter && caracter<=90) respuesta = "Es letra mayúscula";
        if (97<=caracter && caracter<=122) respuesta = "Es letra minúscula";
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
