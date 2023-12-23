package it.ji.drivers.models;

import java.util.Arrays;

public class ClickUp_Field {
    private String id;
    private String name;
    private String type;
    private boolean required;
    private boolean hide_from_guests;
    private long date_created;
    private ClickUp_TypeConfig[] type_config;

    public ClickUp_Field(String id, String name, String type, boolean required, boolean hide_from_guests, long date_created, ClickUp_TypeConfig[] type_config) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.required = required;
        this.hide_from_guests = hide_from_guests;
        this.date_created = date_created;
        this.type_config = type_config;
    }

    public ClickUp_Field() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isHide_from_guests() {
        return hide_from_guests;
    }

    public void setHide_from_guests(boolean hide_from_guests) {
        this.hide_from_guests = hide_from_guests;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public ClickUp_TypeConfig[] getType_config() {
        return type_config;
    }

    public void setType_config(ClickUp_TypeConfig[] type_config) {
        this.type_config = type_config;
    }

    @Override
    public String toString() {
        return "ClickUp_Field{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", required=" + required +
                ", hide_from_guests=" + hide_from_guests +
                ", date_created=" + date_created +
                ", type_config=" + Arrays.toString(type_config) +
                '}';
    }
}
