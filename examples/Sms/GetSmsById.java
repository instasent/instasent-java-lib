import java.io.IOException;
import java.util.Map;
import com.instasent.InstasentClient;

public class getSmsById {

    public static void main(String[] args) throws IOException {

        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.getSmsById("message-id");
        System.out.println(response);

    }

}
