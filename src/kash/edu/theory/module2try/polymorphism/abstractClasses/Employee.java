package kash.edu.theory.module2try.polymorphism.abstractClasses;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Employee
  @version  1.0.0 
  @since 24.03.2021 - 18.16
*/

import java.io.Serializable;
import java.time.LocalDate;

// -------------- Abstract Class & Method ---------------------
/*
abstract class - AC
abstract method - AM
interface - I

1. What is the DIFFERENCE between AC and I?
In I mainly ALL methods are abstract. In AC - 1-2 methods are usually abstract.
Fields.

2. What is ABSTRACT method (AM)?
It's a signature of the method, without realisation.

3. Can abstract class DO NOT CONTAIN abstract methods or contain ALL methods abstract?
Can.

4. What is the DIFFERENCE between AC and ordinary class?
Don't have objects, can not create it's object. Can not be instantiated.

6. What can contain I in addition to signatures?
Constants: public final String myConstant = "Constant";

7. How many signatures can be in I?
As many as you wish, but remember about SOLID - Interface segregation principle

8. How many AC-es can be inherited?
1, in contrast to C++. In diff inherited classes can be the same methods and fields.

9. How many I-es can be implements?
As many as you wish.

10. Can I do not contain signatures?
Yes, f.ex.it can contain constants.

11. Can I do not contain nor signatures nor constants?
Yes (serializable - packaging, empty).

12. AC should be extended (can be inherited), I - implemented.

13. Can I be extended?
Can be extended by another interface.

14. Can I contain realization?
Can, default realization (in Java 9). But in classical Java can't.

*/

public abstract class Employee implements Serializable {
    private String name;
    private LocalDate entranceDay;
    private String speciality;
    private String qualification;

    public Employee() {
    }

    public Employee(String name, LocalDate entranceDay, String speciality, String qualification) {
        this.name = name;
        this.entranceDay = entranceDay;
        this.speciality = speciality;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEntranceDay() {
        return entranceDay;
    }

    public void setEntranceDay(LocalDate entranceDay) {
        this.entranceDay = entranceDay;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", entranceDay=" + entranceDay +
                ", speciality='" + speciality + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }

    public abstract int getSallary();
}
