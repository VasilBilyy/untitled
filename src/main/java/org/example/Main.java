package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int count = 100000;
        int insertCount = 1000;

        fill(arrayList, count, "ArrayList");
        fill(linkedList, count, "LinkedList");
        random_access(arrayList, count, "ArrayList");
        random_access(linkedList, count, "LinkedList");

    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < count; i++){
            list.add(random.nextInt(count + 1));
            //System.out.print(list.get(i)+"\n");
        }

        System.out.printf("Fill %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void random_access(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        System.out.println(list.get(random.nextInt(count)));
        System.out.printf("Fill %s: %s\n", listType, System.currentTimeMillis() - time);
    }
}