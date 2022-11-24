package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrOperationState {
    private Integer mrOperationStateId;
    private String state;
    private String forOperation;
    private String descriptionState;
    private Integer shouldShow;

    public MrOperationState(){}
    public MrOperationState(Integer mrOperationStateId, String state, String forOperation, String descriptionState, Integer shouldShow) {
        this.mrOperationStateId = mrOperationStateId;
        this.state = state;
        this.forOperation = forOperation;
        this.descriptionState = descriptionState;
        this.shouldShow = shouldShow;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getForOperation() {
        return forOperation;
    }

    public void setForOperation(String forOperation) {
        this.forOperation = forOperation;
    }

    public String getDescriptionState() {
        return descriptionState;
    }

    public void setDescriptionState(String descriptionState) {
        this.descriptionState = descriptionState;
    }

    public Integer getShouldShow() {
        return shouldShow;
    }

    public void setShouldShow(Integer shouldShow) {
        this.shouldShow = shouldShow;
    }

    @Override
    public String toString() {
        return "MrOperationState{" +
                "mrOperationStateId=" + mrOperationStateId +
                ", state='" + state + '\'' +
                ", forOperation='" + forOperation + '\'' +
                ", descriptionState='" + descriptionState + '\'' +
                ", shouldShow=" + shouldShow +
                '}';
    }
}
