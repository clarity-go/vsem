package kash.edu;

import kash.edu.module2.design.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello vsem");

        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle();
        int l1 = r1.getLength();
        System.out.println(l1);
        r2.setLength(16);
        r2.setWidth(7);
        System.out.println(r2.toString());

    }
}
