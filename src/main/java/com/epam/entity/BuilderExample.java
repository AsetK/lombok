package com.epam.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter @Getter
@ToString
public class BuilderExample {

    private String name;
    private Integer age;


}
