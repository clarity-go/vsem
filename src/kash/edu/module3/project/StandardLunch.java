package kash.edu.module3.project;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  StandardLunch
  @version  1.0.0 
  @since 03.04.2021 - 18.12
**/

public class StandardLunch implements IAccounting {
    private String name;
    private double price;
    private int amount;
    private double tip;
    private TypeOfOrdering type;

    public StandardLunch() {
    }

    public StandardLunch(String name, double price, int amount,
                         double tip, TypeOfOrdering type) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.tip = tip;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "StandardLunch {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", amount = " + amount +
                ", tip = " + tip +
                ", type = " + type +
                '}';
    }

    @Override
    public double getUltimatePrice() {

        return (this.getPrice() * this.getAmount()) + this.getTip();

    }
}
