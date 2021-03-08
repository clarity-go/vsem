package kash.edu.module1;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Integral
  @version  1.0.0 
  @since 08.03.2021 - 19.55
*/

public class Integral {

    public static double getIntegral(int secant){
        double start = 0;
        double finish = Math.PI;
        int steps = 10;
        double width = (finish - start) / steps;
        double area = 0;
        double height = 0;

        for (int i = 0; i < steps; i++) {
            if(Math.sin(i * width) < 0.1 * secant) {
                height = Math.sin(i * width);
            } else{
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
