package kash.edu;

import kash.edu.module2.Rhombus;
import kash.edu.module2.inheritance.Garden;
import kash.edu.module2.inheritance.Person;
import kash.edu.theory.designer.FullTimeWorker;
import kash.edu.theory.designer.Triangle;
import kash.edu.theory.factory.*;
import kash.edu.theory.inheritance.Employee;
import kash.edu.theory.inheritance.SoftwareDesigner;
import kash.edu.theory.inheritance.Wall;
import kash.edu.theory.polymorphism.Rectangle2;
import kash.edu.theory.polymorphism.interfaces.IAccounting;
import kash.edu.theory.polymorphism.interfaces.IGeometry;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        // ----------------------------- RectangleTry -------------------------------
/*
        // Create the Object r1
        RectangleTry r1 = new RectangleTry(3, 4);
        int l1 = r1.getLength();
        System.out.println(l1);

        // Create the Object r2
        RectangleTry r2 = new RectangleTry();
        r2.setLength(16);
        r2.setWidth(7);
        System.out.println(r2.toString());

        // Compare object r2 and r3
        RectangleTry r3 = new RectangleTry(15, 7);
        System.out.println(r2.equals(r3)); // Output: false

        // Print hash codes of r2 and r3
        System.out.println(r2.hashCode()); // Output: 1464
        System.out.println(r3.hashCode()); // Output: 1433

        // Calculate area of the rectangle
        System.out.println(r1.getArea()); // Output: 12

        // Wrong input which is controlled by setter
        r1.setWidth(-9);
        System.out.println(r1); // Output: width = 0


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


        // ----------------------------- Wall -------------------------------
        Wall firstWall = new Wall(4, 3, "Green", true, true);
        firstWall.setWidth(4);

        // ----------------------------- Garden -------------------------------
        Garden firstGarden = new Garden(10, 10, true, false, true);
        Garden secondGarden = new Garden(10, 10, true, false, true);
        System.out.println(firstGarden.equals(secondGarden));

        int priceOfGarden[] = firstGarden.getPrice();
        System.out.println("Minimum price: " + priceOfGarden[0] + "$"
                + "\nMaximum price: " + priceOfGarden[1] + "$");

        System.out.println(firstGarden.toString());
        System.out.println(firstGarden.hashCode());

        // ----------------------------- Polymorphism -------------------------------
        Rectangle2 rectangle2 = new Rectangle2(3, 4);
        System.out.println(rectangle2.toJSON());
        System.out.println(rectangle2.toXML());

*/


/*        Person britney = new Person("Britney", "Spears");
        LocalDate.of(1985, Month.FEBRUARY, 12);

        System.out.println(britney.getAge());
        System.out.println(britney.isAdult());*/

/*       IN PERSON
        public int getAge(){
            int years = (int) ChronoUnit.YEARS.between(this.getDateOfBirth(), LocalDate.now());
            return years;
        }

        public boolean isAdult(){
            boolean result = true;
            if (this.getAge() >= 18) {
                result = true;
            } else{
                result = false;
            }
            return result;
        }*/

        // ---------------- Abstract Classes ----------------------
        SoftwareDesigner designer1 = new SoftwareDesigner();
        // ------------------------ Or ----------------------------
        Employee designer2 = new SoftwareDesigner();

        // Error: Employee designer3 = new Employee();
        // Abstract class does not have objects

        IAccounting worker1 = new FullTimeWorker();
        IAccounting worker2 = new FullTimeWorker();


        // ---------------- Factory ----------------------
        Rectangle3 rectangle1 = new Rectangle3(3, 4);
        Rectangle3 rectangle2 = RectangleFactory.create(3, 4);
        rectangle2.getWidth();
        Rectangle3.getArea(7, 8); // static method - do not need to create object to calculate getArea


        Triangle triangle3 = new Triangle(1, 1, 10);
        System.out.println(triangle3);
        Triangle triangle4 = TriangleFactory.create(1,1, 10);
        System.out.println(triangle4);

        // ---------------- Abstract Factory ----------------------
        IGeometry cube = FigureFactory.create(3, Figures.CUBE);

    }
}
