package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString()
public class ObjectDto {
    @JsonProperty("key")
    public String key;
    @JsonProperty("size")
    public String size;
}
