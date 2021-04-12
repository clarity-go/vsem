package kash.edu.theory.module2try.patterns.factory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Rectanglefactory
  @version  1.0.0 
  @since 24.03.2021 - 18.48
*/

public class Rectangle3Factory {
    public static Rectangle3 create(int length, int width){
        // put logic here
        // static - do not presupposes the creation of the object
        // all static belongs to class but not the objects
        return new Rectangle3(length, width);
    }
}