import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class A2_v1_Prueba {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String nombre = teclado.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        String linea = br.readLine();
        int contador = 0;
        while (linea != null) {
            System.out.println(linea);
            contador++;
            if (contador == 24) {
                teclado.nextLine();
                contador = 0;
            }
            linea = br.readLine();
        }
        br.close();
    }
}
