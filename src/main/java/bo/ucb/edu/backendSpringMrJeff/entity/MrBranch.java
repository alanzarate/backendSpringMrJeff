package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrBranch {
    private Integer mrBranchId;
    private String branchName;
    private Double latitude;
    private Double longitude;
    private String addressLink;
    private String catBranchStatus;
    private Integer atentionRatioM;

    public MrBranch(){}
    public MrBranch(Integer mrBranchId, String branchName, Double latitude, Double longitude, String addressLink, String catBranchStatus, Integer atentionRatioM) {
        this.mrBranchId = mrBranchId;
        this.branchName = branchName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.addressLink = addressLink;
        this.catBranchStatus = catBranchStatus;
        this.atentionRatioM = atentionRatioM;
    }

    public Integer getMrBranchId() {
        return mrBranchId;
    }

    public void setMrBranchId(Integer mrBranchId) {
        this.mrBranchId = mrBranchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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

    public String getAddressLink() {
        return addressLink;
    }

    public void setAddressLink(String addressLink) {
        this.addressLink = addressLink;
    }

    public String getCatBranchStatus() {
        return catBranchStatus;
    }

    public void setCatBranchStatus(String catBranchStatus) {
        this.catBranchStatus = catBranchStatus;
    }

    public Integer getAtentionRatioM() {
        return atentionRatioM;
    }

    public void setAtentionRatioM(Integer atentionRatioM) {
        this.atentionRatioM = atentionRatioM;
    }

    @Override
    public String toString() {
        return "MrBranch{" +
                "mrBranchId=" + mrBranchId +
                ", branchName='" + branchName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", addressLink='" + addressLink + '\'' +
                ", catBranchStatus='" + catBranchStatus + '\'' +
                ", atentionRatioM=" + atentionRatioM +
                '}';
    }
}
