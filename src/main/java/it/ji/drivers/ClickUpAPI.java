package it.ji.drivers;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class ClickUpAPI {

    private static ClickUpAPI _instance = null;
    private static String API_TOKEN = "API_TOKEN";
    private static final String BASE_URL = "https://api.clickup.com/api/v2";

    private final OkHttpClient client;
    private ClickUpAPI(){
        //load env variables called API_TOKEN
        String apiToken = System.getenv("API_TOKEN");
        if (apiToken != null) {
            System.out.println("API_TOKEN: " + apiToken);
        } else {
            System.out.println("API_TOKEN non è impostato.");
        }
        API_TOKEN = apiToken;

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

    public String test(String listId) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + "/list/" + listId + "/field")
                .addHeader("Authorization", API_TOKEN)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}

