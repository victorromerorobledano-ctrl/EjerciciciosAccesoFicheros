import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A3_v2_Completo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = teclado.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            int contador = 0;
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("El fichero '" + nombre + "' tiene " + contador + " líneas.");

        } catch (IOException e) {
            System.out.println("No se ha podido leer el fichero: " + e.getMessage());
        }
    }
}
