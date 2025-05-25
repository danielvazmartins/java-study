package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIncludeProperties({"eventVersion","eventSource"})
public class RecordDto {
    @JsonProperty("eventVersion")
    public String version;

    @JsonProperty("eventSource")
    public String source;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override()
    public String toString() {
        return "{\"version\":\"" + version + "\",\"source\":\"" + source + "}";
    }
}
