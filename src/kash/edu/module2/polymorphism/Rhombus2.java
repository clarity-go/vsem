package kash.edu.module2.polymorphism;
import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Rhombus
  @version  1.0.0
  @since 17.03.2021 - 20.02
**/

// Task: Create and implement two interfaces for class Rhombus2

public class Rhombus2 implements IGeometry, IPacking {
    private double side;
    private int angle;

    // Create an empty constructor
    public Rhombus2() {
    }

    // Create constructor
    public Rhombus2(double side, int angle) {
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
        Rhombus2 rhombus = (Rhombus2) o;
        return Double.compare(rhombus.getSide(), getSide())
                == 0 && Double.compare(rhombus.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getAngle());
    }

    // Implement getPerimeter() method from IGeometry interface
    @Override
    public double getPerimeter() {
        return this.getSide() * 4;
    }

    // Implement getArea() method from IGeometry interface
    @Override
    public double getArea() {
        // Convert angle value to radians
        double radians = Math.toRadians(this.getAngle());
        double areaResult = Math.pow(this.getSide(), 2) * Math.sin(radians);
        return Math.round(areaResult * 100.0) / 100.0;
    }

    // Implement getHeight() method from IGeometry interface
    @Override
    public double getHeight() {
        return Math.round((this.getArea() / this.getSide()) * 100.0) / 100.0;
    }

    // Implement getInradius() method from IGeometry interface
    @Override
    public double getInradius() {
        return Math.round((this.getHeight() / 2) * 100.0) / 100.0;
    }

    // Implement getDiagonal() method from IGeometry interface
    @Override
    public double getDiagonal() {
        double diagonal = (2 * this.getSide()) * Math.sin(180 - this.getAngle() / 2);
        return Math.round(diagonal * 100.0) / 100.0;
    }

    // Implement toJSON() method from IPacking interface
    @Override
    public String toJSON() {
        String json = " <Rhombus> " +
                "{" + "\"" + "side" + "\"" + ": " + this.getSide() + ", " +
                "\"" + "angle" + "\"" + ": " + this.getAngle() + "}";
        return json;
    }

    // Implement toXML() method from IPacking interface
    @Override
    public String toXML() {
        String xml = " <Rhombus> " +
                " <side> " + this.getSide() + " </length> " +
                " <angle> " + this.getAngle() + " </width> " +
                " <Rhombus> ";
        return xml;
    }
}

