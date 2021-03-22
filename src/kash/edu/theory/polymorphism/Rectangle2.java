package kash.edu.theory.polymorphism;

import kash.edu.theory.polymorphism.interfaces.IGeometry;
import kash.edu.theory.polymorphism.interfaces.IPacking;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rectangle
  @version  1.0.0 
  @since 21.03.2021 - 10.59
**/

public class Rectangle2 implements IGeometry, IPacking {
    private int length;
    private int width;

    // Create constructors
    public Rectangle2() {
    }

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Create getters/setters
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

    // Override toString() method
    @Override
    public String toString() {
        return "Rectangle{" +
                " length =" + length +
                ", width =" + width +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle2 rectangle = (Rectangle2) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getWidth() + 2 * this.getLength();
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public String toJSON() {
        String json = " <Rectangle> " +
                "{" + "\"" + "length" + "\"" + ": " + this.getLength() + ", " +
                "\"" + "width" + "\"" + ": " + this.getWidth() + "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = " <Rectangle> " +
                " <length> " + this.getLength() + " </length> " +
                " <width> " + this.getWidth() + " </width> " +
                " <Rectangle> ";
        return xml;
    }
}
