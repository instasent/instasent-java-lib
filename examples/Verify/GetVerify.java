import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class GetVerify {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token", true);
        Map<String, String> response = instasentClient.getVerify(1, 10);
        System.out.println(response);
    }

}