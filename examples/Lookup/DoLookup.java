import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class DoLookup {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("id", true);
        Map<String, String> response = instasentClient.doLookup("+34666666666");
        System.out.println(response);
    }

}