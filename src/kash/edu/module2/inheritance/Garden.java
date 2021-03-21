package kash.edu.module2.inheritance;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Garden
  @version  1.0.0 
  @since 21.03.2021 - 11.07
**/

public class Garden extends Rectangle {
    private boolean withinCityLimits; // in the city
    private boolean nearToRoad;
    private boolean blackSoil; // the ground is covered by black soil

    // Create constructors
    public Garden() {
    }

    public Garden(boolean withinCityLimits, boolean nearToRoad, boolean blackSoil) {
        this.withinCityLimits = withinCityLimits;
        this.nearToRoad = nearToRoad;
        this.blackSoil = blackSoil;
    }

    public Garden(int length, int width, boolean withinCityLimits, boolean nearToRoad, boolean blackSoil) {
        super(length, width);
        this.withinCityLimits = withinCityLimits;
        this.nearToRoad = nearToRoad;
        this.blackSoil = blackSoil;
    }

    // Create getters/setters
    public boolean isWithinCityLimits() {
        return withinCityLimits;
    }

    public void setWithinCityLimits(boolean withinCityLimits) {
        this.withinCityLimits = withinCityLimits;
    }

    public boolean isNearToRoad() {
        return nearToRoad;
    }

    public void setNearToRoad(boolean nearToRoad) {
        this.nearToRoad = nearToRoad;
    }

    public boolean isBlackSoil() {
        return blackSoil;
    }

    public void setBlackSoil(boolean blackSoil) {
        this.blackSoil = blackSoil;
    }

    // Method to calculate the area of the garden
/*    public int getArea(){

    }*/


    // Method to define the price of the garden depending on the attributes
    public int getPrice(){

    }


    // Override toString() method
    @Override
    public String toString() {
        return "Garden {" +
                "area = " + super.getArea() +
                " withinCityLimits = " + withinCityLimits +
                ", nearToRoad = " + nearToRoad +
                ", blackSoil = " + blackSoil +
                '}';
    }

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Garden garden = (Garden) o;
        return isWithinCityLimits() == garden.isWithinCityLimits() && isNearToRoad()
                == garden.isNearToRoad() && isBlackSoil() == garden.isBlackSoil();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWithinCityLimits(),
                isNearToRoad(), isBlackSoil());
    }

}
