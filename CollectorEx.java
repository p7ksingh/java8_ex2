package com.arr.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "java", "aws", "devops", "cloud", "cloud", "cloud", "cloud",
                "cloud", "cloud", "cloud");
        // list.stream().collect(Collectors.groupingBy(Function.identity(),
        // Collectors.counting()))
        // .forEach((k, v) -> System.out.println(k + " : " + v));
        list.stream().collect(Collectors.groupingBy(dt -> dt, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));
        // How to short course list
        list.stream().sorted().forEach(System.out::println);
    }
}
