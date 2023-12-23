package it.ji.drivers.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClickUp_Option {
    private String id;
    private String name;
    private String color;
    private int orderindex;

    public ClickUp_Option(String id, String name, String color, int orderindex) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.orderindex = orderindex;
    }

    public ClickUp_Option() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOrderindex() {
        return orderindex;
    }

    public void setOrderindex(int orderindex) {
        this.orderindex = orderindex;
    }

    @Override
    public String toString() {
        return "ClickUp_Option{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", orderindex=" + orderindex +
                '}';
    }
}
