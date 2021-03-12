package kash.edu.module1;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Integral
  @version  1.0.0 
  @since 08.03.2021 - 19.55
**/

// Task: Get the area limited by the following functions x = 0 .. 3.14; y = sin(x);
// y = 0.1 * k, where k is the last cipher in your student card.

public class Integral {

    public static double getIntegral(int secant) {

        double start = 0;
        double finish = Math.PI;
        int numberOfSteps = 10;
        double area = 0;
        double height = 0;
        double width = (finish - start) / numberOfSteps;

        for (int i = 0; i < numberOfSteps; i++) {
            height = Math.sin(i * width) < 0.1 * secant ? Math.sin(i * width) : 0.1 * secant;
            area += height * width;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("The area: " + getIntegral(5));
    }
}

// Output: 1.2937185326289742
