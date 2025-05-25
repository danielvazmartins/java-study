package br.com.jacksonjson.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;

@JsonIgnoreProperties({"ownerIdentity"})
@ToString()
public class BucketDto {
    public String name;
    public String arn;
}
