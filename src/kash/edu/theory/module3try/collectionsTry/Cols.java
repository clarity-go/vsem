package kash.edu.theory.module3try.collectionsTry;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Cols
  @version  1.0.0 
  @since 31.03.2021 - 18.56
*/

import kash.edu.theory.module3try.Gender;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cols {
    public static void main(String[] args) {

        //---------------- Streams ---------------
        List<Integer> list = new ArrayList<>(
                Arrays.asList(12, 45, 55, 34, 84, 28)
        );

        // calculate sum of all elements using Cycle
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(sum); // 258

        // calculate sum of all elements using Streams
        int sum2 = list.stream().mapToInt(Integer::intValue).sum();

        // find the largest number among elements
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max); // 84

        List<StudentForCols> students = new ArrayList<>(
                Arrays.asList(
                        new StudentForCols("John Lenon", LocalDate.of(2003, Month.JULY, 1),
                                Gender.MALE, 90),
                        new StudentForCols("Paul McCarthney", LocalDate.of(2004, Month.JANUARY, 6),
                                Gender.MALE, 75),
                        new StudentForCols("Yoko Ono", LocalDate.of(2000, Month.JULY, 1),
                                Gender.FEMALE, 10),
                        new StudentForCols("Freddie Mercury", LocalDate.of(2004, Month.AUGUST, 23),
                                Gender.MALE, 85),
                        new StudentForCols("Tarja Turner", LocalDate.of(2002, Month.SEPTEMBER, 1),
                                Gender.MALE, 90)
                        )
        );

        // lambda function - get male students
        List<StudentForCols> men = students.stream()
                .filter(studentForCols -> studentForCols.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        System.out.println(men);

        //------------------------ lambda functions ------------------------
        // get F-mark students: Variant 1
        List<StudentForCols> fStudents = students.stream()
                .filter(studentForCols -> studentForCols.getMark() < 75)
                .collect(Collectors.toList());

        // get F-mark students: Variant 2
        List<StudentForCols> fStudents2 = students.stream()
                .filter(item -> item.getMark() < 75)
                .collect(Collectors.toList());

        // get the student with the max mark (by comparing students)
        StudentForCols aStudent = students.stream().max(Comparator.comparing(StudentForCols::getMark)).get();

        // calculate the average mark of all studetns (stream of students --> stream of their marks)
        double average = students.stream().mapToInt(StudentForCols::getMark).average().getAsDouble();
        System.out.println(average);

        // get the max and min marks
        int maxMark = students.stream().mapToInt(StudentForCols::getMark).max().getAsInt();
        int minMark = students.stream().mapToInt(StudentForCols::getMark).min().getAsInt();
    }
}
