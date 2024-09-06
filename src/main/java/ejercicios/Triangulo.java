package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
        String respuesta = "No es un triángulo válido";
        if (a<b+c && b<a+c && c<a+b) {
            respuesta = "El triángulo es ";
            if (a==b || a==c) {
                if (b==c) respuesta += "equilátero";
                else respuesta += "isósceles";
            } else if (b==c) respuesta += "isósceles";
                else respuesta += "escaleno";
        }
        
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
