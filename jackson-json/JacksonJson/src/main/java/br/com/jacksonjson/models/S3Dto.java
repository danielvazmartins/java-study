package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.ToString;

@JsonIncludeProperties({"bucket","object"})
@ToString()
public class S3Dto {
    public BucketDto bucket;
    public ObjectDto object;
}
