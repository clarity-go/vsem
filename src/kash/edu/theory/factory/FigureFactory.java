package kash.edu.theory.factory;

import kash.edu.theory.designer.Cube;
import kash.edu.theory.designer.Square;
import kash.edu.theory.designer.Triangle;
import kash.edu.theory.polymorphism.interfaces.IGeometryTry;

/*
  @author   Alona Kashpruk
  @project   vsem
  @class  FigureFactory
  @version  1.0.0 
  @since 24.03.2021 - 19.54
*/
// --------------- Abstract Factory ----------------
public class FigureFactory {
    public static IGeometryTry create(int length, int width){

        if (length == width) {
            return new Square(length);
        }

        return new Rectangle3(length, width);
    }

    // OverLoad - change attributes, for ex., (double sideA, double sideB, double sideC)
    public static IGeometryTry create(double sideA, double sideB, double sideC){
        return new Triangle(sideA, sideB, sideC);
    }

    public static IGeometryTry create(double sideA, double sideB){
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        return new Triangle(sideA, sideB, sideC);
    }

    public static IGeometryTry create (double sideA, double sideB, Figures figure) {
        if (figure.equals(Figures.TRIANGLE)){
            return new Triangle(sideA, sideB, Math.sqrt(sideA * sideA + sideB * sideB));
        }
        else if (figure.equals(Figures.RECTANGLE)) {
            return new Rectangle3((int) sideA, (int) sideB);
        }
        return null;
    }

    public static IGeometryTry create (double sideA, Figures figures){
        if(figures.equals(Figures.TRIANGLE)) return new Triangle(sideA, sideA, sideA);
        if(figures.equals(Figures.SQUARE)) return new Square((int) sideA);
        if(figures.equals(Figures.CUBE)) return new Cube(sideA);
        return null;
    }

}
