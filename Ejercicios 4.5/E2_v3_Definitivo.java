import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class E2_v3_Definitivo {

    private static final String NOMBRE_FICHERO = "datos.txt";

    public static void main(String[] args) {
        String palabra = pedirPalabra();
        int coincidencias = contarLineasConPalabra(NOMBRE_FICHERO, palabra);

        if (coincidencias >= 0) {
            System.out.println(coincidencias + " línea(s) del fichero contienen la palabra \"" + palabra + "\".");
        }
    }

    private static String pedirPalabra() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce la palabra a buscar: ");
            return teclado.nextLine().trim();
        }
    }

    private static int contarLineasConPalabra(String nombreFichero, String palabra) {
        String palabraMinuscula = palabra.toLowerCase();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.toLowerCase().contains(palabraMinuscula)) {
                    contador++;
                }
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer '" + nombreFichero + "': " + e.getMessage());
            return -1;
        }
        return contador;
    }
}
