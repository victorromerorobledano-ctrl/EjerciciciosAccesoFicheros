import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E1_v2_Completo {
    public static void main(String[] args) {
        String nombreFichero = "datos.txt";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("El fichero '" + nombreFichero + "' tiene " + contador + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
