package com.epam.entity;

import lombok.Value;

@Value  // the immutable variant of @Data all fields are made private and final by default, and setters are not generated.
        // The class itself is also made final by default, because immutability is not something that can be forced onto a subclass.
public class ValueExample {

    private String name = "Aset";
    private Integer age = 30;
}
