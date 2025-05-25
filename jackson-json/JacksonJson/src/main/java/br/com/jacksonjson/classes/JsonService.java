package br.com.jacksonjson.classes;

import br.com.jacksonjson.models.EventDto;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class JsonService {
    File jsonFile = new File("src/main/resources/event.json");
    ObjectMapper objectMapper = new ObjectMapper();

    public EventDto loadJsonToModel() throws IOException {
        System.out.println("loadJsonToModel");
        return objectMapper.readValue(jsonFile, EventDto.class);
    }

    public JsonNode loadJsonToNode() throws IOException {
        System.out.println("loadJsonToNode");
        return objectMapper.readTree(jsonFile);
    }

    public void printJson(EventDto event) throws IOException {
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, event);
        System.out.println(stringWriter);
    }
}
