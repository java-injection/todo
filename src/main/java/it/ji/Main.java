package it.ji;

import it.ji.drivers.ClickUpAPI;
import it.ji.drivers.models.ClickUp_CustomFieldsResponse;
import it.ji.drivers.models.ClickUp_Field;
import it.ji.logic.DataConverter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            String tasks = ClickUpAPI.getInstance().test("216205964");
            ClickUp_CustomFieldsResponse clickUpCustomFieldsResponse = DataConverter.fromJson(tasks, ClickUp_CustomFieldsResponse.class);
            for (ClickUp_Field customField : clickUpCustomFieldsResponse.getFields()) {
                System.out.println(customField);
            }
            System.out.println(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}