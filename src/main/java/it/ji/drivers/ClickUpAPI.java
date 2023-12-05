package it.ji.drivers;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class ClickUpAPI {

    private static ClickUpAPI _instance = null;
    private static final String API_TOKEN = "APY_TOKEN";
    private static final String BASE_URL = "https://api.clickup.com/api/v2";

    private final OkHttpClient client;
    private ClickUpAPI(){
        client = new OkHttpClient();
    }

    public static ClickUpAPI getInstance(){
        if(_instance == null){
            _instance = new ClickUpAPI();
        }
        return _instance;
    }

    public List<String> getStatuses(){
        return List.of("todo", "in progress", "done");
    }


    public String getTasks(String listId) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/list/" + listId + "/task")
                .addHeader("Authorization", API_TOKEN)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


}

