package kash.edu;

import kash.edu.module2.inheritance.Student;
import kash.edu.module2.polymorphism.FigureFactory;
import kash.edu.module2.polymorphism.Figures;
import kash.edu.module2.polymorphism.IGeometry;
import kash.edu.theory.StudentTry;
import kash.edu.theory.designer.FullTimeWorker;
import kash.edu.theory.designer.PartTimeWorker;
import kash.edu.theory.factory.TriangleTry;
import kash.edu.theory.factory.*;
import kash.edu.theory.inheritance.Employee;
import kash.edu.theory.inheritance.SoftwareDesigner;
import kash.edu.theory.designer.IAccounting;
import kash.edu.theory.polymorphism.interfaces.IGeometryTry;

import java.time.LocalDate;

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
        // ----------------------------- DOB & Age -------------------------------
/*

        Person britney = new Person("Britney", "Spears",
                LocalDate.of(1985, Month.FEBRUARY, 12));

        System.out.println(britney.getAge());
        System.out.println(britney.isAdult());


        // ---------------- Abstract Classes ----------------------
        SoftwareDesigner designer1 = new SoftwareDesigner();
        // ------------------------ Or ----------------------------
        Employee designer2 = new SoftwareDesigner();

        // Error: Employee designer3 = new Employee();
        // Abstract class does not have objects

        IAccounting worker1 = new FullTimeWorker();
        IAccounting worker2 = new PartTimeWorker();


        // ---------------- Factory ----------------------
        Rectangle3 rectangle1 = new Rectangle3(3, 4);
        Rectangle3 rectangle2 = Rectangle3Factory.create(3, 4);
        rectangle2.getWidth();
        Rectangle3.getArea(7, 8); // static method - do not need to create object to calculate getArea


        TriangleTry triangle3 = new TriangleTry(1, 1, 10);
        System.out.println(triangle3);
        TriangleTry triangle4 = TriangleFactory.create(1,1, 10);
        System.out.println(triangle4); // null

        // ---------------- Abstract Factory ----------------------
        IGeometryTry cube = FigureFactoryTry.create(3, FiguresTry.CUBE);

        IGeometry figure = FigureFactory.create(3, 3, 90);
        System.out.println(figure);

        IGeometry figure1 = FigureFactory.create(3, Figures.TRIANGLE);
        System.out.println(figure1);

        // -------------- Laboratory!!!!! ----------------------------

        IGeometry cube = (Cube) FigureFactory.create(3, Figures.CUBE);
        List<IGeometry> list = new ArrayList<>();
        list.add(cube);
*/

        // ---------------------- Builder -----------------------------
        // Create student in an ordinary way
/*        StudentTry student1 = new StudentTry("Ivan", "Ivanov", "Ivanovych",
                LocalDate.of(2000, 1, 1), true, "0636527847");
*/
        // Create student using builder
        StudentTry student2 = new StudentTry.Builder()
                .setFirstName("Petro")
                .setLastName("Petrov")
                .setPatronymic("Petrovich")
                .setBirth(LocalDate.of(2000, 1, 1))
                .setPhone("0636527847")
                .setGender(true)
                .build();
        System.out.println(student2);


        // SimilarTo method: create different objects with different addresses
        StudentTry student3 = new StudentTry.Builder()
                .setSimilarTo(student2)
                .setFirstName("Brian")
                .build();
        System.out.println(student3);


        // BAD variant, the same objects, have the same addresses
        // changes the student3 object's first name
        StudentTry student4 = student3;
        student4.setFirstName("Mark");

        StudentTry student5 = new StudentTry.Builder()
                .setSimilarTo(student2)
                .setFirstName("Ron")
                .setIdCard("123")
                .build();
        System.out.println(student5);
    }
}
