package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrPerson {
    private Integer personId;
    private String firstName;
    private String lastName;
    private String numPhone;
    private Integer genderPerson;
    private String catPerStatus;

    public MrPerson(){}

    public MrPerson(Integer personId, String firstName, String lastName, String numPhone, Integer genderPerson, String catPerStatus) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numPhone = numPhone;
        this.genderPerson = genderPerson;
        this.catPerStatus = catPerStatus;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public Integer getGenderPerson() {
        return genderPerson;
    }

    public void setGenderPerson(Integer genderPerson) {
        this.genderPerson = genderPerson;
    }

    public String getCatPerStatus() {
        return catPerStatus;
    }

    public void setCatPerStatus(String catPerStatus) {
        this.catPerStatus = catPerStatus;
    }

    @Override
    public String toString() {
        return "MrPerson{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numPhone='" + numPhone + '\'' +
                ", genderPerson='" + genderPerson + '\'' +
                ", catPerStatus='" + catPerStatus + '\'' +
                '}';
    }
}
