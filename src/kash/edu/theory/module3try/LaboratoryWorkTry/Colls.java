package kash.edu.theory.module3try.LaboratoryWorkTry;/*
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
        List<IAccounting> listOfCandies = new ArrayList<>(
                Arrays.asList(
                        new CandyBox("Swallow", 0.2, 100, 10, 2),
                        new CandyWeight("Sparrow", 0.15, 50)
                )
        );
    }
}
