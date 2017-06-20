import java.io.IOException;
import java.util.Map;
import com.instasent.InstasentClient;

public class SendSms {

    public static void main(String[] args) throws IOException {

        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.sendSms( "My company", "+34666666666", "test message");
        System.out.println(response);

    }

}
