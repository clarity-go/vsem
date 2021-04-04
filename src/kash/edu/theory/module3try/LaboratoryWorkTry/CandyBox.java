package kash.edu.theory.module3try.LaboratoryWorkTry;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  CandyBox
  @version  1.0.0 
  @since 31.03.2021 - 20.13
*/

public class CandyBox implements IAccountingTry {
    private String name;
    private double weight;
    private double priceForCandy;
    private double priceForBox;
    private int amount;

    public CandyBox() {
    }

    public CandyBox(String name, double weight, double priceForCandy, double priceForBox, int amount) {
        this.name = name;
        this.weight = weight;
        this.priceForCandy = priceForCandy;
        this.priceForBox = priceForBox;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceForCandy() {
        return priceForCandy;
    }

    public void setPriceForCandy(double priceForCandy) {
        this.priceForCandy = priceForCandy;
    }

    public double getPriceForBox() {
        return priceForBox;
    }

    public void setPriceForBox(double priceForBox) {
        this.priceForBox = priceForBox;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CandyBox {" +
                "name ='" + name + '\'' +
                ", weight =" + weight +
                ", priceForCandy =" + priceForCandy +
                ", priceForBox =" + priceForBox +
                ", amount =" + amount +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return (this.getPriceForBox() + this.priceForCandy * this.weight) * amount;
    }
}
