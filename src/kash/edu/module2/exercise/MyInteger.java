package kash.edu.module2.exercise;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  MyIntegerTry
  @version  1.0.0 
  @since 28.03.2021 - 14.40
**/

// Task: Create a class MyInteger.
// Design a method public static boolean isPrime(int num).

public class MyInteger {

    public static boolean isPrime(int num){

        boolean isPrime = true;

        if (num == 1){
            isPrime = false;
        }
        else{
            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    isPrime = false;
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
