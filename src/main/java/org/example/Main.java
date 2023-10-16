package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

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
        sequential_access(arrayList, "ArrayList");
        sequential_access(linkedList, "LinkedList");
        insert_in_begin(arrayList, insertCount, "ArrayList");
        insert_in_begin(linkedList, insertCount, "LinkedList");
        insert_in_end(arrayList, insertCount, "ArrayList");
        insert_in_end(linkedList, insertCount, "LinkedList");
        insert_in_middle(arrayList, insertCount, "ArrayList");
        insert_in_middle(linkedList, insertCount, "LinkedList");
    }

    //Заповнення масиву
    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < count; i++){
            list.add(random.nextInt(count + 1));
            //System.out.print(list.get(i)+"\n");
        }

        System.out.printf("Fill %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    //Random Access (доступ за індексом)
    private static void random_access(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        System.out.println(list.get(random.nextInt(count)));
        System.out.printf("Random access in %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    //Sequential Access (доступ по ітератору)
    private static void sequential_access(List<Integer> list, String listType){
        long time = System.currentTimeMillis();
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            Integer elm = itr.next();
            //System.out.println(elm);
        }
        System.out.printf("Sequental access in %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    //Вставка на початок списку
    private static void insert_in_begin(List<Integer> list, int insertCount, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < insertCount; i++){
            //System.out.println(list.get(i));
            list.add(i, random.nextInt(insertCount));
            //System.out.println(list.get(i));
        }

        System.out.printf("Insert in the beginning of %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    //Вставка у кінець списку
    private static void insert_in_end(List<Integer> list, int insertCount, String listType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < insertCount; i++){
            list.add(random.nextInt(insertCount));
        }


        System.out.printf("Insert in the end of %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    //Вставка до середини списку
    private static void insert_in_middle(List<Integer> list, int insertCount, String listType){
        long time = System.currentTimeMillis();
        int start_position = list.size() / 2 - insertCount / 2;
        int final_position = start_position + insertCount;
        Random random = new Random();

        for (int i = start_position; i< final_position; i++){
            list.add(i, random.nextInt(insertCount));
        }

        System.out.printf("Insert in the middle of %s: %s\n", listType, System.currentTimeMillis() - time);
    }
}