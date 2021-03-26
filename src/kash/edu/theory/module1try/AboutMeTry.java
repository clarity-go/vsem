package kash.edu.theory.module1try;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  AboutMeTry
  @version  1.0.0 
  @since 14.03.2021 - 17.55
*/

public class AboutMeTry {
    public static void main(String[] args) {
        // 8 primitive types in java
        // byte +-127
        byte myAge = 22; // +-127
        System.out.println(" My age is " + myAge + " years.");

        // short 2^16 ~ 65000
        short year = 2021;
        System.out.println(" We have " + year + " year now.");

        // int 2^32 ~ 2 000 000 000
        int mySalary = 100_000;
        System.out.println(" My salary is " + mySalary + "$ a month.");

        // long 2^64
        long populationGlobal = 7_000_000_000l;
        System.out.println(" Global population is about " + populationGlobal + " humans.");

        // float
        float height = 185.5f;
        System.out.println(" My height is " + height + " cms.");

        // double 2.4444444444444444444444
        double weight = 95.9;
        System.out.println(" My weight is " + weight + " kgs.");

        //char
        char sign = 'K';
        System.out.println(" The first letter of my surname is " + sign);

        //boolean true/false
        boolean abcd = true;
        System.out.println(" Today it is the 1st of March. It is" + abcd);

        //string
        String str = "Hello Java";
        System.out.println(str);

        // 2 * 2 = 4 "Сколько будет 2 * 2 = 4?" 1 - True  0 - False
        // 10 * 10 = 100  (2 + 2 = 100) двоичный код
    }

}
