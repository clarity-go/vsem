package kash.edu.theory.module3try.LaboratoryWorkTry;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Colls
  @version  1.0.0 
  @since 31.03.2021 - 20.27
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colls {
    public static void main(String[] args) {
        List<IAccountingTry> listOfCandies = new ArrayList<>(
                Arrays.asList(
                        new CandyBox("Swallow", 0.2, 150, 10, 2),
                        new CandyBox("Betty", 0.5, 50, 10, 2),
                        new CandyBox("Lilak", 0.2, 70, 10, 2),
                        new CandyBox("Her&Him", 0.3, 80, 10, 2),
                        new CandyBox("Time", 0.2, 90, 10, 2),
                        new CandyWeight("Belissimo", 0.9, 70),
                        new CandyWeight("Sparrow", 0.15, 65),
                        new CandyWeight("Lake", 0.3, 55),
                        new CandyWeight("Unknown", 0.15, 50),
                        new CandyWeight("Sparrow", 0.15, 20)
                )
        );
        // calculate the revenue
        double totalIncome = listOfCandies.stream()
                .mapToDouble(IAccountingTry::getUltimatePrice).sum();

        // get the most expensive buy
        double expensive = listOfCandies.stream()
                .mapToDouble(IAccountingTry::getUltimatePrice).max().getAsDouble();
        System.out.println(expensive);

        // get the most cheap buy
        double cheap = listOfCandies.stream()
                .mapToDouble(IAccountingTry::getUltimatePrice).min().getAsDouble();
        System.out.println(cheap);

    }
}
