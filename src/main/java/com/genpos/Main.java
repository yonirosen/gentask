package com.genpos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <WorkItem> wis = new ArrayList<>();
        wis.add(new WorkItem("aa1", "bb2"));
        wis.add(new WorkItem("cc3", "dd4"));

        System.out.println("======");

        wis.stream()
        .flatMap(w -> w.getNames().stream())
        .forEach(i -> System.out.println("==> " + i));
    }
}