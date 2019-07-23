package com.epam.entity;

import lombok.NonNull;

public class NonNullExample {

    String st;

    // You can use @NonNull on the parameter of a method or constructor to have lombok generate a null-check statement for you.

    public NonNullExample(@NonNull String text){ }

    public void example (@NonNull String text){
        System.out.println(text);
    }
}
