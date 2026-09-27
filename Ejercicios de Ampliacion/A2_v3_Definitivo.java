import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class A2_v3_Definitivo {

    private static final int LINEAS_POR_PAGINA = 24;

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Nombre del fichero a mostrar: ");
            String nombre = teclado.nextLine().trim();
            mostrarConPausas(nombre, teclado);
        }
    }

    private static void mostrarConPausas(String nombreFichero, Scanner teclado) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            int contadorPagina = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contadorPagina++;

                if (contadorPagina == LINEAS_POR_PAGINA) {
                    System.out.println("--- Pulsa Intro para continuar ---");
                    teclado.nextLine();
                    contadorPagina = 0;
                }
            }
        } catch (IOException e) {
            System.out.println("No se ha podido leer '" + nombreFichero + "': " + e.getMessage());
        }
    }
}
