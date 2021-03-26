package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Person
  @version  1.0.0 
  @since 26.03.2021 - 19.04
*/

public class PersonNewTry {
    private String idCard;

    public PersonNewTry() {
    }

    public PersonNewTry(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "PersonNewTry{" +
                "idCard='" + idCard + '\'' +
                '}';
    }
}
