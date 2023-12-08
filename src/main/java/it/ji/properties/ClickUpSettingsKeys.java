package it.ji.properties;

public enum ClickUpSettingsKeys {
    CLICKUP_TOKEN("clickup.token"),
    CLICKUP_TEAM("clickup.team"),
    CLICKUP_FOLDER("clickup.folder"),
    CLICKUP_LIST("clickup.list"),
    CLICKUP_DEFAULT_PRIORITY("clickup.default.priority"),
    CLICKUP_STATUS("clickup.status"),
    CLICKUP_ASSIGNEE("clickup.assignee"),
    CLICKUP_TIME_ESTIMATE("clickup.time_estimate"),
    CLICKUP_TIME_SPENT("clickup.time_spent");

    private String key;

    private ClickUpSettingsKeys(String key) {
        this.key = key;
    }


}
