package com.example.Http;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Client {
    OkHttpClient okHttpClient;

    public Client() {
        okHttpClient = new OkHttpClient();
    }

    public String get(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();

        String response = null;
        try{
            response = okHttpClient.newCall(request).execute().body().string();
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
        return response;
    }
}
