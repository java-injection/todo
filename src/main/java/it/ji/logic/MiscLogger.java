package it.ji.logic;

import it.ji.properties.Configurations;

public class MiscLogger {
    private static MiscLogger instance = null;

    private MiscLogger() {
    }

    public static MiscLogger getInstance() {
        if (instance == null) {
            instance = new MiscLogger();
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
