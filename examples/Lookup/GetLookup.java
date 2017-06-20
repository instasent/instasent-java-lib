import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class GetLookup {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.getLookups(1, 10);
        System.out.println(response);
    }

}