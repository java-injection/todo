package it.ji.logic;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DataConverter {


    public static String prettyPrintJson(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        JsonNode jsonNode = mapper.readTree(jsonString);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws JsonProcessingException {
        //using jackson library
        ObjectMapper mapper = new ObjectMapper();
        T obj = mapper.readValue(json, clazz);
        return obj;
    }

    public static <T> String toJson(T obj) throws JsonProcessingException {
        //using jackson library
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(obj);
        return json;
    }

}
