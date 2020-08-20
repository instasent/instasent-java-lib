Welcome to __Instasent Java SDK__. This repository contains Java SDK for Instasent's REST API.

# Notice!

> **Verify** product is currently deprecated and will be removed in the next release. The same functionality can be easily implemented by sending an SMS. If you need help migrating please contact usage

## Installation

Download JAR and import it in your app (with dependencies): https://github.com/instasent/instasent-java-lib/releases/download/v0.1.4/instasent-client-0.1.4-jar-with-dependencies.jar

If you prefer without dependencies: https://github.com/instasent/instasent-java-lib/releases/download/v0.1.4/instasent-client-0.1.4.jar

# Usage

Check the [examples directory](https://github.com/instasent/instasent-java-lib/tree/master/examples) to see working examples of this SDK usage

### Sending an SMS

```java
import com.instasent.InstasentClient;
import java.io.IOException;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        InstasentClient instasentClient = new InstasentClient("my-token");
        Map<String, String> response = instasentClient.sendSms("Company", "+34666666666", "test message");
        System.out.println(response);
    }
}
```

If you want to send an Unicode SMS (i.e with 😀 emoji) you only need to replace `sendSms` call to `sendUnicodeSms`

```ruby
Map<String, String> response = instasentClient.sendUnicodeSms("Company", "+34666666666", "Unicode test: ña éáíóú 😀");
```

## Available actions

```
SMS
instasentClient.sendSms(sender, to, text);
instasentClient.sendUnicodeSms(sender, to, text);
instasentClient.getSms(page, per_page)
instasentClient.getSmsById(message_id)

LOOKUP
instasentClient.doLookup(to;
instasentClient.getLookups(page, per_page)
instasentClient.getLookupById(message_id)

ACCOUNT
instasentClient.getAccountBalance();
```

# Full documentation

Full documentation of the API can be found at http://docs.instasent.com/

# Getting help

If you need help installing or using the SDK, please contact Instasent Support at support@instasent.com

If you've instead found a bug in the library or have a feature request, go ahead and open an issue or pull request!
