package bo.ucb.edu.backendSpringMrJeff.dto;

import java.util.List;

public class ClothingDto {
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private List<ImageDto> images;
    private List<ServiceDto> services;

    public ClothingDto() {}

    public ClothingDto(Integer id, String title, String description, Double price, List<ImageDto> images, List<ServiceDto> services) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.images = images;
        this.services = services;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<ImageDto> getImages() {
        return images;
    }

    public void setImages(List<ImageDto> images) {
        this.images = images;
    }

    public List<ServiceDto> getServices() {
        return services;
    }

    public void setServices(List<ServiceDto> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "ClothingDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", images=" + images +
                ", services=" + services +
                '}';
    }

}
