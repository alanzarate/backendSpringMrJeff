package bo.ucb.edu.backendSpringMrJeff.dto;

public class MrUserDto
{
    private String username;
    private String secret;
    private String email;

    public MrUserDto(){}

    public MrUserDto(String username, String secret, String email)
    {
        this.username = username;
        this.secret = secret;
        this.email = email;
    }

    @Override
    public String toString() {
        return "MrUserDto{" +
                "username='" + username + '\'' +
                ", secret='" + secret + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

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
}
