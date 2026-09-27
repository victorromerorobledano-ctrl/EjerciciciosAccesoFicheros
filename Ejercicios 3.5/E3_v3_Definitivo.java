import java.io.File;

/**
 * Muestra el contenido del directorio "copias", indicando para cada
 * elemento si se trata de un fichero o de un directorio.
 */
public class E3_v3_Definitivo {

    private static final String NOMBRE_DIRECTORIO = "copias";

    public static void main(String[] args) {
        File dir = new File(NOMBRE_DIRECTORIO);
        listarContenido(dir);
    }

    private static void listarContenido(File dir) {
        if (!dir.exists()) {
            System.out.println("El directorio '" + dir.getName() + "' no existe.");
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println("'" + dir.getName() + "' no es un directorio.");
            return;
        }

        File[] elementos = dir.listFiles();

        if (elementos == null) {
            System.out.println("No se ha podido acceder al contenido del directorio (permisos).");
            return;
        }
        if (elementos.length == 0) {
            System.out.println("El directorio '" + dir.getName() + "' está vacío.");
            return;
        }

        System.out.println("Contenido de '" + dir.getName() + "':");
        for (File elemento : elementos) {
            String tipo = elemento.isDirectory() ? "[Directorio]" : "[Fichero]   ";
            System.out.println(" - " + tipo + " " + elemento.getName());
        }
    }
}
