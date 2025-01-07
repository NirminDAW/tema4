/**
 *
 * @author Nirmin
 */
import java.util.Scanner;

/**
 * Clase que verifica si un número ingresado es compuesto o no.
 */
public class PrimerNumeroCompuesto {

    /**
     * Método principal que solicita un número y verifica si es compuesto.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es compuesto: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (esCompuesto(numero)) {
            System.out.println(numero + " es un número compuesto.");
        } else {
            System.out.println(numero + " no es un número compuesto.");
        }
    }

    /**
     * Verifica si un número dado es compuesto.
     *
     * @param num Número a verificar.
     * @return true si el número es compuesto, false de lo contrario.
     */
    private static boolean esCompuesto(int num) {
        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
