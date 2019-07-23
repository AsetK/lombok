package com.epam.entity;

import lombok.var;

public class VarExample {

    public void example() {
        //var works exactly like val, except the local variable is not marked as final. Type must be same.

        var text = "hello_1";
        text = "hello_2";
        System.out.println(text);
    }
}
