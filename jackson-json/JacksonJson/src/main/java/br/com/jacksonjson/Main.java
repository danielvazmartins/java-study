package br.com.jacksonjson;

import br.com.jacksonjson.classes.JsonService;
import br.com.jacksonjson.models.EventDto;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando aplicação...");

        JsonService jsonService = new JsonService();

        JsonNode jsonNode = jsonService.loadJsonToNode();
        System.out.println(jsonNode);

        EventDto event = jsonService.loadJsonToModel();
        System.out.println("Event Version: " + event.getRecords().get(0).getVersion());
        System.out.println("Event Source: " + event.getRecords().get(0).getSource());

        jsonService.printJson(event);
        System.out.println("To String: " +event.toString());
    }
}