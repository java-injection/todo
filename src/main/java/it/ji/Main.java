package it.ji;

import it.ji.drivers.ClickUpAPI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            String tasks = ClickUpAPI.getInstance().getTasks("216205964");
            System.out.println(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}