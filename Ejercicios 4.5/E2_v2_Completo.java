import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E2_v2_Completo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = teclado.nextLine().trim().toLowerCase();

        String nombreFichero = "datos.txt";
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.toLowerCase().contains(palabra)) {
                    contador++;
                }
            }
            System.out.println(contador + " línea(s) contienen la palabra '" + palabra + "'.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
