package bo.ucb.edu.backendSpringMrJeff.dto;

public class DeliveryDto {
    private Integer mrOperationStateId;
    private Integer mrAddressId;
    private Integer mrUserId;
    private Integer mrScheduleId;
    private Integer mrOrderId;
    private String codeGen;
    private Integer status;
    private String txUser;
    private String txHost;

    public DeliveryDto(){}

    public DeliveryDto(Integer mrOperationStateId, Integer mrAddressId, Integer mrUserId, Integer mrScheduleId, Integer mrOrderId, String codeGen, Integer status, String txUser, String txHost) {
        this.mrOperationStateId = mrOperationStateId;
        this.mrAddressId = mrAddressId;
        this.mrUserId = mrUserId;
        this.mrScheduleId = mrScheduleId;
        this.mrOrderId = mrOrderId;
        this.codeGen = codeGen;
        this.status = status;
        this.txUser = txUser;
        this.txHost = txHost;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public Integer getMrAddresId() {
        return mrAddressId;
    }

    public void setMrAddresId(Integer mrAddresId) {
        this.mrAddressId = mrAddresId;
    }

    public Integer getMrUserId() {
        return mrUserId;
    }

    public void setMrUserId(Integer mrUserId) {
        this.mrUserId = mrUserId;
    }

    public Integer getMrScheduleId() {
        return mrScheduleId;
    }

    public void setMrScheduleId(Integer mrScheduleId) {
        this.mrScheduleId = mrScheduleId;
    }

    public Integer getMrOrderId() {
        return mrOrderId;
    }

    public void setMrOrderId(Integer mrOrderId) {
        this.mrOrderId = mrOrderId;
    }

    public String getCodeGen() {
        return codeGen;
    }

    public void setCodeGen(String codeGen) {
        this.codeGen = codeGen;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    public String toString() {
        return "DeliveryDto{" +
                "mrOperationStateId=" + mrOperationStateId +
                ", mrAddresId=" + mrAddressId +
                ", mrUserId=" + mrUserId +
                ", mrScheduleId=" + mrScheduleId +
                ", mrOrderId=" + mrOrderId +
                ", codeGen='" + codeGen + '\'' +
                ", status='" + status + '\'' +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                '}';
    }
}
