package bo.ucb.edu.backendSpringMrJeff.dto;


public class BodyClothingOrderDto {
    private Integer mrOperationStateId;
    private Integer mrAddressId;
    private Integer mrUserId;
    private Integer mrScheduleId;
    private Integer mrOrderId;
    private Integer codeGen;
    private Integer status;

    public BodyClothingOrderDto(){}

    public BodyClothingOrderDto(Integer mrOperationStateId, Integer mrAddressId, Integer mrUserId, Integer mrScheduleId, Integer mrOrderId, Integer codeGen, Integer status) {
        this.mrOperationStateId = mrOperationStateId;
        this.mrAddressId = mrAddressId;
        this.mrUserId = mrUserId;
        this.mrScheduleId = mrScheduleId;
        this.mrOrderId = mrOrderId;
        this.codeGen = codeGen;
        this.status = status;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public Integer getMrAddressId() {
        return mrAddressId;
    }

    public void setMrAddressId(Integer mrAddressId) {
        this.mrAddressId = mrAddressId;
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

    public Integer getCodeGen() {
        return codeGen;
    }

    public void setCodeGen(Integer codeGen) {
        this.codeGen = codeGen;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BodyClothingOrderDto [codeGen=" + codeGen + ", mrAddressId=" + mrAddressId + ", mrOperationStateId="
                + mrOperationStateId + ", mrOrderId=" + mrOrderId + ", mrScheduleId=" + mrScheduleId + ", mrUserId="
                + mrUserId + ", status=" + status + "]";
    }
    
}
