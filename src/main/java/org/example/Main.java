package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();


        System.out.printf("Fill %s: %s", listType, System.currentTimeMillis() - time);
    }
}