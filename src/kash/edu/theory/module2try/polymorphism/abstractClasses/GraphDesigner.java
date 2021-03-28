package kash.edu.theory.module2try.polymorphism.abstractClasses;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  GraphDesigner
  @version  1.0.0 
  @since 24.03.2021 - 18.24
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GraphDesigner extends Employee {
    @Override
    public int getSallary() {
        int fullYears = (int) ChronoUnit.YEARS.between(LocalDate.now(), super.getEntranceDay());
        return 10000 * fullYears;
    }
}
