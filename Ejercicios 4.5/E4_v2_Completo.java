import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E4_v2_Completo {
    public static void main(String[] args) {
        String origen = "datos.txt";
        String destino = "copia.txt";
        int copiadas = 0;
        int omitidas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    omitidas++;
                    continue;
                }
                bw.write(linea);
                bw.newLine();
                copiadas++;
            }

            System.out.println("Copia completada: " + copiadas + " línea(s) copiadas, " + omitidas + " línea(s) vacías omitidas.");

        } catch (IOException e) {
            System.out.println("Error al copiar el fichero: " + e.getMessage());
        }
    }
}
