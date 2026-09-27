import java.io.File;
import java.io.IOException;


public class E2_v3_Definitivo {

    private static final String NOMBRE_DIRECTORIO = "copias";
    private static final String NOMBRE_FICHERO = "config.txt";

    public static void main(String[] args) {
        File dir = asegurarDirectorio();
        crearFichero(dir);
    }

    private static File asegurarDirectorio() {
        File dir = new File(NOMBRE_DIRECTORIO);
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directorio '" + NOMBRE_DIRECTORIO + "' creado.");
        }
        return dir;
    }

    private static void crearFichero(File dir) {
        File fichero = new File(dir, NOMBRE_FICHERO);

        if (fichero.exists()) {
            System.out.println("El fichero '" + fichero.getName() + "' ya existe en '" + dir.getName() + "'.");
            return;
        }

        try {
            boolean creado = fichero.createNewFile();
            if (creado) {
                System.out.println("Fichero '" + fichero.getPath() + "' creado correctamente.");
            } else {
                System.out.println("No se ha podido crear el fichero (motivo desconocido).");
            }
        } catch (IOException e) {
            System.out.println("Error de E/S al crear el fichero: " + e.getMessage());
        }
    }
}
