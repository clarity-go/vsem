package kash.edu.theory.module3try;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  collectionsTry
  @version  1.0.0 
  @since 29.03.2021 - 19.22
*/

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectionsTry {
    public static void main(String[] args) {

        Random random = new Random();
        int random1 = random.nextInt(1000);

        //----------------------- Arrays -----------------------
        int[] arrayInt = new int[5];
        arrayInt[0] = 7;
        arrayInt[1] = 4;
        arrayInt[2] = 3;
        arrayInt[3] = 0;
        arrayInt[4] = 2;

        System.out.println(arrayInt[2]);
        Arrays.sort(arrayInt);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        //-------------------- Collections --------------------
        // primitive types can not be used in lists
        // ArrayList
        List<Integer> listInt = new ArrayList<>();
        listInt.add(67);
        listInt.add(61);
        listInt.add(6);
        listInt.add(17);
        listInt.add(55);

        // add to the beginning
        listInt.add(0,100);
        listInt.add(0,101);
        listInt.add(0,102);
        listInt.add(0,103);
        listInt.add(0,104);

        // add to the middle
        int indexOfCenter = listInt.size() / 2;
        listInt.add(indexOfCenter,200);

        System.out.println(listInt.get(3));
        System.out.println("size" + listInt.size());

        listInt.remove(2); // delete one of items depending on index

        System.out.println(listInt.toString());
        System.out.println(listInt.contains(97));

        // update: old delete, new insert


        // Initalize 1
        List<Integer> list2 = new ArrayList<>(
                Arrays.asList(32, 21, 22, 41, 90)
        );

        // Initalize 2
        List<Integer> lest3 = Stream.of(1, 21, 22).collect(Collectors.toList());

        // LinkedList (different structures of the class in comparison with ArrayList,
        // but the result is the same)
        List<Integer> linkedList = new LinkedList<>();

        // CRUD: create (add()), read (get()), update - =, delete (remove())

        // Exercise 1:
        // ArrayList
        listInt.clear();
        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            listInt.add(random.nextInt(1000));
        }

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(finish, start);
        System.out.println(duration);

        // LinkedList: faster than ArrayList
        start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println(duration);

        System.out.println(listInt.size());

        Arrays.sort(arrayInt); // sort array
        listInt.sort(Comparator.comparing(Function.identity())); // sort list

        // SOLID
        // include result

    }
}
