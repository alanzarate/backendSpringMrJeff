package bo.ucb.edu.backendSpringMrJeff.entity.model;

public class DeliverDetailModel {
    private Integer mrDeliverId;
    private String dateOpe;
    private Integer mrOperationStateId;
    private Double latitude;
    private Double longitude;
    private String descriptionState;
    private String forOperation;
    private String timeStart;
    private String timeEnd;
    private String firstName;
    private String lastName;

    public DeliverDetailModel(){}
    public DeliverDetailModel(Integer mrDeliverId, String dateOpe, Integer mrOperationStateId, Double latitude, Double longitude, String descriptionState, String forOperation, String timeStart, String timeEnd, String firstName, String lastName) {
        this.mrDeliverId = mrDeliverId;
        this.dateOpe = dateOpe;
        this.mrOperationStateId = mrOperationStateId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.descriptionState = descriptionState;
        this.forOperation = forOperation;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getMrDeliverId() {
        return mrDeliverId;
    }

    public void setMrDeliverId(Integer mrDeliverId) {
        this.mrDeliverId = mrDeliverId;
    }

    public String getDateOpe() {
        return dateOpe;
    }

    public void setDateOpe(String dateOpe) {
        this.dateOpe = dateOpe;
    }

    public Integer getMrOperationStateId() {
        return mrOperationStateId;
    }

    public void setMrOperationStateId(Integer mrOperationStateId) {
        this.mrOperationStateId = mrOperationStateId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDescriptionState() {
        return descriptionState;
    }

    public void setDescriptionState(String descriptionState) {
        this.descriptionState = descriptionState;
    }

    public String getForOperation() {
        return forOperation;
    }

    public void setForOperation(String forOperation) {
        this.forOperation = forOperation;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
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
}
