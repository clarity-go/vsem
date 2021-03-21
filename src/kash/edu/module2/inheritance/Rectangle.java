package kash.edu.module2.inheritance;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rectangle
  @version  1.0.0 
  @since 21.03.2021 - 10.59
**/

public class Rectangle {
    private int length;
    private int width;

    // Create constructors
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
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

    // Create method to calculate area of the rectangle
    public int getArea(){
        return this.getLength() * this.getWidth(); // return length * width;
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
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

}
