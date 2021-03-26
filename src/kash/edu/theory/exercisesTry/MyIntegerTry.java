package kash.edu.theory.exercisesTry;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  MyInteger
  @version  1.0.0 
  @since 26.03.2021 - 19.10
*/

public class MyIntegerTry {
    // determine is the X number prime or not ( divide by 1 and by X)
    public static boolean isPrime(int numberToCheck){


        if(numberToCheck != 1){
            for (int i = 2; i < numberToCheck; i++) {
                if(numberToCheck % i == 0){
                    return false; // is not a prime number
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(21)); // false
        System.out.println(isPrime(11)); // true
        System.out.println(isPrime(31)); // true
        System.out.println(isPrime(1001)); // ? false

    }
}
