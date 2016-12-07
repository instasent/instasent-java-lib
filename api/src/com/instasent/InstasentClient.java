package com.instasent;

import okhttp3.*;
import org.json.simple.JSONValue;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class InstasentClient {

    private String secureChannel = "https://api.instasent.codes";
    private String token;

    public InstasentClient(String token) {
        this.token = token;
    }

    public Map<String, String> sendSms(String from, String to, String text) {
        String url;

        url = this.secureChannel + "/sms/";

        String httpMethod = "POST";

        Map<String, String> data = new HashMap<String, String>();
        data.put("from", from);
        data.put("to", to);
        data.put("text", text);

        return this.execRequest(url, httpMethod, data);
    }

    public Map<String, String> getSms(int page, int per_page) {

        String url;

        url = this.secureChannel + "/sms/?" + "page=" + page + "&per_page=" + per_page;

        String httpMethod = "GET";

        Map<String, String> data = new HashMap<String, String>();

        return this.execRequest(url, httpMethod, data);
    }

    public Map<String, String> getSmsById(String id) {

        String url;

        url = this.secureChannel + "/sms/" + id;

        String httpMethod = "GET";

        Map<String, String> data = new HashMap<String, String>();

        return this.execRequest(url, httpMethod, data);
    }

    private Map<String, String> execRequest(String url, String httpMethod, Map<String, String> data) {

        Map<String, String> resp = null;
        Response response = null;

        try {


            if (httpMethod == "POST") {
                StringWriter out = new StringWriter();
                JSONValue.writeJSONString(data, out);
                String jsonText = out.toString();

                OkHttpClient client = new OkHttpClient();

                MediaType mediaType = MediaType.parse("application/json");
                RequestBody body = RequestBody.create(mediaType, jsonText);
                Request request = new Request.Builder()
                        .url(url)
                        .post(body)
                        .addHeader("content-type", "application/json")
                        .addHeader("accept", "application/json")
                        .addHeader("authorization", "Bearer "+this.token)
                        .addHeader("cache-control", "no-cache")
                        .build();

                response = client.newCall(request).execute();
            } else {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url(url)
                        .get()
                        .addHeader("content-type", "application/json")
                        .addHeader("accept", "application/json")
                        .addHeader("authorization", "Bearer "+this.token)
                        .addHeader("cache-control", "no-cache")
                        .build();

                response = client.newCall(request).execute();
            }

            String responseBody = response.body().string();

            resp = new HashMap<String, String>();
            resp.put("response_body", responseBody);
            resp.put("response_code", String.valueOf(response.code()) );

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return resp;
    }


}
