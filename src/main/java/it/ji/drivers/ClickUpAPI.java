package it.ji.drivers;

import java.util.List;

public class ClickUpAPI {

    private static ClickUpAPI _instance = null;

    private ClickUpAPI(){

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


}

