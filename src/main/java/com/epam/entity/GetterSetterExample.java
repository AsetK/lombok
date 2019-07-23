package com.epam.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter //annotate all the non-static fields in that class with the annotation. Also we can use it on fields
public class GetterSetterExample {

    private String name;
    private Integer age;

}
