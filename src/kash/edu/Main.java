package kash.edu;

import kash.edu.theory.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello vsem");

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






        /*public static void main(String[] args) {
            int result[] = something();
            System.out.println(result[0] + result[1]);
        }*/
    }
}
