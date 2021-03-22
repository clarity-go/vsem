package kash.edu.module2.inheritance;

import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Garden
  @version  1.0.0 
  @since 21.03.2021 - 11.07
**/

// Task: Create a child Garden from the class Rectangle

public class Garden extends Rectangle {
    private boolean withinCityLimits; // the garden is located in a city
    private boolean nearToRoad; // the garden is located near the carriageway
    private boolean blackSoil; // the ground is covered by black soil
    // min and max prices of 1 sq. meter of land in a city in $
    int minPriceWithinCity = 200;
    int maxPriceWithinCity = 400;
    // min and max prices of 1 sq. meter of land outside a city in $
    int minPriceOutsideCity = 1;
    int maxPriceOutsideCity = 150;

    // Create constructors
    public Garden() {
    }

    public Garden(boolean withinCityLimits, boolean nearToRoad, boolean blackSoil) {
        this.withinCityLimits = withinCityLimits;
        this.nearToRoad = nearToRoad;
        this.blackSoil = blackSoil;
    }

    public Garden(int length, int width, boolean withinCityLimits,
                  boolean nearToRoad, boolean blackSoil) {
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


    // Method to define the price of the garden depending on the attributes
    public int[] getPrice(){
        int minPrice = 0;
        int maxPrice = 0;

        // Approximate min and max prices depending on area and placement
        if (withinCityLimits) {
            minPrice = getArea() * minPriceWithinCity;
            maxPrice = getArea() * maxPriceWithinCity;
        }
        else {
            minPrice = getArea() * minPriceOutsideCity;
            maxPrice = getArea() * maxPriceOutsideCity;
        }

        // Approximate min and max prices depending on nearToRoad and blackSoil
        if(!nearToRoad && blackSoil){
            // add additional 10% of the price
            minPrice += (int)(minPrice*(10.0f/100.0f));
            maxPrice += (int)(maxPrice*(10.0f/100.0f));
        }
        else if (!nearToRoad || blackSoil){
            // add additional 5% of the price
            minPrice += (int)(minPrice*(5.0f/100.0f));
            maxPrice += (int)(maxPrice*(5.0f/100.0f));
        }

        return new int[]{minPrice, maxPrice};
    }
/*
    ----------------------------- CODE IN MAIN -------------------------------
    Garden firstGarden = new Garden(10, 10, true, false, true);

    int priceOfGarden[] = firstGarden.getPrice();
        System.out.println("Minimum price: " + priceOfGarden[0] + "$"
            + "\nMaximum price: " + priceOfGarden[1] + "$");

    ------ Output -------
    Minimum price: 22000$
    Maximum price: 44000$
 */

    // Override toString() method
    @Override
    public String toString() {
        return "Garden {" +
                "area = " + super.getArea() +
                ", withinCityLimits = " + withinCityLimits + ",\n\t\t" +
                " nearToRoad = " + nearToRoad +
                ", blackSoil = " + blackSoil +
                '}';
    }
/*
    -------------- CODE IN MAIN ---------------
    System.out.println(firstGarden.toString());

    ----------------- Output -------------------
    Garden {area = 100, withinCityLimits = true,
            nearToRoad = false, blackSoil = true}
 */

    // Override hash() and equals() methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Garden garden = (Garden) o;
        return isWithinCityLimits() == garden.isWithinCityLimits() && isNearToRoad()
                == garden.isNearToRoad() && isBlackSoil()
                == garden.isBlackSoil();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isWithinCityLimits(),
                isNearToRoad(), isBlackSoil());
    }
/*
    ---------------------- CODE IN MAIN ------------------------
    Garden secondGarden = new Garden(10, 10, true, false, true);
    System.out.println(firstGarden.equals(secondGarden));
    System.out.println(firstGarden.hashCode());

    -- Output --
    true
    40308361
 */
}
