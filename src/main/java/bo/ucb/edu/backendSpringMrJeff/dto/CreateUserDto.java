package bo.ucb.edu.backendSpringMrJeff.dto;

public class CreateUserDto {

    private String username;
    private String secret;
    private String email;
    private Integer personId;

    public CreateUserDto(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "CreateUserDto{" +
                "username='" + username + '\'' +
                ", secret='" + secret + '\'' +
                ", email='" + email + '\'' +
                ", personId=" + personId +
                '}';
    }
}
