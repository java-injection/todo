package it.ji.properties;

public enum SettingsKeys {
    VERBOSE("logger.verbose"),
    LANGUAGE("general.language");

    private String key;

    private SettingsKeys(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
