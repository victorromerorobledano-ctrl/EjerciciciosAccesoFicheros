import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A2_v2_Completo {

    private static final int LINEAS_POR_PAGINA = 24;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre del fichero a mostrar: ");
        String nombre = teclado.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;

                if (contador == LINEAS_POR_PAGINA) {
                    System.out.println("--- Pulsa Intro para continuar ---");
                    teclado.nextLine();
                    contador = 0;
                }
            }

        } catch (IOException e) {
            System.out.println("No se ha podido leer el fichero: " + e.getMessage());
        }
    }
}
