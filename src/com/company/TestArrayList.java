package com.company;
import java.util.ArrayList; // чтобы мы могли использовать конструкцию new ArrayList<>()

import java.util.List;// в List уже есть import java.util.Collections, но это нужно для  Collections.sort(names);
import java.util.Collections;

public class TestArrayList {

    public static void Test()

    {
        List<String> names = new ArrayList<>(); //
        names.add("Запуск программы");
        names.add("Выполнение");
        names.add("Выход");

        Collections.sort(names);
        System.out.println(names);
    }

}
