package it.ji.drivers.models;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Arrays;

@JsonRootName(value = "type_config")
public class ClickUp_TypeConfig {
    private boolean new_drop_down;
    private ClickUp_Option[] options;
    private long date_created;
    private boolean hide_from_guests;
    private boolean required;


    public ClickUp_TypeConfig(boolean new_drop_down, ClickUp_Option[] options, long date_created, boolean hide_from_guests, boolean required) {
        this.new_drop_down = new_drop_down;
        this.options = options;
        this.date_created = date_created;
        this.hide_from_guests = hide_from_guests;
        this.required = required;
    }

    public ClickUp_TypeConfig() {
    }

    public boolean isNew_drop_down() {
        return new_drop_down;
    }

    public void setNew_drop_down(boolean new_drop_down) {
        this.new_drop_down = new_drop_down;
    }

    public ClickUp_Option[] getOptions() {
        return options;
    }

    public void setOptions(ClickUp_Option[] options) {
        this.options = options;
    }

    public long getDate_created() {
        return date_created;
    }

    public void setDate_created(long date_created) {
        this.date_created = date_created;
    }

    public boolean isHide_from_guests() {
        return hide_from_guests;
    }

    public void setHide_from_guests(boolean hide_from_guests) {
        this.hide_from_guests = hide_from_guests;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}
