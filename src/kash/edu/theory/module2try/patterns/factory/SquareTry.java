package kash.edu.theory.module2try.patterns.factory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Square
  @version  1.0.0 
  @since 24.03.2021 - 19.21
*/

import kash.edu.theory.module2try.polymorphism.interfaces2.IGeometryTry;

public class SquareTry implements IGeometryTry {
    private int side;

    public SquareTry() {
    }

    public SquareTry(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
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