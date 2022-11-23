package bo.ucb.edu.backendSpringMrJeff.entity;

import java.util.Date;

public class MrClothingImages {
    private Integer mrClothingImagesId;
    private String url;
    private Integer mrClothingId;
    private Integer principalImage;
    private Integer status;
    private Date txDate;
    private String txUser;
    private String txHost;
    private Date created;
    
    public MrClothingImages(){}

    public MrClothingImages(Integer mrClothingImagesId, String url, Integer mrClothingId, Integer principalImage, Integer status, Date txDate, String txUser, String txHost, Date created) {
        this.mrClothingImagesId = mrClothingImagesId;
        this.url = url;
        this.mrClothingId = mrClothingId;
        this.principalImage = principalImage;
        this.status = status;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
        this.created = created;
    }

    public Integer getMrClothingImagesId() {
        return mrClothingImagesId;
    }

    public void setMrClothingImagesId(Integer mrClothingImagesId) {
        this.mrClothingImagesId = mrClothingImagesId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getMrClothingId() {
        return mrClothingId;
    }

    public void setMrClothingId(Integer mrClothingId) {
        this.mrClothingId = mrClothingId;
    }

    public Integer getPrincipalImage() {
        return principalImage;
    }

    public void setPrincipalImage(Integer principalImage) {
        this.principalImage = principalImage;
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "MrClothingImages{" +
                "mrClothingImagesId=" + mrClothingImagesId +
                "url=" + url +
                "mrClothingId=" + mrClothingId +
                "principalImage=" + principalImage +
                "status=" + status +
                "txDate=" + txDate +
                "txUser=" + txUser +
                "txHost=" + txHost +
                "created=" + created +
                '}';
    }
}
