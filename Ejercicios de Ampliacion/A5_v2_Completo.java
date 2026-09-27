import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A5_v2_Completo {

    private static final String FICHERO_SALIDA = "salida.txt";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero de entrada: ");
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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO_SALIDA))) {
            for (int j = lineas.length - 1; j >= 0; j--) {
                bw.write(lineas[j]);
                bw.newLine();
            }
            System.out.println("Fichero '" + FICHERO_SALIDA + "' generado con las líneas en orden inverso.");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero de salida: " + e.getMessage());
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
