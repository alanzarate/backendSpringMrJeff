package bo.ucb.edu.backendSpringMrJeff.dto;

public class ClothingOrderDto {
    private Integer quantity;
    private String title;
    private String url;
    private Double total;

    public ClothingOrderDto(){}

    public ClothingOrderDto(Integer quantity, String title, String url, Double total) {
        this.quantity = quantity;
        this.title = title;
        this.url = url;
        this.total = total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ClothingOrderDto [quantity=" + quantity + ", title=" + title + ", total=" + total + ", url=" + url + "]";
    }
    
}
