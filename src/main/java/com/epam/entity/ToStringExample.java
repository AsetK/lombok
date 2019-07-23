package com.epam.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter
public class ToStringExample {
    private static final String text = "Static field";
    private String name;
    private Integer age;


}
