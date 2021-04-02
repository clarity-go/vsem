package kash.edu.theory.module3try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  ExperementList
  @version  1.0.0 
  @since 02.04.2021 - 18.41
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExperementList {
    public static void main(String[] args) {
        // beginning array - slower
        // --------------------- MIDDLE ---------------------
        // -------------------- arrayList --------------------
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, 99);
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish)); // 79

        // -------------------- linkedList --------------------
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, 99);
        }
        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish)); // 0

        // --------------------- MIDDLE ---------------------
        System.out.println("------------------- MIDDLE ------------------------");
        // -------------------- arrayList --------------------
        List<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList1.add(i);
        }
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(50000, 99);
        }
        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish)); // 54

        // -------------------- linkedList --------------------
        List<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(50000, 99);
        }
        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start, finish)); // 115
    }
}
