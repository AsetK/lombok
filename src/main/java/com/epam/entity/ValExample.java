package com.epam.entity;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class ValExample {

    public String example(){
        //When you do this, the type will be inferred from the initializer expression. The local variable will also be made final.
        // This feature works on local variables and on foreach loops only, not on fields. The initializer expression is required.

        val list = new ArrayList<String>();
        list.add("Hello");
        list.add("World!");

        val item = list.get(0);
        return item.toLowerCase();
    }

    public void example2(){
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(1, "one");

        for(val entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
