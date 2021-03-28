package kash.edu.theory.module2try.exerciese2try;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  MyInteger
  @version  1.0.0 
  @since 26.03.2021 - 19.10
*/

public class MyIntegerTry {
    // determine is the X number prime or not (divide by 1 and by X)
    public static boolean isPrime(int numberToCheck){

        boolean isPrime = true;

        if (numberToCheck == 1){
            isPrime = false;
        }
        else{
            for (int i = 2; i < numberToCheck; i++) {
                if(numberToCheck % i == 0){
                    isPrime = false; // is not a prime number
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(12)); // false
        System.out.println(isPrime(21)); // false
        System.out.println(isPrime(31)); // true
        System.out.println(isPrime(73)); // true
        System.out.println(isPrime(1001)); // false

    }
}
