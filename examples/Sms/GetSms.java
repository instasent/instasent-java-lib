import java.io.IOException;
import java.util.Map;
import com.instasent.InstasentClient;

public class GetSms {

    public static void main(String[] args) throws IOException {

        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.getSms( 1, 10);
        System.out.println(response);

    }

}
