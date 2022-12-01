package bo.ucb.edu.backendSpringMrJeff.dto;

public class MrPersonDto
{
    private Integer mrPersonId;
    private String firstName;
    private String lastName;
    private String numPhone;
    private Integer genderPerson;

    public MrPersonDto(){
    }

    public MrPersonDto(Integer mrPersonId, String firstName, String lastName, String numPhone, Integer genderPerson)
    {
        this.mrPersonId = mrPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numPhone = numPhone;
        this.genderPerson = genderPerson;
    }

    @Override
    public String toString()
    {
        return "MrPersonDto{" +
                "mrPersonId=" + mrPersonId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numPhone='" + numPhone + '\'' +
                ", genderPerson='" + genderPerson + '\'' +
                '}';
    }

    public Integer getMrPersonId() {
        return mrPersonId;
    }

    public void setMrPersonId(Integer mrPersonId) {
        this.mrPersonId = mrPersonId;
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
}
