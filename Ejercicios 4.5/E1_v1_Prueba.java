import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E1_v1_Prueba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        int contador = 0;
        String linea = br.readLine();
        while (linea != null) {
            contador++;
            linea = br.readLine();
        }
        System.out.println(contador);
        br.close();
    }
}
