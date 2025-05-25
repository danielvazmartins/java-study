package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIncludeProperties({"eventVersion","eventSource","s3"})
public class RecordDto {
    @JsonProperty("eventVersion")
    public String version;

    @JsonProperty("eventSource")
    public String source;

    public S3Dto s3;

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
        return "{\"version\":\"" + version + "\",\"source\":\"" + source + "\",\"s3\":\"" + s3 + "\"}";
    }
}
