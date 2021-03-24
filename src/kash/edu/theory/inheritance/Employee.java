package kash.edu.theory.inheritance;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Employee
  @version  1.0.0 
  @since 24.03.2021 - 18.16
*/

import java.time.LocalDate;

// -------------- Abstract Class & Method ---------------------
public abstract class Employee {
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
