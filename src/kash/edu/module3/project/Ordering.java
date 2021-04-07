package kash.edu.module3.project;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Ordering
  @version  1.0.0 
  @since 03.04.2021 - 18.11
**/

public class Ordering implements IAccounting {

    private boolean isFirstCourse;
    private boolean isMainCourse;
    private boolean isDessert;
    private boolean isBeverage;
    private double weight;
    private double price;
    private int amount;
    private double tip;
    private TypeOfOrdering type;

    public Ordering() {
    }

    public Ordering(FirstCourse firstCourseDish, double weight, double price,
                    int amount, double tip, TypeOfOrdering type) {
        this.firstCourseDish = firstCourseDish;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
        this.type = type;
    }

    public Ordering(MainCourse mainCourseDish, double weight, double price,
                    int amount, double tip, TypeOfOrdering type) {
        this.mainCourseDish = mainCourseDish;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
        this.type = type;
    }

    public Ordering(Dessert dessert, double weight, double price, int amount,
                    double tip, TypeOfOrdering type) {
        this.dessert = dessert;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
        this.type = type;
    }

    public Ordering(Beverage beverage, double weight, double price, int amount,
                    double tip, TypeOfOrdering type) {
        this.beverage = beverage;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
        this.type = type;
    }

    public FirstCourse getFirstCourseDish() {
        return firstCourseDish;
    }

    public void setFirstCourseDish(FirstCourse firstCourseDish) {

        this.firstCourseDish = firstCourseDish;
    }

    public MainCourse getMainCourseDish() {
        return mainCourseDish;
    }

    public void setMainCourseDish(MainCourse mainCourseDish) {

        this.mainCourseDish = mainCourseDish;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {

        this.dessert = dessert;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {

        this.beverage = beverage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
        return "Ordering {" +
                "firstCourseDish = " + firstCourseDish +
                ", mainCourseDish = " + mainCourseDish +
                ", dessert = " + dessert +
                ", beverage = " + beverage +
                ", weight = " + weight +
                ", price = " + price +
                ", amount = " + amount +
                ", tip = " + tip +
                ", typeOfOrdering = " + type +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPrice() * this.getAmount()) + this.getTip();
    }
}

