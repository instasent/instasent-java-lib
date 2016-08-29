import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class RequestVerify {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token", true);
        Map<String, String> response = instasentClient.requestVerify("my-company", "+34666666666", "Your code is %token%", "", "", "");
        System.out.println(response);
    }

}