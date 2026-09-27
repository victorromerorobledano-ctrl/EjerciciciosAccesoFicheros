import java.io.File;

public class E3_v2_Completo {
    public static void main(String[] args) {
        File dir = new File("copias");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("El directorio 'copias' no existe.");
            return;
        }

        File[] elementos = dir.listFiles();

        if (elementos == null || elementos.length == 0) {
            System.out.println("El directorio está vacío.");
            return;
        }

        for (File f : elementos) {
            String tipo = f.isDirectory() ? "Directorio" : "Fichero";
            System.out.println(tipo + ": " + f.getName());
        }
    }
}
