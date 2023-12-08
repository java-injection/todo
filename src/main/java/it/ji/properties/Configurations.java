package it.ji.properties;

import it.ji.annotations.Priority;

import java.io.FileInputStream;
import java.util.EnumMap;
import java.util.Map;
import java.util.Properties;

public class Configurations {
    private static Configurations instance = null;
    private Map<SettingsKeys, Object> settingsMap = new EnumMap<>(SettingsKeys.class);
    private Properties properties = null;
    private Configurations() {
        loadProperties();
    }

    public static Configurations getInstance() {
        if (instance == null) {
            instance = new Configurations();
        }
        return instance;
    }
    private void loadProperties(){
        //carica il file di properties al path ./settings.properties e poi carica i valori nella mappa settingsMap
        try (FileInputStream fis = new FileInputStream("./settings.properties")){
            properties = new Properties();
            properties.load(fis);
            for (SettingsKeys key : SettingsKeys.values()) {
                System.out.println("key: " + key + " value: " + properties.getProperty(key.getKey()));
                settingsMap.put(key, properties.getProperty(key.getKey()));
            }
        } catch (Exception e) {
            System.out.println("Errore durante il caricamento del file di properties");
            e.printStackTrace();

        }
    }
    public Object getProperty(SettingsKeys key) {
        return settingsMap.get(key);
    }


    public boolean isVerbose() {
        return Boolean.parseBoolean((String) settingsMap.get(SettingsKeys.VERBOSE)) ;
    }

}
