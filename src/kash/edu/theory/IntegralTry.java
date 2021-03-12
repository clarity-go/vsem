package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  IntegralTry
  @version  1.0.0 
  @since 12.03.2021 - 23.05
*/

public class IntegralTry {

    public static double getIntegral(int secant) {
        double beginning = 0;
        double end = Math.PI;
        int numberOfSteps = 10;
        double area = 0;
        double height = 0;

        double width = (end - beginning) / numberOfSteps;

        for (int i = 0; i < numberOfSteps; i++) {
            if(Math.sin(i * width) < 0.1 * secant) {
                height = Math.sin(i * width);
            } else {
                height = 0.1 * secant;
            }
            double currentArea = height * width;
            area += currentArea;
        }
        return area;
    }


    public static void main(String[] args) {
        System.out.println("The area: " + getIntegral(5));
    }
}
