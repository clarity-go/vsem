package kash.edu.module3.project;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Ordering
  @version  1.0.0 
  @since 03.04.2021 - 18.11
**/

public class Ordering implements IAccounting {

    private int amountOfFirstCourseDishes;
    private int amountOfMainCourseDishes;
    private int amountOfDesserts;
    private int amountOfBeverages;
    private double tip;
    private TypeOfOrdering type;

    public Ordering() {
    }

    public Ordering(int amountOfFirstCourseDishes, int amountOfMainCourseDishes,
                    int amountOfDesserts, int amountOfBeverages, double tip,
                    TypeOfOrdering type) {
        this.amountOfFirstCourseDishes = amountOfFirstCourseDishes;
        this.amountOfMainCourseDishes = amountOfMainCourseDishes;
        this.amountOfDesserts = amountOfDesserts;
        this.amountOfBeverages = amountOfBeverages;
        this.tip = tip;
        this.type = type;
    }

    public int getAmountOfFirstCourseDishes() {
        return amountOfFirstCourseDishes;
    }

    public void setAmountOfFirstCourseDishes(int amountOfFirstCourseDishes) {
        this.amountOfFirstCourseDishes = amountOfFirstCourseDishes;
    }

    public int getAmountOfMainCourseDishes() {
        return amountOfMainCourseDishes;
    }

    public void setAmountOfMainCourseDishes(int amountOfMainCourseDishes) {
        this.amountOfMainCourseDishes = amountOfMainCourseDishes;
    }

    public int getAmountOfDesserts() {
        return amountOfDesserts;
    }

    public void setAmountOfDesserts(int amountOfDesserts) {
        this.amountOfDesserts = amountOfDesserts;
    }

    public int getAmountOfBeverages() {
        return amountOfBeverages;
    }

    public void setAmountOfBeverages(int amountOfBeverages) {
        this.amountOfBeverages = amountOfBeverages;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public TypeOfOrdering getType() {
        return type;
    }

    public void setType(TypeOfOrdering type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ordering{" +
                "amountOfFirstCourseDishes = " + amountOfFirstCourseDishes +
                ", amountOfMainCourseDishes = " + amountOfMainCourseDishes +
                ", amountOfDesserts = " + amountOfDesserts +
                ", amountOfBeverages = " + amountOfBeverages +
                ", tip = " + tip +
                ", typ = " + type +
                '}';
    }

    @Override
    public double getUltimatePrice() {

        int firstCourseDishPrice = 30;
        int mainCourseDishPrice = 50;
        int dessertPrice = 45;
        int beveragePrice = 20;
        int priceForDelivery = 40;

        int additionalCost = (( type == TypeOfOrdering.DELIVERY) ? priceForDelivery : 0);

        return (this.amountOfFirstCourseDishes * firstCourseDishPrice
                + this.amountOfMainCourseDishes * mainCourseDishPrice
                + this.amountOfDesserts * dessertPrice
                + this.amountOfBeverages * beveragePrice) + this.getTip() + additionalCost;
    }
}

