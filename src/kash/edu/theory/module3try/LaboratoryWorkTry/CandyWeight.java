package kash.edu.theory.module3try.LaboratoryWorkTry;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  CandyWeight
  @version  1.0.0 
  @since 31.03.2021 - 20.17
*/

public class CandyWeight implements IAccountingTry {
    private String name;
    private double weight;
    private double priceForCandy;

    public CandyWeight() {
    }

    public CandyWeight(String name, double weight, double priceForCandy) {
        this.name = name;
        this.weight = weight;
        this.priceForCandy = priceForCandy;
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

    @Override
    public String toString() {
        return "CandyWeight {" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", priceForCandy = " + priceForCandy +
                '}';
    }

    @Override
    public double getUltimatePrice() {
        return this.getPriceForCandy() * this.getWeight();
    }
}
