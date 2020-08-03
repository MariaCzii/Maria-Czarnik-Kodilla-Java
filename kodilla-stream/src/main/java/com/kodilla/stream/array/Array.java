package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Array {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        Stream <String> stream = list.stream();

        stream.forEach((String e) -> {
            System.out.println(e);
        });
    }
}