import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class E3_v3_Definitivo {

    private static final String FICHERO_ORIGEN = "datos.txt";
    private static final String FICHERO_DESTINO = "copia.txt";

    public static void main(String[] args) {
        int lineas = copiarFichero(FICHERO_ORIGEN, FICHERO_DESTINO);
        if (lineas >= 0) {
            System.out.println("Copia completada: '" + FICHERO_DESTINO + "' generado con " + lineas + " línea(s).");
        }
    }


    private static int copiarFichero(String origen, String destino) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al copiar de '" + origen + "' a '" + destino + "': " + e.getMessage());
            return -1;
        }
        return contador;
    }
}
