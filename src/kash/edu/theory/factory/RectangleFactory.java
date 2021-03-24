package kash.edu.theory.factory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Rectanglefactory
  @version  1.0.0 
  @since 24.03.2021 - 18.48
*/

public class RectangleFactory {
    public static Rectangle3 create(int length, int width){
        // put logic here
        // static - do not presupposes the creation of the object
        // all static belongs to class but not the objects
        return new Rectangle3(length, width);
    }
}
