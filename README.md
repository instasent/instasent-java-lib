Welcome to __Instasent Java SDK__. This repository contains Instasent's Java SDK and samples for REST API.

## Installation
Download JAR and import it in your app (with dependencies) or if you prefer without dependencies.
https://github.com/instasent/instasent-java-lib/releases/download/v0.1.4/instasent-client-0.1.4-jar-with-dependencies.jar
https://github.com/instasent/instasent-java-lib/releases/download/v0.1.4/instasent-client-0.1.4.jar

## Example
### Send an SMS
You can check 'examples/ExampleSendSms.java' file.
```java
import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.sendSms( "My company", "+34666666666", "test message");
        System.out.println(response);
    }
}
```
## Available functions
```
SMS

instasentClient.sendSms(sender, to, text);
instasentClient.sendUnicodeSms(sender, to, text);
instasentClient.getSms(page, per_page)
instasentClient.getSmsById(message_id)

Verify

instasentClient.requestVerify(from, to, text, token_length, timeout, client_id);
instasentClient.getVerify(page, per_page)
instasentClient.getVerifyById(message_id)
instasentClient.checkVerify(id, token)

Lookup

instasentClient.doLookup(to;
instasentClient.getLookups(page, per_page)
instasentClient.getLookupById(message_id)

Account

instasentClient.getAccountBalance();


```
## Documentation
Complete documentation at :
[http://docs.instasent.com/](http://docs.instasent.com/).
# Getting help

If you need help installing or using the library, please contact Instasent Support at support@instasent.com first.
If you've instead found a bug in the library or would like new features added, go ahead and open issues or pull requests against this repo!