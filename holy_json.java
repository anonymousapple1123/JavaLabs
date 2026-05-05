import java.nio.file.Files;
import java.nio.file.Paths;

public class holy_json {

    public static String read_json(String name) {
        //boolean flag = false;
        String send = "";
        try {
            String json = Files.readString(Paths.get(name));
            //IO.println(json);
            IO.println("Read successful !");
            send = json;
            //flag = true;
        } catch (Exception e) {
            //flag = false;
            IO.println("Failes to read");
        }
        return send;
    }

    public static void main() {
        String data = read_json("example.json");
        String token = data.substring(5, 9).strip();
        if (token.equals("name")) {
            IO.println(data.substring(13, 17).strip());
        } else {
            IO.println("token: " + token);
        }
    }
}
