package io.ahenteti.java.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.ahenteti.java.jackson.model.Pojo;
import io.ahenteti.java.jackson.service.ObjectMapperFactory;

public class Main {

    private static ObjectMapperFactory objectMapperFactory = new ObjectMapperFactory();

    public static void main(String[] args) throws Exception {
        String pojoJsonOrigin = "{\"metadata\":{\"backend\":\"backend\",\"collectTime\":\"2020-06-13T20:47:57+0000\"},\"data\":{\"prop2\":1,\"prop1\":\"value1\",\"prop4\":9.99,\"prop3\":100}}";
        ObjectMapper objectMapper = objectMapperFactory.create();
        Pojo pojo = objectMapper.readValue(pojoJsonOrigin, Pojo.class);
        String pojoJson = objectMapper.writeValueAsString(pojo);
        System.out.println(pojoJson);
    }
}
