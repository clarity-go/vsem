package kash.edu.module2.inheritance;

import java.time.LocalDate;
import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Student
  @version  1.0.0 
  @since 19.03.2021 - 18.35
**/

// Create a class Person and a class Student as its daughter (altogether 25 fields)

public class Student extends Person{
    private String university;
    private String group;
    private String specialty;
    private String chair;
    private String faculty;
    private String degreeType; // for example, Bachelor's, Master's degree
    private LocalDate yearOfEntering; // year when entered the university
    private boolean isStipendiat; // has a scholarship
/*    private double averageScore;
    private boolean isBudget;*/

    public Student() {
    }

    public Student(String university, String group, String specialty, String chair, String faculty, String degreeType, LocalDate yearOfEntering, boolean isStipendiat) {
        this.university = university;
        this.group = group;
        this.specialty = specialty;
        this.chair = chair;
        this.faculty = faculty;
        this.degreeType = degreeType;
        this.yearOfEntering = yearOfEntering;
        this.isStipendiat = isStipendiat;
    }

    public Student(String gender, String race, String nationality, String firstName, String lastName, String patronymicName, String alias, LocalDate dateOfBirth, String country, String homeAddress, String email, boolean isMarried, boolean hasChildren, boolean isWorking, boolean hasProperty, boolean hasAuto, boolean hasDriversLicense, String university, String group, String specialty, String chair, String faculty, String degreeType, LocalDate yearOfEntering, boolean isStipendiat) {
        super(gender, race, nationality, firstName, lastName, patronymicName, alias, dateOfBirth, country, homeAddress, email, isMarried, hasChildren, isWorking, hasProperty, hasAuto, hasDriversLicense);
        this.university = university;
        this.group = group;
        this.specialty = specialty;
        this.chair = chair;
        this.faculty = faculty;
        this.degreeType = degreeType;
        this.yearOfEntering = yearOfEntering;
        this.isStipendiat = isStipendiat;
    }

    /* public Student() {
    }

    public Student(String university, String group, String specialty,
                   String chair, String faculty, String degreeType,
                   LocalDate yearOfEntering, boolean isStipendiat) {
        this.university = university;
        this.group = group;
        this.specialty = specialty;
        this.chair = chair;
        this.faculty = faculty;
        this.degreeType = degreeType;
        this.yearOfEntering = yearOfEntering;
        this.isStipendiat = isStipendiat;
    }

    public Student(String gender, String race, String nationality,
                   String firstName, String lastName, String patronymicName,
                   String alias, LocalDate dateOfBirth, String country,
                   String homeAddress, String email, boolean isMarried,
                   boolean hasChildren, boolean isWorking, boolean hasProperty,
                   boolean hasAuto, boolean hasDriversLicense,
                   String university, String group, String specialty,
                   String chair, String faculty, String degreeType,
                   LocalDate yearOfEntering, boolean isStipendiat) {
        super(gender, race, nationality, firstName, lastName, patronymicName,
                alias, dateOfBirth, country, homeAddress, email, isMarried,
                hasChildren, isWorking, hasProperty, hasAuto, hasDriversLicense);
        this.university = university;
        this.group = group;
        this.specialty = specialty;
        this.chair = chair;
        this.faculty = faculty;
        this.degreeType = degreeType;
        this.yearOfEntering = yearOfEntering;
        this.isStipendiat = isStipendiat;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public LocalDate getYearOfEntering() {
        return yearOfEntering;
    }

    public void setYearOfEntering(LocalDate yearOfEntering) {
        this.yearOfEntering = yearOfEntering;
    }

    public boolean isStipendiat() {
        return isStipendiat;
    }

    public void setStipendiat(boolean stipendiat) {
        isStipendiat = stipendiat;
    }

    @Override
    public String toString() {
        return " Student {" +
                " university = '" + university + '\'' +
                ", group = '" + group + '\'' +
                ", specialty = '" + specialty + '\'' +
                ", chair = '" + chair + '\'' +
                ", faculty = '" + faculty + '\'' +
                ", degreeType = '" + degreeType + '\'' +
                ", yearOfEntering = " + yearOfEntering +
                ", isStipendiat = " + isStipendiat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return isStipendiat() == student.isStipendiat()
                && getUniversity().equals(student.getUniversity())
                && getGroup().equals(student.getGroup())
                && getSpecialty().equals(student.getSpecialty())
                && getChair().equals(student.getChair())
                && getFaculty().equals(student.getFaculty())
                && getDegreeType().equals(student.getDegreeType())
                && getYearOfEntering().equals(student.getYearOfEntering());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(),
                getGroup(), getSpecialty(), getChair(), getFaculty(),
                getDegreeType(), getYearOfEntering(), isStipendiat());
    }*/
}
