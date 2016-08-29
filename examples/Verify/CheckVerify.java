import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class CheckVerify {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token", true);
        Map<String, String> response = instasentClient.checkVerify("id", "token");
        System.out.println(response);
    }

}