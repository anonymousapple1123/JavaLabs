//Testing json IO
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Person{
    String name;
    int age;
    String[] hobbies;
}

public class json_t {

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        try(Person person = om.readValue(new File("example.json"), person.class)){
            IO.println()
        }
    }
}
