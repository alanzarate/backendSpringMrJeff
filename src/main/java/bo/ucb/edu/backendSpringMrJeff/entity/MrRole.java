package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrRole {

    private Integer roleId;
    private String detail;
    private String name;
    private Boolean status;
    private String txDate;
    private String txUser;
    private String txHost;
    private String created;

    public MrRole(){
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "MrRole{" +
                "roleId=" + roleId +
                ", detail='" + detail + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", txDate='" + txDate + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
