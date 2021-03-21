package kash.edu.module2;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rhombus
  @version  1.0.0
  @since 17.03.2021 - 20.02
**/

/*              Task:
    Create a class from the attached document according
    to the order in your group. (Number 5 - Rhombus).

    The class must contain:
    1. Constructor.
    2. Getters/Setters.
    3. 5 methods.
    4. Override toString() method.
    5. Override hash() and equals() methods.
*/

// Note: a rhombus is a quadrilateral whose four sides
// all have the same length.

public class Rhombus {
    private double side;
    private int angle;

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
        return Math.round((this.getArea() / this.getSide()) * 100.0) / 100.0;
    }

    // Create method to calculate the inradius of the rhombus
    // * inradius - the radius of a circle inscribed in the rhombus
    public double getInradius(){
        return Math.round((this.getHeight() / 2) * 100.0) / 100.0;
    }

    // Create method to calculate the diagonals of the rhombus
    public double getDiagonal(){
        double diagonal = (2 * this.getSide()) * Math.sin(180 - this.getAngle() / 2);
        return Math.round(diagonal * 100.0) / 100.0;
    }

/* ------------------------ CODE IN MAIN & OUTPUT -----------------------------
    Rhombus firstRhombus = new Rhombus(3, 30);

    // Calculate the perimeter of the rhombus
        System.out.println("Perimeter: " + firstRhombus.getPerimeter() + " cm");
    // Output: Perimeter: 12.0 cm

    // Calculate the area of the rhombus
        System.out.println("Area: " + firstRhombus.getArea() + " cm2");
    // Output: Area: 4.5 cm2

    // Calculate the height of the rhombus
        System.out.println("Height: " + firstRhombus.getHeight() + " cm");
    // Output: Height: 1.5 cm

    // Calculate the inradius of the rhombus
        System.out.println("Inradius: " + firstRhombus.getInradius() + " cm");
    // Output: Inradius: 0.75 cm

    // Calculate the diagonals of the rhombus
        System.out.println("Diagonal: " + firstRhombus.getDiagonal() + " cm");
    // Output: Diagonal: 5.99 cm
*/

    // Override toString() method
    @Override
    public String toString() {
        return "Rhombus {" +
                "side = " + side +
                ", angle = " + angle +
                '}';
    }
/*
    -------------- CODE IN MAIN ---------------
    System.out.println(firstRhombus.toString());

    ----------------- Output -------------------
    Rhombus {side = 3.0, angle = 30.0}
*/

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return Double.compare(rhombus.getSide(), getSide())
                == 0 && Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getAngle());
    }
/*
    ---------------------- CODE IN MAIN ------------------------
    Rhombus secondRhombus = new Rhombus();
    secondRhombus.setSide(3);
    secondRhombus.setAngle(30);
    System.out.println(firstRhombus.equals(secondRhombus));

    System.out.println("Hash code of 1st rhombus: " + firstRhombus.hashCode());
    System.out.println("Hash code of 2nd rhombus: " + firstRhombus.hashCode());

    ------------- Output -------------
    true
    Hash code of 1st rhombus: 20317121
    Hash code of 2nd rhombus: 20317121
 */

}

