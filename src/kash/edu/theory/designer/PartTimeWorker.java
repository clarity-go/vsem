package kash.edu.theory.designer;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  PartTimeWorker
  @version  1.0.0 
  @since 24.03.2021 - 18.37
*/

public class PartTimeWorker implements IAccounting {
    private String name;
    private int rate;
    private int time;

    public PartTimeWorker() {
    }

    public PartTimeWorker(String name, int rate, int time) {
        this.name = name;
        this.rate = rate;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PartTimeWorker{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }

    @Override
    public int getSallary() {
        return this.time * this.rate;
    }
}
