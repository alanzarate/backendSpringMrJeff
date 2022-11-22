package bo.ucb.edu.backendSpringMrJeff.entity;

public class MrClothingCard {
    private Integer clothingId;
    private String title;
    private String img;
    private String service;
    private Double price;

    public MrClothingCard(){}

    public MrClothingCard(Integer clothingId, String title, String img, String service, Double price) {
        this.clothingId = clothingId;
        this.title = title;
        this.img = img;
        this.service = service;
        this.price = price;
    }

    public Integer getClothingId() {
        return clothingId;
    }

    public void setClothingId(Integer clothingId) {
        this.clothingId = clothingId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MrClothing{" +
                "clothingId=" + clothingId +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", service='" + service + '\'' +
                ", price=" + price +
                '}';
    }
    
}
