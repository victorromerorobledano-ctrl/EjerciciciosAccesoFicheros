import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1_v2_Completo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreFichero = "frases.txt";
        int contador = 0;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            System.out.println("Escribe frases (escribe 'fin' para terminar):");
            String frase = teclado.nextLine();

            while (!frase.equalsIgnoreCase("fin")) {
                bw.write(frase);
                bw.newLine();
                contador++;
                frase = teclado.nextLine();
            }

            System.out.println(contador + " frase(s) guardadas en '" + nombreFichero + "'.");

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }
}
