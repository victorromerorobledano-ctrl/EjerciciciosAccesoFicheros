import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A4_v2_Completo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = teclado.nextLine();

        int total = contarLineas(nombre);
        if (total < 0) {
            return;
        }

        String[] lineas = new String[total];

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                lineas[i] = linea;
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return;
        }

        System.out.println("Contenido en orden inverso:");
        for (int j = lineas.length - 1; j >= 0; j--) {
            System.out.println(lineas[j]);
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
