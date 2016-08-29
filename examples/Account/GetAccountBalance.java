import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class GetAccountBalance {

    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token", true);
        Map<String, String> response = instasentClient.getAccountBalance();
        System.out.println(response);
    }

}