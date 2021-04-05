package kash.edu.module3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Collections
  @version  1.0.0 
  @since 31.03.2021 - 18.23
**/
/*         JavaCollectionsFramework. List.
                       TASK:
1. Create ArrayList and LinkedList containing 100000 Integer
elements. Compare time intervals.
2. Insert  new 1000 elements on the beginning, on the middle
and on the end of ones. Compare time intervals.
3. Update 1000 elements  from the beginning, from the middle
and from the end of ones. Compare time intervals.
4. Delete 1000 elements  from the beginning, from the middle
and from the end of ones. Compare time intervals.
*/

public class Collections {
    public static void main(String[] args) {

        Random random = new Random();

        // 1. Create ArrayList and LinkedList containing 100000 Integer
        // elements. Compare time intervals.

        //--------------------- Create ArrayList ---------------------
        List<Integer> arrayList = new ArrayList<>();
        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(1000));
        }

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("----------- Create -----------" +
                "\nArrayList: \n • duration: " + duration + " msec" +
                "\n • size: " + arrayList.size() + " elements");

        //--------------------- Create LinkedList ---------------------
        List<Integer> linkedList = new LinkedList<>();
        start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        // 2. Insert  new 1000 elements on the beginning, on the middle
        // and on the end of ones. Compare time intervals.

        //--------------------- Insert HEAD (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Insert (HEAD) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Insert HEAD (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");


        //--------------------- Insert MID (ArrayList) ---------------------
        int indexOfCenter = arrayList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(indexOfCenter, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Insert (MID) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Insert MID (LinkedList) ---------------------
        indexOfCenter = linkedList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(indexOfCenter, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");


        //--------------------- Insert TAIL (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() - 1, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Insert (END) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Insert TAIL (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 1, 666);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        // 3. Update 1000 elements  from the beginning, from the middle
        // and from the end of ones. Compare time intervals.

        //--------------------- Update HEAD (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Update (HEAD) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Update HEAD (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        //--------------------- Update MID (ArrayList) ---------------------
        indexOfCenter = arrayList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(indexOfCenter + i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Update (MID) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Update MID (LinkedList) ---------------------
        indexOfCenter = linkedList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(indexOfCenter + i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        //--------------------- Update TAIL (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 2; i < 1002; i++) {
            arrayList.set(arrayList.size() - i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Update (END) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Update TAIL (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 2; i < 1002; i++) {
            linkedList.set(linkedList.size() - i, 555);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        // 4. Delete 1000 elements  from the beginning, from the middle
        // and from the end of ones. Compare time intervals.

        //--------------------- Delete HEAD (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(0);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Delete (HEAD) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Delete HEAD (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        //--------------------- Delete MID (ArrayList) ---------------------
        indexOfCenter = arrayList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(indexOfCenter);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Delete (MID) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Delete MID (LinkedList) ---------------------
        indexOfCenter = linkedList.size() / 2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(indexOfCenter);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");

        //--------------------- Delete TAIL (ArrayList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 2);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("\n-------- Delete (END) --------" +
                "\nArrayList: \n • duration: " + duration +
                " msec" + "\n • size: " + arrayList.size() + " elements");

        //--------------------- Delete TAIL (LinkedList) ---------------------
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 2);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("LinkedList: \n • duration: " + duration +
                " msec" + "\n • size: " + linkedList.size() + " elements");
    }
}

/* OUTPUT:
--------------------------- Create ----------------------------
ArrayList:                          LinkedList:
• duration: 48 msec                 • duration: 18 msec
• size: 100000 elements             • size: 100000 elements

------------------------ Insert (HEAD) ------------------------
ArrayList:                          LinkedList:
• duration: 39 msec                 • duration: 0 msec
• size: 101000 elements             • size: 101000 elements

------------------------ Insert (MID) ------------------------
ArrayList:                          LinkedList:
• duration: 115 msec                • duration: 0 msec
• size: 102000 elements             • size: 102000 elements

------------------------ Insert (TAIL) ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 0 msec
• size: 103000 elements             • size: 103000 elements

------------------------ Update (HEAD)  ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 0 msec
• size: 103000 elements             • size: 103000 elements

------------------------ Update (MID) ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 105 msec
• size: 103000 elements             • size: 103000 elements

------------------------ Update (TAIL) ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 0 msec
• size: 103000 elements             • size: 103000 elements

------------------------ Delete (HEAD) ------------------------
ArrayList:                          LinkedList:
• duration: 34 msec                 • duration: 3 msec
• size: 102000 elements             • size: 102000 elements

------------------------ Delete (MID) ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 110 msec
• size: 101000 elements             • size: 101000 elements

------------------------ Delete (TAIL) ------------------------
ArrayList:                          LinkedList:
• duration: 0 msec                  • duration: 0 msec
• size: 100000 elements             • size: 100000 elements
*/
