import java.io.BufferedReader;
import java.io.FileReader;

public class holy_json {

    public static String read_json(String file_name, String key1, String key2) {
        String line;
        String send = "EOF";
        try (
            BufferedReader br = new BufferedReader(new FileReader(file_name))
        ) {
            while ((line = br.readLine()) != null) {
                IO.println(">" + line + "<" + "\nSIZE :" + line.length());
                IO.println("-----------------------------------");
                IO.println(
                    "STRIPPED >" +
                        line.strip() +
                        "<" +
                        "\nSTRIPPED SIZE :" +
                        line.strip().length()
                );
                if (line.contains(":")) {
                    IO.println("< FILE: Key-Value pair detected >");
                }
                if (line.contains("[") && line.contains("]")) {
                    IO.println("< FILE: Array detected >");
                }

                IO.println("=========================================");
            }
            //String json = Files.readString(Paths.get(file_name));
            //IO.println(json);
            //IO.println("Read successful !");
            //send = json;
            //flag = true;
        } catch (Exception e) {
            //flag = false;
            IO.println("Error in reading json.");
        }
        return send;
    }

    public static void main() {
        String data = read_json("example.json", "", "");
        IO.println(data);
        //String token = data.substring(5, 9).strip();
        // String token = "name";
        // if (data.contains(token)) {
        //     IO.println(
        //         data.substring(
        //             data.indexOf(token) + token.length() + 3,
        //             data.indexOf(token) + token.length() + 10
        //         )
        //     );
        // } else {
        //     IO.println("token: " + token);
        // }
    }
}
