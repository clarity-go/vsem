package kash.edu.theory.module3try.collectionsTry;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  StudentForCollections
  @version  1.0.0 
  @since 31.03.2021 - 19.08
*/

import java.time.LocalDate;

public class StudentForCols {
    // POJO class - classes's objects will be in the base where are only fields, no methods
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private int mark;

    public StudentForCols() {
    }

    public StudentForCols(String name, LocalDate dateOfBirth,
                          Gender gender, int mark) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "StudentForCollections {" +
                "name = '" + name + '\'' +
                ", dateOfBirth = " + dateOfBirth +
                ", gender = " + gender +
                ", mark= " + mark +
                '}';
    }
}
