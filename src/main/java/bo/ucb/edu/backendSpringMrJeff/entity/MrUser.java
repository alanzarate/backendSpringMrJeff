package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;
import java.util.Objects;

public class MrUser {
    private Integer userId;
    private String username;
    private String secret;
    private String email;
    private Boolean status;
    private String txUsername;
    private String txHost;
    private Date txDate;
    private Date created;

    public MrUser(){}
    public MrUser(Integer userId, String username, String secret, String email, Boolean status, String txUsername, String txHost, Date txDate, Date created) {
        this.userId = userId;
        this.username = username;
        this.secret = secret;
        this.email = email;
        this.status = status;
        this.txUsername = txUsername;
        this.txHost = txHost;
        this.txDate = txDate;
        this.created = created;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTxUsername() {
        return txUsername;
    }

    public void setTxUsername(String txUsername) {
        this.txUsername = txUsername;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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


}
