import java.io.File;

public class E4_v1_Prueba {
    public static void main(String[] args) {
        File fichero = new File("copias/config.txt");
        fichero.delete();

        File dir = new File("copias");
        dir.delete();
        System.out.println("Fin");
    }
}
