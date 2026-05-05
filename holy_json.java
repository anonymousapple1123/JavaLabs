import java.io.IOError;
import java.nio.file.Files;
import java.nio.file.Paths;

public class holy_json {

    public static boolean write_to(String name) {
        try {
            String json = Files.readString(Paths.get(name));
            IO.println(json);
            IO.println("Read successful !");
        } catch (Exception e) {
            IO.println("Failes to read");
        }
        return false;
    }

    public static void main() {
        write_to("example.json");
    }
}
