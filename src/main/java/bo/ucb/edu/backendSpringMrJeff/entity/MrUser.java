package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;
import java.util.Objects;

public class MrUser {
    private Integer userId;
    private String username;
    private String secret;
    private String email;
    private String catUserStatus;
    private Integer personId;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;

    public MrUser(){}
    public MrUser(Integer userId, String username, String secret, String email, String catUserStatus, Integer personId, Integer status, Date txDate, String txUser, String txHost) {
        this.userId = userId;
        this.username = username;
        this.secret = secret;
        this.email = email;
        this.catUserStatus = catUserStatus;
        this.personId = personId;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getCatUserStatus() {
        return catUserStatus;
    }

    public void setCatUserStatus(String catUserStatus) {
        this.catUserStatus = catUserStatus;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MrUser mrUser = (MrUser) o;
        return userId.equals(mrUser.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "MrUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", secret='" + secret + '\'' +
                ", email='" + email + '\'' +
                ", catUserStatus='" + catUserStatus + '\'' +
                ", personId=" + personId +
                ", status=" + status +
                ", txDate=" + txDate +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                '}';
    }
}
