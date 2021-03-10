package kash.edu.module1;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  AboutMe
  @version  1.0.0 
  @since 08.03.2021 - 18.11
**/

// Task: Write to console 8 facts about yourself using primitive types.

public class AboutMe {

    public static void main(String[] args) {
        // type byte
        byte myAge = 22;
        System.out.println("My age is " + myAge + " years.");

        // type short
        short yearOfBirth = 1998;
        System.out.println("I was born in " + yearOfBirth + " year.");

        // type int
        int degreeNumber = 2;
        System.out.println("I have " + degreeNumber + " university degrees.");

        // type long
        long numberOfStudents = 40_000l;
        System.out.println("There are " + numberOfStudents +
                " students in my university.");

        // type float
        float diplomaScore = 90.5f;
        System.out.println("My diploma score is " + diplomaScore + ".");

        // type double
        double myHeight = 162.5;
        System.out.println("My height is " + myHeight + " cm.");

        // type char
        char surnameLetter = 'K';
        System.out.println("The first letter of my surname: " + surnameLetter);

        // type boolean
        boolean wantImprove = true;
        System.out.println("I want to level up my programming skills! " +
                "It is" + wantImprove);

        // type string
        String str = "I would like to develop myself!";
        System.out.println(str);
    }
}
