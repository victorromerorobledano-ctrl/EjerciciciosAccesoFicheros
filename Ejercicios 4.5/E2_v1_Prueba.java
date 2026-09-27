import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E2_v1_Prueba {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Palabra: ");
        String palabra = teclado.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        int contador = 0;
        String linea = br.readLine();
        while (linea != null) {
            if (linea.contains(palabra)) {
                contador++;
            }
            linea = br.readLine();
        }
        System.out.println(contador);
        br.close();
    }
}
