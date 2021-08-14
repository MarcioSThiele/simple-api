package com.thielem.SimpleApi.adapters.repository.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Person {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private Integer age;
}
