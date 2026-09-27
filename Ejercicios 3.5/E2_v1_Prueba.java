import java.io.File;
import java.io.IOException;

public class E2_v1_Prueba {
    public static void main(String[] args) throws IOException {
        File fichero = new File("copias/config.txt");
        fichero.createNewFile();
        System.out.println("Fin");
    }
}
