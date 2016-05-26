Welcome to __Instasent Java SDK__. This repository contains Instasent's Java SDK and samples for REST API.

## Installation
[https://github.com/instasent/instasent-java-lib/releases/download/0.1.0/instasent-java-lib.jar]
## Example
### Send an SMS
You can check 'examples/ExampleSendSms.java' file.
```java
import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token", true);
        Map<String, String> response = instasentClient.sendSms( "My company", "+34666666666", "test message");
        System.out.println(response);
    }
}
```
## Available functions
```
instasentClient.sendSms(sender, to, text, callback);
instasent.getSms(page, per_page)
instasent.getSmsById(message_id)
```
## Documentation
Complete documentation at :
[http://docs.instasent.com/](http://docs.instasent.com/).
# Getting help

If you need help installing or using the library, please contact Instasent Support at support@instasent.com first.
If you've instead found a bug in the library or would like new features added, go ahead and open issues or pull requests against this repo!
