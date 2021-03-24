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
    private String fieldOfStudy;
    private String chair;
    private String faculty;
    private String degreeType; // for example, Bachelor's, Master's degree
    private LocalDate yearOfEntering; // year when entered the university
    private boolean isStipendiat; // has a scholarship
    private double averageScore;
    private boolean isBudget;

    public Student() {
    }

    public Student(String university, String group, String fieldOfStudy,
                   String chair, String faculty, String degreeType,
                   LocalDate yearOfEntering, boolean isStipendiat,
                   double averageScore, boolean isBudget) {
        this.university = university;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
        this.chair = chair;
        this.faculty = faculty;
        this.degreeType = degreeType;
        this.yearOfEntering = yearOfEntering;
        this.isStipendiat = isStipendiat;
        this.averageScore = averageScore;
        this.isBudget = isBudget;
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

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
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

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university = '" + university + '\'' +
                ", group = '" + group + '\'' +
                ", fieldOfStudy = '" + fieldOfStudy + '\'' +
                ", chair = '" + chair + '\'' +
                ", faculty = '" + faculty + '\'' +
                ", degreeType = '" + degreeType + '\'' +
                ", yearOfEntering = " + yearOfEntering +
                ", isStipendiat = " + isStipendiat +
                ", averageScore = " + averageScore +
                ", isBudget = " + isBudget +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isStipendiat() == student.isStipendiat()
                && Double.compare(student.getAverageScore(), getAverageScore())
                == 0 && isBudget() == student.isBudget()
                && getUniversity().equals(student.getUniversity())
                && getGroup().equals(student.getGroup())
                && getFieldOfStudy().equals(student.getFieldOfStudy())
                && getChair().equals(student.getChair())
                && getFaculty().equals(student.getFaculty())
                && getDegreeType().equals(student.getDegreeType())
                && getYearOfEntering().equals(student.getYearOfEntering());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniversity(), getGroup(), getFieldOfStudy(),
                getChair(), getFaculty(), getDegreeType(), getYearOfEntering(),
                isStipendiat(), getAverageScore(), isBudget());
    }
}
