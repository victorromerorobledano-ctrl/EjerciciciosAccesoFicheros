import java.io.File;
import java.io.IOException;

public class E2_v2_Completo {
    public static void main(String[] args) {
        File dir = new File("copias");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File fichero = new File(dir, "config.txt");

        try {
            if (fichero.exists()) {
                System.out.println("El fichero config.txt ya existe.");
            } else {
                boolean creado = fichero.createNewFile();
                if (creado) {
                    System.out.println("Fichero config.txt creado correctamente.");
                } else {
                    System.out.println("No se ha podido crear el fichero.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }
}
