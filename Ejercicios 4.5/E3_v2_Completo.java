import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E3_v2_Completo {
    public static void main(String[] args) {
        String origen = "datos.txt";
        String destino = "copia.txt";
        int lineasCopiadas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
                lineasCopiadas++;
            }

            System.out.println("Fichero copiado correctamente en '" + destino + "' (" + lineasCopiadas + " líneas).");

        } catch (IOException e) {
            System.out.println("Error al copiar el fichero: " + e.getMessage());
        }
    }
}
