package kash.edu.module2.polymorphism;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rhombus2Factory
  @version  1.0.0 
  @since 25.03.2021 - 23.04
**/

// Task: develop factory for class Rhombus2

public class Rhombus2Factory {

    public static Rhombus2 create(double side, int angle) {
        if (angle < 0 || angle >= 180) {
            return null;
        }
        return new Rhombus2(side, angle);
    }

}
