package kash.edu.theory.module2try.patterns.factory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Cube
  @version  1.0.0 
  @since 24.03.2021 - 20.31
*/

import kash.edu.theory.module2try.polymorphism.interfaces2.IGeometryTry;

public class CubeTry implements IGeometryTry {
    private double sideA;

    public CubeTry(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
