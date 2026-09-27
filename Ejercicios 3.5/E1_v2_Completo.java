import java.io.File;

public class E1_v2_Completo {
    public static void main(String[] args) {
        File dir = new File("copias");

        if (dir.exists()) {
            System.out.println("El directorio ya existe.");
        } else {
            boolean creado = dir.mkdir();
            if (creado) {
                System.out.println("Directorio 'copias' creado correctamente.");
            } else {
                System.out.println("No se ha podido crear el directorio.");
            }
        }
    }
}
