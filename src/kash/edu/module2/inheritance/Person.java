package kash.edu.module2.inheritance;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Person
  @version  1.0.0 
  @since 19.03.2021 - 18.37
**/

// Create a class Person and a class Student as its daughter (altogether 25 fields)

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String race;
    private String nationality;
    private String patronymicName;
    private String alias;
    private String country;
    private String homeAddress;
    private String email;
    private boolean hasChildren;
    private boolean isWorking;
    private boolean hasProperty;
    private boolean hasAuto;
    private boolean hasDriversLicense;
    private String hobby;

    public Person() {
    }

    public Person(String gender, String race, String nationality,
                  String firstName, String lastName, String patronymicName,
                  String alias, LocalDate dateOfBirth, String country,
                  String homeAddress, String email, boolean hasChildren,
                  boolean isWorking, boolean hasProperty, boolean hasAuto,
                  boolean hasDriversLicense, String hobby) {
        this.gender = gender;
        this.race = race;
        this.nationality = nationality;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.alias = alias;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.homeAddress = homeAddress;
        this.email = email;
        this.hasChildren = hasChildren;
        this.isWorking = isWorking;
        this.hasProperty = hasProperty;
        this.hasAuto = hasAuto;
        this.hasDriversLicense = hasDriversLicense;
        this.hobby = hobby;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean isHasProperty() {
        return hasProperty;
    }

    public void setHasProperty(boolean hasProperty) {
        this.hasProperty = hasProperty;
    }

    public boolean isHasAuto() {
        return hasAuto;
    }

    public void setHasAuto(boolean hasAuto) {
        this.hasAuto = hasAuto;
    }

    public boolean isHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person {" +
                " gender = '" + gender + '\'' +
                ", race = '" + race + '\'' +
                ", nationality = '" + nationality + '\'' +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", patronymicName = '" + patronymicName + '\'' +
                ", alias = '" + alias + '\'' +
                ", dateOfBirth = " + dateOfBirth +
                ", country = '" + country + '\'' +
                ", homeAddress = '" + homeAddress + '\'' +
                ", email = '" + email + '\'' +
                ", hasChildren = " + hasChildren +
                ", isWorking = " + isWorking +
                ", hasProperty = " + hasProperty +
                ", hasAuto = " + hasAuto +
                ", hasDriversLicense = " + hasDriversLicense +
                ", hobby = '" + hobby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isHasChildren() == person.isHasChildren()
                && isWorking() == person.isWorking()
                && isHasProperty() == person.isHasProperty()
                && isHasAuto() == person.isHasAuto()
                && isHasDriversLicense() == person.isHasDriversLicense()
                && getGender().equals(person.getGender())
                && getRace().equals(person.getRace())
                && getNationality().equals(person.getNationality())
                && getFirstName().equals(person.getFirstName())
                && getLastName().equals(person.getLastName())
                && getPatronymicName().equals(person.getPatronymicName())
                && getAlias().equals(person.getAlias())
                && getDateOfBirth().equals(person.getDateOfBirth())
                && getCountry().equals(person.getCountry())
                && getHomeAddress().equals(person.getHomeAddress())
                && getEmail().equals(person.getEmail())
                && getHobby().equals(person.getHobby());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGender(), getRace(), getNationality(),
                getFirstName(), getLastName(), getPatronymicName(),
                getAlias(), getDateOfBirth(), getCountry(), getHomeAddress(),
                getEmail(), isHasChildren(), isWorking(), isHasProperty(),
                isHasAuto(), isHasDriversLicense(), getHobby());
    }

    // Method to calculate the age of the person
    public int getAge(){
        int years = (int) ChronoUnit.YEARS.between(this.getDateOfBirth(), LocalDate.now());
        return years;
    }

    // Method to calculate whether the person is adult (>= 18 years old)
    public boolean isAdult() {
        return this.getAge() >= 18 ? true : false;
    }
}
