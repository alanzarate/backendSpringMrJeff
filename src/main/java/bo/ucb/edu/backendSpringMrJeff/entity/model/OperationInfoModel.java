package bo.ucb.edu.backendSpringMrJeff.entity.model;

public class OperationInfoModel {
    public Integer id;
    public String date;
    public String timeStart;
    public String timeEnd;
    public String operation;
    public Double lat;
    public Double lng;
    public Integer operationId;
    public String message;
    public String nameClient;

    public OperationInfoModel(){}
    public OperationInfoModel(Integer id, String date, String timeStart, String timeEnd, String operation, Double lat, Double lng, Integer operationId, String message, String nameClient) {
        this.id = id;
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.operation = operation;
        this.lat = lat;
        this.lng = lng;
        this.operationId = operationId;
        this.message = message;
        this.nameClient = nameClient;
    }

    @Override
    public String toString() {
        return "OperationInfoResDto{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", timeStart='" + timeStart + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", operation='" + operation + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", operationId=" + operationId +
                ", message='" + message + '\'' +
                ", nameClient='" + nameClient + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getOperation () {
        return operation;
    }

    public void setOperation (String operation) {
        this.operation = operation;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
}
