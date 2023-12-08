package it.ji.logic;

import it.ji.annotations.Priority;
import it.ji.properties.Configurations;

public class PropertiesLogger {
    private static PropertiesLogger instance = null;

    private PropertiesLogger() {
    }

    public static PropertiesLogger getInstance() {
        if (instance == null) {
            instance = new PropertiesLogger();
        }
        return instance;
    }
    public void log(String message) {

        if (Configurations.getInstance().isVerbose()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[INFO] ").append(message);
            System.out.println(sb.toString());
        }
    }


}
