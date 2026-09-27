import java.io.File;


public class E4_v3_Definitivo {

    private static final String NOMBRE_DIRECTORIO = "copias";
    private static final String NOMBRE_FICHERO = "config.txt";

    public static void main(String[] args) {
        File dir = new File(NOMBRE_DIRECTORIO);
        File fichero = new File(dir, NOMBRE_FICHERO);

        eliminarFichero(fichero);
        eliminarDirectorio(dir);
    }

    private static void eliminarFichero(File fichero) {
        if (!fichero.exists()) {
            System.out.println("El fichero '" + fichero.getName() + "' no existe.");
            return;
        }
        boolean borrado = fichero.delete();
        System.out.println(borrado
                ? "Fichero '" + fichero.getName() + "' eliminado correctamente."
                : "No se ha podido eliminar '" + fichero.getName() + "'.");
    }

    private static void eliminarDirectorio(File dir) {
        if (!dir.exists()) {
            System.out.println("El directorio '" + dir.getName() + "' no existe.");
            return;
        }

        File[] contenido = dir.listFiles();
        boolean vacio = (contenido != null && contenido.length == 0);

        boolean borrado = dir.delete();

        if (borrado) {
            System.out.println("Directorio '" + dir.getName() + "' eliminado correctamente (estaba vacío).");
        } else {
            System.out.println("No se ha podido eliminar '" + dir.getName() + "'. "
                    + (vacio ? "El directorio estaba vacío; puede haber un problema de permisos."
                             : "El directorio todavía contiene elementos."));
        }
    }
}
