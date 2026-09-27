import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E4_v1_Prueba {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        FileWriter fw = new FileWriter("copia.txt");

        String linea = br.readLine();
        while (linea != null) {
            if (linea.length() > 0) {
                fw.write(linea + "\n");
            }
            linea = br.readLine();
        }

        br.close();
        fw.close();
        System.out.println("Copiado sin lineas vacias");
    }
}
