package com.research.assistent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {

    private List<Candidates> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidates{
        private Content content;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content{
        private List<Part> parts;
    }
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part{
     private String text;
    }
}
