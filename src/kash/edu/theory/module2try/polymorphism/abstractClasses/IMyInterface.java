package kash.edu.theory.module2try.polymorphism.abstractClasses;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  IMyInterface
  @version  1.0.0 
  @since 06.04.2021 - 18.38
*/

import java.io.Serializable;

public interface IMyInterface extends Serializable {
    boolean isHighSallary();
    String getSalary();
    public final String myConstant = "Constant";
}
