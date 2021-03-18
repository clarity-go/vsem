package kash.edu.module2;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Triangle
  @version  1.0.0 
  @since 17.03.2021 - 20.02
**/

public class Rhombus {
    private double side;
    private int angle;


/*              Task:
    Create a class from the attached document according
    to the order in your group. (Number 5 - Rhombus).

    The class must contain:
    1. Constructor.
    2. Getters/Setters.
    3. 5 methods: one of them getArea, периметр, высота, медиана, угол...
    4. Override toString() method
    5. Override hash() and equals() methods.
*/

    // Note: a rhombus is a quadrilateral whose four sides
    // all have the same length.

    // Create an empty constructor

    public Rhombus() {
    }

    // Create constructor

    public Rhombus(double side, int angle) {
        this.side = side;
        this.angle = angle;
    }

    // Create getters/setters

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    // Create method to calculate the perimeter of the rhombus
    public double getPerimeter(){
        return this.getSide() * 4;
    }

    // Create method to calculate the area of the rhombus
    public double getArea(){
        // Convert angle value to radians
        double radians = Math.toRadians(this.getAngle());
        double areaResult = Math.pow(this.getSide(), 2) * Math.sin(radians);
        return Math.round(areaResult * 100.0) / 100.0;
    }

    // Create method to calculate the height of the rhombus
    public double getHeight(){
        return this.getArea() / this.getSide();
    }

    // Create method to calculate the inradius of the rhombus
    // * inradius - is the radius of a circle inscribed in the rhombus
    public double getInradius(){
        return this.getHeight() / 2;
    }

    // Create method to calculate the diagonals of the rhombus
    // longer diagonal: (2 * side) * cos(angle / 2)
    // smaller diagonal: (2 * side) * sin(angle / 2)

    public double[] getDiagonals(){
        double secondAngle = 180 - this.getAngle();
        double longerDiagonal = (2 * this.getSide()) * Math.sin(secondAngle / 2);
        double smallerDiagonal = (2 * this.getSide()) * Math.sin(this.getAngle() / 2);


        return new double[] {Math.round(longerDiagonal * 100.0) / 100.0,
                                Math.round(smallerDiagonal * 100.0) / 100.0};
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Rhombus {" +
                "side = " + side +
                ", angle = " + angle +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return Double.compare(rhombus.getSide(), getSide()) == 0 && Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getAngle());
    }

}

