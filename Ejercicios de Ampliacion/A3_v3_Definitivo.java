import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class A3_v3_Definitivo {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el nombre del fichero: ");
            String nombre = teclado.nextLine().trim();

            int lineas = contarLineas(nombre);
            if (lineas >= 0) {
                System.out.println("El fichero '" + nombre + "' contiene " + lineas + " línea(s).");
            }
        }
    }

    private static int contarLineas(String nombreFichero) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            while (br.readLine() != null) {
                contador++;
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer '" + nombreFichero + "': " + e.getMessage());
            return -1;
        }
        return contador;
    }
}
