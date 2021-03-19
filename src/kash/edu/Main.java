package kash.edu;

import kash.edu.module2.Rhombus;
import kash.edu.theory.Rectangle;

public class Main {

    public static void main(String[] args) {

        // ----------------------------- Rectangle -------------------------------
/*
        // Create the Object r1
        Rectangle r1 = new Rectangle(3, 4);
        int l1 = r1.getLength();
        System.out.println(l1);

        // Create the Object r2
        Rectangle r2 = new Rectangle();
        r2.setLength(16);
        r2.setWidth(7);
        System.out.println(r2.toString());

        // Compare object r2 and r3
        Rectangle r3 = new Rectangle(15, 7);
        System.out.println(r2.equals(r3)); // Output: false

        // Print hash codes of r2 and r3
        System.out.println(r2.hashCode()); // Output: 1464
        System.out.println(r3.hashCode()); // Output: 1433

        // Calculate area of the rectangle
        System.out.println(r1.getArea()); // Output: 12

        // Wrong input which is controlled by setter
        r1.setWidth(-9);
        System.out.println(r1); // Output: width = 0
*/


        // ----------------------------- Rhombus -------------------------------

        // Create the Object
        Rhombus firstRhombus = new Rhombus(3, 30);

        // Create the empty Object setting own values afterwards
        Rhombus secondRhombus = new Rhombus();
        secondRhombus.setSide(3);
        secondRhombus.setAngle(30);

        // Compare the firstRhombus and the secondRhombus
        System.out.println(firstRhombus.equals(secondRhombus));
        // Output: true

        // Print hash codes of the firstRhombus and the secondRhombus
        System.out.println("Hash code of 1st rhombus: " + firstRhombus.hashCode());
        System.out.println("Hash code of 2nd rhombus: " + firstRhombus.hashCode());
        // Output: Hash code of 1st rhombus: 20317121
        // Output: Hash code of 2nd rhombus: 20317121

        // Call the method toString()
        System.out.println(firstRhombus.toString());
        // Output: Rhombus {side = 3.0, angle = 30.0}

        // Calculate the perimeter of the rhombus
        System.out.println("Perimeter: " + firstRhombus.getPerimeter() + " cm");
        // Output: Perimeter: 12.0 cm

        // Calculate the area of the rhombus
        System.out.println("Area: " + firstRhombus.getArea() + " cm2");
        // Output: Area: 4.5 cm2

        // Calculate the height of the rhombus
        System.out.println("Height: " + firstRhombus.getHeight() + " cm");
        // Output: Height: 1.5 cm

        // Calculate the inradius of the rhombus
        System.out.println("Inradius: " + firstRhombus.getInradius() + " cm");
        // Output: Inradius: 0.75 cm

        // Calculate the diagonals of the rhombus
        System.out.println("Diagonal: " + firstRhombus.getDiagonal() + " cm");
        // Output: Diagonal: 5.99 cm

    }
}
