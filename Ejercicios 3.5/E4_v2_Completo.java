import java.io.File;

public class E4_v2_Completo {
    public static void main(String[] args) {
        File fichero = new File("copias/config.txt");

        if (fichero.exists()) {
            boolean borrado = fichero.delete();
            System.out.println(borrado ? "config.txt eliminado." : "No se pudo eliminar config.txt.");
        } else {
            System.out.println("config.txt no existe, nada que eliminar.");
        }

        File dir = new File("copias");

        boolean dirBorrado = dir.delete();
        if (dirBorrado) {
            System.out.println("Directorio 'copias' eliminado correctamente (estaba vacío).");
        } else {
            System.out.println("No se pudo eliminar 'copias' (¿aún contiene ficheros?).");
        }
    }
}
