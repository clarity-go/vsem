package kash.edu.theory.module2try.patterns.factory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  TriangleFactory
  @version  1.0.0 
  @since 24.03.2021 - 19.00
*/

public class TriangleFactory {
    public static TriangleTry create(int sideA, int sideB, int sideC){
        if (sideA + sideB <= sideC){
            return null;
        }
        return new TriangleTry(sideA, sideB, sideC);
    }
}
