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
        this.width = (width >= 0) ? width : 0;
        // (width >= 0) ? this.width = width : this.width = 0
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

    // Create method to calculate the diagonals of the rhombus
    // longer diagonal: (2 * side) * cos(angle / 2)
    // smaller diagonal: (2 * side) * sin(angle / 2)
    // double diagonal = (2 * this.getSide()) * Math.sin(180 - this.getAngle() / 2);
    // double smallerDiagonal = (2 * this.getSide()) * Math.sin(this.getAngle() / 2);
    // return new double[] {Math.round(diagonal * 100.0) / 100.0};
    //         // Calculate the diagonals of the rhombus
    //        double result[] = firstRhombus.getDiagonal();
    //        System.out.println("Diagonal: " + result[0]);
    //
    //        System.out.println("2nd diagonal: " + result[1]);
}
