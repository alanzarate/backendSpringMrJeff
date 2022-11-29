package bo.ucb.edu.backendSpringMrJeff.dto;

public class NewUserReqDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String numPhone;
    private Integer gender;
    private String role;

    private String token;

    public NewUserReqDto(){}

    public NewUserReqDto(String username, String password, String firstName, String lastName, String email, String numPhone, Integer gender, String role, String token) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.numPhone = numPhone;
        this.gender = gender;
        this.role = role;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
