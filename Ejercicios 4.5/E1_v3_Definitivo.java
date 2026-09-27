import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class E1_v3_Definitivo {

    private static final String NOMBRE_FICHERO = "datos.txt";

    public static void main(String[] args) {
        int totalLineas = contarLineas(NOMBRE_FICHERO);
        if (totalLineas >= 0) {
            System.out.println("El fichero '" + NOMBRE_FICHERO + "' contiene " + totalLineas + " línea(s).");
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
