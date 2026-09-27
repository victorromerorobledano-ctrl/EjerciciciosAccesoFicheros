import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A3_v1_Prueba {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Fichero: ");
        String nombre = teclado.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        int contador = 0;
        while (br.readLine() != null) {
            contador++;
        }
        System.out.println(contador);
        br.close();
    }
}
