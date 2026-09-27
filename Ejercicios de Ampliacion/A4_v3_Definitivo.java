import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A4_v3_Definitivo {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el nombre del fichero: ");
            String nombre = teclado.nextLine().trim();

            String[] lineas = leerLineas(nombre);
            if (lineas != null) {
                mostrarInverso(lineas);
            }
        }
    }

    private static String[] leerLineas(String nombreFichero) {
        int total = contarLineas(nombreFichero);
        if (total < 0) {
            return null;
        }

        String[] lineas = new String[total];
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                lineas[i++] = linea;
            }
        } catch (IOException e) {
            System.out.println("Error al leer '" + nombreFichero + "': " + e.getMessage());
            return null;
        }
        return lineas;
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

    private static void mostrarInverso(String[] lineas) {
        System.out.println("Contenido del fichero en orden inverso:");
        for (int i = lineas.length - 1; i >= 0; i--) {
            System.out.println(lineas[i]);
        }
    }
}
