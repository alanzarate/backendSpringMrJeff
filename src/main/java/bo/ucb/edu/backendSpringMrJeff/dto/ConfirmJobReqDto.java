package bo.ucb.edu.backendSpringMrJeff.dto;

public class ConfirmJobReqDto {
    private Integer idJobOperation;
    private Integer idOperationStateId;
    private String operation;
    private Boolean accepted;

    public ConfirmJobReqDto(){}
    public ConfirmJobReqDto(Integer idJobOperation, Integer idOperationStateId, String operation, Boolean accepted) {
        this.idJobOperation = idJobOperation;
        this.idOperationStateId = idOperationStateId;
        this.operation = operation;
        this.accepted = accepted;
    }

    public Integer getIdJobOperation() {
        return idJobOperation;
    }

    public void setIdJobOperation(Integer idJobOperation) {
        this.idJobOperation = idJobOperation;
    }

    public Integer getIdOperationStateId() {
        return idOperationStateId;
    }

    public void setIdOperationStateId(Integer idOperationStateId) {
        this.idOperationStateId = idOperationStateId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }
}
