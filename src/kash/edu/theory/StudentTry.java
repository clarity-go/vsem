package kash.edu.theory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  StudentTry
  @version  1.0.0 
  @since 26.03.2021 - 18.23
*/

import java.time.LocalDate;

public class StudentTry extends PersonNewTry {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birth;
    private boolean gender;
    private String phone;

    public StudentTry() {
    }

    public StudentTry(String firstName, String lastName, String patronymic,
                      LocalDate birth, boolean gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    // Constructor which includes idCard from PersonNewTry which is extended by this class
    public StudentTry(String idCard, String firstName, String lastName,
                      String patronymic, LocalDate birth, boolean gender,
                      String phone) {
        super(idCard);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StudentTry {" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", birth = " + birth +
                ", gender = " + gender +
                ", phone = '" + phone + '\'' +
                ", idCard = '" + super.getIdCard() + '\'' +
                '}';
    }

    // Create Builder for student
    public static class Builder {
        private StudentTry studentToBuild;

       // Create empty constructor
        public Builder() {
            this.studentToBuild = new StudentTry();
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this; // return the same builder
        }

        public Builder setSimilarTo(StudentTry student){
        this.studentToBuild.firstName = student.firstName;
        this.studentToBuild.lastName = student.lastName;
        this.studentToBuild.patronymic = student.patronymic;
        this.studentToBuild.birth = student.birth;
        this.studentToBuild.gender = student.gender;
        this.studentToBuild.phone = student.phone;
        return this;
        }
        // this.studentToBuild.setFirstName(student.getFirstName());
        //super.studentToBuild.firstName = student.firstName;

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setBirth(LocalDate birth){
            studentToBuild.setBirth(birth);
            return this;
        }

        public Builder setGender(boolean gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setPhone(String phone){
            studentToBuild.setPhone(phone);
            return this;
        }

        // Create builder for idCard from PersonNewTry which is extended by this class
        public Builder setIdCard(String idCard){
            studentToBuild.setIdCard(idCard);
            return this;
        }

        public StudentTry build() {
            return studentToBuild;
        }

    }

}
