import java.io.File;


public class E1_v3_Definitivo {

    private static final String NOMBRE_DIRECTORIO = "copias";

    public static void main(String[] args) {
        File dir = new File(NOMBRE_DIRECTORIO);
        crearDirectorio(dir);
    }

    private static void crearDirectorio(File dir) {
        if (dir.exists()) {
            if (dir.isDirectory()) {
                System.out.println("El directorio '" + dir.getName() + "' ya existe. No se crea de nuevo.");
            } else {
                System.out.println("Ya existe un fichero con el nombre '" + dir.getName() + "', no se puede crear el directorio.");
            }
            return;
        }

        boolean creado = dir.mkdir();
        if (creado) {
            System.out.println("Directorio '" + dir.getAbsolutePath() + "' creado correctamente.");
        } else {
            System.out.println("Error: no se ha podido crear el directorio '" + dir.getName() + "'.");
        }
    }
}
