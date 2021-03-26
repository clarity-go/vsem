package kash.edu.module2.polymorphism;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Square
  @version  1.0.0 
  @since 26.03.2021 - 16.48
**/

public class Square implements IGeometry{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square {" +
                " side = " + side +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getInradius() {
        return this.side / 2;
    }

    @Override
    public double getDiagonal() {
        return this.side * Math.sqrt(2);
    }
}
