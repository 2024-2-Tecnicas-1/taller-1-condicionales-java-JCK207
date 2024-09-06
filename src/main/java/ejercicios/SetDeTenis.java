package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
        String respuesta = "Ganó ";
        int x;
        int y;
        if (numVictoriasA>=numVictoriasB) {
            x = numVictoriasA;
            y = numVictoriasB;
            respuesta += "A";
        } else {
            x = numVictoriasB;
            y = numVictoriasA;
            respuesta += "B";
        }
        
        switch (x) {
            case 6:
                if (x-y<2) respuesta = "Aún no termina";
            break;
            case 7:
                if (y!=5 && y!=6) respuesta = "Inválido";
            break;
            default:
                if (x<6) respuesta = "Aún no termina";
                else respuesta = "Inválido";
        }
        
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
