import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A1_v1_Prueba {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        FileWriter fw = new FileWriter("frases.txt");

        System.out.println("Escribe frases (fin para terminar):");
        String frase = teclado.nextLine();
        while (!frase.equals("fin")) {
            fw.write(frase + "\n");
            frase = teclado.nextLine();
        }

        fw.close();
        System.out.println("Guardado");
    }
}
