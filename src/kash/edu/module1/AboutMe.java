package kash.edu.module1;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  AboutMe
  @version  1.0.0 
  @since 08.03.2021 - 18.11
*/

public class AboutMe {

    public static void main(String[] args) {
        // type byte
        byte myAge = 22;
        System.out.println("My age is " + myAge + " years.");

        // type short
        short yearOfBirth = 1998;
        System.out.println("I was born in " + yearOfBirth + " year.");

        // type int
        int numberOfDegrees = 2;
        System.out.println("I have " + numberOfDegrees + " university degrees: " +
                "the bachelor's degree in linguistics and " +
                "the master's degree in economic cybernetics.");

        // type long
        long numberOfStudents = 40_000l;
        System.out.println("There are " + numberOfStudents +
                " students in my university.");

        // type float
        float diplomaScore = 91.5f;
        System.out.println("My diploma score is " + diplomaScore + ".");

        // type double
        double myHeight = 163.5;
        System.out.println("My height is " + myHeight + " cm.");

        // type char
        char sign = 'K';
        System.out.println("The first letter of my surname is " + sign + ".");

        // type boolean
        boolean wantImprove = true;
        System.out.println("I want to level up my programming skills! " +
                "It is" + wantImprove);

        // type string
        String str = "I would like to level up my programming skills!";
        System.out.println(str);
    }
}
