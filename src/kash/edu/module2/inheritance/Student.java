package kash.edu.module2.inheritance;

import kash.edu.theory.StudentTry;

import java.time.LocalDate;
import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Student
  @version  1.0.0 
  @since 19.03.2021 - 18.35
**/

// Task 1: Create a class Person and a class Student as its daughter (altogether 25 fields)
// Task 2: Create a builder for the class Student.

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

    // Constructor which includes fields from Person which is extended by this class
    public Student(String firstName, String lastName, LocalDate dateOfBirth,
                   String gender, String race, String nationality,
                   String patronymicName, String alias, String country,
                   String homeAddress, String email, boolean isHavingChildren,
                   boolean isWorking, boolean isHavingProperty,
                   boolean isHavingAuto, boolean isHavingDriversLicense,
                   String hobby, String university, String group,
                   String fieldOfStudy, String chair, String faculty,
                   String degreeType, LocalDate yearOfEntering,
                   boolean isStipendiat, double averageScore, boolean isBudget) {
        super(firstName, lastName, dateOfBirth, gender, race, nationality,
                patronymicName, alias, country, homeAddress, email,
                isHavingChildren, isWorking, isHavingProperty, isHavingAuto,
                isHavingDriversLicense, hobby);
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
        return "Student {" +
                "\n gender = '" + super.getGender() + '\'' +
                ",\n race = '" + super.getRace() + '\'' +
                ",\n nationality = '" + super.getNationality() + '\'' +
                ",\n firstName = '" + super.getFirstName() + '\'' +
                ",\n lastName = '" + super.getLastName() + '\'' +
                ",\n patronymicName = '" + super.getPatronymicName() + '\'' +
                ",\n alias = '" + super.getAlias() + '\'' +
                ",\n dateOfBirth = " + super.getDateOfBirth() +
                ",\n country = '" + super.getCountry() + '\'' +
                ",\n homeAddress = '" + super.getHomeAddress() + '\'' +
                ",\n email = '" + super.getEmail() + '\'' +
                ",\n hasChildren = " + super.isHavingChildren() +
                ",\n isWorking = " + super.isWorking() +
                ",\n hasProperty = " + super.isHavingProperty() +
                ",\n hasAuto = " + super.isHavingAuto() +
                ",\n hasDriversLicense = " + super.isHavingDriversLicense() +
                ",\n hobby = '" + super.getHobby() + '\'' +
                ",\n university = '" + university + '\'' +
                ",\n group = '" + group + '\'' +
                ",\n fieldOfStudy = '" + fieldOfStudy + '\'' +
                ",\n chair = '" + chair + '\'' +
                ",\n faculty = '" + faculty + '\'' +
                ",\n degreeType = '" + degreeType + '\'' +
                ",\n yearOfEntering = " + yearOfEntering +
                ",\n isStipendiat = " + isStipendiat +
                ",\n averageScore = " + averageScore +
                ",\n isBudget = " + isBudget +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isStipendiat() == student.isStipendiat()
                && Double.compare(student.getAverageScore(), getAverageScore()) == 0
                && isBudget() == student.isBudget()
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

    // Create Builder for the class Student
    public static class Builder {
        private Student studentToBuild;

        // Create a constructor
        public Builder() {
            this.studentToBuild = new Student();
        }

        // Data / fields from class Person
        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymicName(String patronymicName){
            studentToBuild.setPatronymicName(patronymicName);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth){
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setGender(String gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setRace(String race){
            studentToBuild.setRace(race);
            return this;
        }

        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setAlias(String alias){
            studentToBuild.setAlias(alias);
            return this;
        }

        public Builder setCountry(String country){
            studentToBuild.setCountry(country);
            return this;
        }

        public Builder setHomeAddress(String homeAddress){
            studentToBuild.setHomeAddress(homeAddress);
            return this;
        }

        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }

        public Builder setIsHavingChildren(boolean isHavingChildren){
            studentToBuild.setHavingChildren(isHavingChildren);
            return this;
        }

        public Builder setIsWorking(boolean isWorking){
            studentToBuild.setWorking(isWorking);
            return this;
        }

        public Builder setIsHavingProperty(boolean isHavingProperty){
            studentToBuild.setHavingProperty(isHavingProperty);
            return this;
        }

        public Builder setIsHavingAuto(boolean isHavingAuto){
            studentToBuild.setHavingAuto(isHavingAuto);
            return this;
        }

        public Builder setIsHavingDriversLicense(boolean isHavingDriversLicense){
            studentToBuild.setHavingDriversLicense(isHavingDriversLicense);
            return this;
        }

        public Builder setHobby(String hobby){
            studentToBuild.setHobby(hobby);
            return this;
        }

        // Data / fields from class Student
        public Builder setGroup(String group){
            studentToBuild.setGroup(group);
            return this;
        }

        public Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setFieldOfStudy(String fieldOfStudy){
            studentToBuild.setFieldOfStudy(fieldOfStudy);
            return this;
        }

        public Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }

        public Builder setFaculty(String faculty){
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setDegreeType(String degreeType){
            studentToBuild.setDegreeType(degreeType);
            return this;
        }

        public Builder setYearOfEntering(LocalDate yearOfEntering){
            studentToBuild.setYearOfEntering(yearOfEntering);
            return this;
        }

        public Builder setIsStipendiat(boolean isStipendiat){
            studentToBuild.setStipendiat(isStipendiat);
            return this;
        }

        public Builder setAverageScore(double averageScore){
            studentToBuild.setAverageScore(averageScore);
            return this;
        }

        public Builder setIsBudget(boolean isBudget){
            studentToBuild.setBudget(isBudget);
            return this;
        }

        // Create building method
        public Student build() {
            return studentToBuild;
        }

    }

}
