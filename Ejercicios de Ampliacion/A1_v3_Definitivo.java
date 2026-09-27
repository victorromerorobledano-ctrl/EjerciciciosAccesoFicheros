import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A1_v3_Definitivo {

    private static final String NOMBRE_FICHERO = "frases.txt";
    private static final String PALABRA_SALIDA = "fin";

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int guardadas = pedirYGuardarFrases(teclado, NOMBRE_FICHERO);
            if (guardadas >= 0) {
                System.out.println(guardadas + " frase(s) guardadas correctamente en '" + NOMBRE_FICHERO + "'.");
            }
        }
    }

    private static int pedirYGuardarFrases(Scanner teclado, String nombreFichero) {
        int contador = 0;
        System.out.println("Introduce frases, una por línea. Escribe \"" + PALABRA_SALIDA + "\" para terminar.");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            String frase = teclado.nextLine();
            while (!frase.equalsIgnoreCase(PALABRA_SALIDA)) {
                bw.write(frase);
                bw.newLine();
                contador++;
                frase = teclado.nextLine();
            }
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en '" + nombreFichero + "': " + e.getMessage());
            return -1;
        }
        return contador;
    }
}
