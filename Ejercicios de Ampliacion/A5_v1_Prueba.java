import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A5_v1_Prueba {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Fichero: ");
        String nombre = teclado.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        int contador = 0;
        while (br.readLine() != null) {
            contador++;
        }
        br.close();

        String[] lineas = new String[contador];
        BufferedReader br2 = new BufferedReader(new FileReader(nombre));
        int i = 0;
        String linea = br2.readLine();
        while (linea != null) {
            lineas[i] = linea;
            i++;
            linea = br2.readLine();
        }
        br2.close();

        FileWriter fw = new FileWriter("salida.txt");
        for (int j = lineas.length - 1; j >= 0; j--) {
            fw.write(lineas[j] + "\n");
        }
        fw.close();
        System.out.println("Hecho");
    }
}
