package kash.edu.theory.module3try.collectionsTry;
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

public class CollectionsTry {
    public static void main(String[] args) {

        Random random = new Random();
        int random1 = random.nextInt(1000);

        //----------------------- Arrays -----------------------
        int[] arrayInt = new int[3];
        arrayInt[0] = 7;
        arrayInt[1] = 4;
        arrayInt[2] = 3;

        System.out.println(arrayInt[2]);
        Arrays.sort(arrayInt);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

        //-------------------- Collections --------------------
        // CRUD: create - add(), read - get(), update - set(), delete - remove()
        // primitive types can not be used in lists, only Interfaces

        // ArrayList
        List<Integer> listInt = new ArrayList<>();
        listInt.add(67);
        listInt.add(61);
        listInt.add(6);
        listInt.add(17);
        listInt.add(55);

        // add to the beginning
        // add() - just add new element on a particular place, the number of elements increases,
        // because the new element pushes the existing on it place forward
        listInt.add(0,100);
        listInt.add(0,101);
        listInt.add(0,102);
        listInt.add(0,103);
        listInt.add(0,104);

        // add to the middle a particular number, do not use random()
        int indexOfCenter = listInt.size() / 2;
        listInt.add(indexOfCenter,200);

        System.out.println(listInt.get(3)); // access to the element of the list
        System.out.println("size" + listInt.size());
        // add to the end (but NOT the last) till 1 element to the end; size-1 or size-5

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

        // include result, output, conclusion: that in this case the LinkedList works faster... 25 vs 36

        // update list, check time for the end of the list (tail)
        System.out.println("----reading TAIL: ArrayList-----");
        listInt.set(10,7); // на 10 место поставить 7

        start = LocalDateTime.now();
        for (int i = 90000; i < 100000; i++) {
            int a = listInt.get(i);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("arrayList: " + duration); // 5


        System.out.println("----reading TAIL: LinkedList-----");
        listInt.set(10,7); // на 10 место поставить 7

        start = LocalDateTime.now();
        for (int i = 90000; i < 100000; i++) {
            int a = linkedList.get(i);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("linkedList: " + duration); //139



        // update list, check time for the end of the head (beginning)
        System.out.println("----reading HEAD: ArrayList-----");
        listInt.set(10,7); // на 10 место поставить 7

        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            int a = listInt.get(i);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("arrayList: " + duration); // 0


        System.out.println("----reading HEAD: LinkedList-----");
        listInt.set(10,7); // на 10 место поставить 7

        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            int a = linkedList.get(i);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("linkedList: " + duration); // 117


        //-------------------- Update --------------------
        System.out.println("----update: ArrayList-----");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            listInt.set(1, 100);
            // set - just change what stands on what element, the number of elements is the same
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("arrayList: " + duration);


        System.out.println("----update: LinkedList-----");
        start = LocalDateTime.now();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(1, 100);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("linkedList: " + duration);

        // reading better ArrayList, adding in the middle better LinkedList
    }
}
