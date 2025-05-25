package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EventDto {

    @JsonProperty("Records")
    private List<RecordDto> records;

    public List<RecordDto> getRecords() {
        return records;
    }

    public void setRecords(List<RecordDto> records) {
        this.records = records;
    }

    @Override()
    public String toString() {

        return "{\"Records\":[" + records.get(0).toString() + "]}";
    }
}
