package kash.edu.module1;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Integral
  @version  1.0.0 
  @since 08.03.2021 - 19.55
**/

// Task: Get the area limited by the following functions   x = 0 .. 3.14;
// y = sin(x);   y = 0.1 * k, where k is the last cipher in your student card.

public class Integral {

    public static double getIntegral(int secant) {
        double beginning = 0;
        double end = Math.PI;
        int numberOfSteps = 10;
        double area = 0;
        double height = 0;

        double width = (beginning - end) / numberOfSteps;

        for (int i = 0; i < numberOfSteps; i++) {
            if(Math.sin(i * width) < 0.1 * secant) {
                height = Math.sin(i * width);
            } else {
                height = 0.1 * secant;
            }
            double currentArea = height * width;
            area = area + currentArea;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(getIntegral(5));
    }
}
