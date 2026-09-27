import java.io.File;

public class E3_v1_Prueba {
    public static void main(String[] args) {
        File dir = new File("copias");
        File[] elementos = dir.listFiles();

        for (File f : elementos) {
            System.out.println(f.getName());
        }
    }
}
