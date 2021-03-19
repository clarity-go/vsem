package kash.edu.theory.inheritance;

import kash.edu.theory.Rectangle;

/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Wall
  @version  1.0.0 
  @since 19.03.2021 - 18.09
*/

public class Wall extends Rectangle {
    private String color;
    private boolean isInner;
    private boolean isWarmed;

    public Wall() {
    }

    public Wall(String color, boolean isInner, boolean isWarmed) {
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public Wall(int length, int width, String color, boolean isInner, boolean isWarmed) {
        super(length, width); // from parent class Rectangle
        this.color = color;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isWarmed() {
        return isWarmed;
    }

    public void setWarmed(boolean warmed) {
        isWarmed = warmed;
    }

}
