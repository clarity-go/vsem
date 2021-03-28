package kash.edu.theory.module2try.patterns.factory;

import kash.edu.theory.module2try.polymorphism.interfaces2.IGeometryTry;

/*
  @author   Alona Kashpruk
  @project   vsem
  @class  FigureFactory
  @version  1.0.0 
  @since 24.03.2021 - 19.54
*/
// --------------- Abstract Factory ----------------
public class FigureFactoryTry {
    public static IGeometryTry create(int length, int width){
        if (length == width) {
            return new SquareTry(length);
        }
        return new Rectangle3(length, width);
    }

    // OverLoad - change attributes, for ex., (double sideA, double sideB, double sideC)
    public static IGeometryTry create(double sideA, double sideB, double sideC){
        return new TriangleTry(sideA, sideB, sideC);
    }

    public static IGeometryTry create(double sideA, double sideB){
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        return new TriangleTry(sideA, sideB, sideC);
    }

    public static IGeometryTry create (double sideA, double sideB, FiguresTry figure) {
        if (figure.equals(FiguresTry.TRIANGLE)){
            return new TriangleTry(sideA, sideB, Math.sqrt(sideA * sideA + sideB * sideB));
        }
        else if (figure.equals(FiguresTry.RECTANGLE)) {
            return new Rectangle3((int) sideA, (int) sideB);
        }
        return null;
    }

    public static IGeometryTry create (double sideA, FiguresTry figures){
        if(figures.equals(FiguresTry.TRIANGLE)) return new TriangleTry(sideA, sideA, sideA);
        if(figures.equals(FiguresTry.SQUARE)) return new SquareTry((int) sideA);
        if(figures.equals(FiguresTry.CUBE)) return new CubeTry(sideA);
        return null;
    }

}
