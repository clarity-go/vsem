package kash.edu.module2.patterns.factory;
import kash.edu.module2.polymorphism.IGeometry;
import kash.edu.module2.polymorphism.Rhombus2;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  FigureFactory
  @version  1.0.0 
  @since 26.03.2021 - 16.36
**/

// Task: develop abstract factory for Figures: Rhombus, Triangle, Square, Rectangle

public class FigureFactory {

    // Create rhombus depending on the evident input: side and angle
    public static IGeometry create (double side, int angle){
        return new Rhombus2(side, angle);
    }

    // Create square or rhombus depending on the angle
    // and whether 2 sides of the figure are equal
    public static IGeometry create(double sideA, double sideB, int angle){
        if (sideA == sideB && angle == 90) {
            return new Square(sideA);
        }
        else if (sideA == sideB) {
            return new Rhombus2(sideA, angle);
        }
        return null;
    }

    // Create triangle if the input consists of 3 sides values
    public static IGeometry create (double sideA, double sideB, double sideC) {
        return new Triangle(sideA, sideB, sideC);
    }

    // Create figure depending on the chosen figure and 2 sides values
    public static IGeometry create (double sideA, double sideB, Figures figure){
        if (figure.equals(Figures.SQUARE)) {
            return new Square(sideA);
        }
        if (figure.equals(Figures.RECTANGLE)) {
            return new Rectangle((int)sideA, (int)sideB);
        }
        if (figure.equals(Figures.TRIANGLE)) {
            return new Triangle(sideA, sideB, Math.sqrt(sideA * sideA
                    + sideB * sideB));
        }
        return null;
    }

    // Create figure depending on the chosen figure and 1 side values
    public static IGeometry create (double sideA, Figures figures){
        if(figures.equals(Figures.TRIANGLE)) return new Triangle(sideA, sideA, sideA);
        if(figures.equals(Figures.SQUARE)) return new Square((int) sideA);
        if(figures.equals(Figures.RECTANGLE)) return new Rectangle((int) sideA, (int) sideA);
        return null;
    }

}
