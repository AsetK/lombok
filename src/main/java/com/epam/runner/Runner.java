package com.epam.runner;

import com.epam.entity.*;

import java.io.IOException;
import java.io.OutputStream;

public class Runner {

    public static void main(String[] args) {

        // val
        ValExample valExample = new ValExample();
        System.out.println(valExample.example());
        valExample.example2();

        // var
        VarExample varExample = new VarExample();
        varExample.example();

        // @NonNull
        NonNullExample nonNullExample = new NonNullExample("Hello World!");
        nonNullExample.example("Hello World!");

        // @Cleanup
        CleanupExample cleanupExample = new CleanupExample();
        //will throw exception because stream is closed. If doesn't use @Cleanup, next write command will work.
//        OutputStream outputStream = cleanupExample.example();
//        try {
//            outputStream.write("hello2".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // @Getter @Setter
        GetterSetterExample getterSetterExample = new GetterSetterExample();
        getterSetterExample.setAge(30);
        getterSetterExample.setName("Aset");
        System.out.println(getterSetterExample.getName() + " - " + getterSetterExample.getAge());

        // @ToString
        ToStringExample toStringExample = new ToStringExample();
        toStringExample.setName("Aset");
        toStringExample.setAge(30);
        System.out.println(toStringExample);

        // @EqualsAndHashCode
        EqualsAndHashCodeExample equalsAndHashCodeExample1 = new EqualsAndHashCodeExample();
        equalsAndHashCodeExample1.setAge(30);
        equalsAndHashCodeExample1.setName("Aset");
        EqualsAndHashCodeExample equalsAndHashCodeExample2 = new EqualsAndHashCodeExample();
        equalsAndHashCodeExample2.setAge(31);
        equalsAndHashCodeExample2.setName("Aset");

        System.out.println(equalsAndHashCodeExample1.hashCode());
        System.out.println(equalsAndHashCodeExample2.hashCode());
        System.out.println(equalsAndHashCodeExample1.equals(equalsAndHashCodeExample2));

        // @XArgsConstructor
        XArgsConstructor xArgsConstructor1 = new XArgsConstructor();
        XArgsConstructor xArgsConstructor2 = new XArgsConstructor("Aset", 29);
        System.out.println(xArgsConstructor1);
        System.out.println(xArgsConstructor2);

        // @Data
        DataExample dataExample = new DataExample("Aset", 30);
        dataExample.setAge(31);
        dataExample.setName("Aset");

        System.out.println(dataExample + " - " + dataExample.hashCode());

        // @Value - Immutable @Data
        ValueExample valueExample = new ValueExample();
        System.out.println(valueExample + " - " + valueExample.hashCode());

        // @Builder
        BuilderExample builderExample = BuilderExample.builder().name("Aset").age(30).build();
        System.out.println(builderExample);

        // @Log
        LogExample logExample = new LogExample();
        logExample.someMethod();


    }
}
