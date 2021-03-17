package kash.edu.theory;

import java.util.Objects;

/**
 @author   Alona Kashpruk
 @project   vsem
 @class  Rectangle
 @version  1.0.0
 @since 17.03.2021 - 19.33
 */

public class Rectangle {
    private int length;
    private int width;

    // call an empty constructor: Right Mouse Click - Generate - Constructor - Select none
    // call full constructor: Right Mouse Click - Generate - Constructor - Select alltogether - Create
    // class - description of the object

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    // getters; setters: Right Mouse Click - Generate - Getter And Setter - Select alltogether - Create

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

    // method toString

    @Override
    public String toString() {
        return "Rectangle {" +
                "length = " + length + ", \n" +
                "\t \t   width = " + width +
                '}';
    }

    // equals -- compare the rectangles

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    // Create method to calculate area of the rectangle
    public int getArea(){
        return this.getLength() * this.getWidth(); // return length * width;
    }
}