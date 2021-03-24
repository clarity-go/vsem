package kash.edu.theory.designer;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Cube
  @version  1.0.0 
  @since 24.03.2021 - 20.31
*/

import kash.edu.theory.polymorphism.interfaces.IGeometryTry;

public class Cube implements IGeometryTry {
    private double sideA;

    public Cube(double sideA) {
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
