package kash.edu.module2.patterns.factory;
import kash.edu.module2.polymorphism.IGeometry;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rectangle
  @version  1.0.0 
  @since 26.03.2021 - 16.57
**/

public class Rectangle implements IGeometry {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                " length = " + length +
                ", width = " + width +
                '}';
    }

    @Override
    public double getPerimeter() {
        return this.getLength() * 2 + this.getWidth() * 2;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getInradius() {
        return Math.sqrt(Math.pow(this.getLength(), 2)
                + Math.pow(this.getWidth(), 2)) / 2;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getLength(), 2)
                + Math.pow(this.getWidth(), 2));
    }
}
