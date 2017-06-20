import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class GetVerifyById {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.getVerifyById("id");
        System.out.println(response);
    }

}