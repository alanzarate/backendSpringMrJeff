package bo.ucb.edu.backendSpringMrJeff.dto;

public class NewClothingsOrder {
    private Integer idClothing;
    private Integer quantity;
    private double price;
    private Integer idOrder;

    public NewClothingsOrder(){}

    public NewClothingsOrder(Integer idClothing, Integer quantity, double price, Integer idOrder) {
        this.idClothing = idClothing;
        this.quantity = quantity;
        this.price = price;
        this.idOrder = idOrder;
    }

    public Integer getIdClothing() {
        return idClothing;
    }

    public void setIdClothing(Integer idClothing) {
        this.idClothing = idClothing;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return "NewClothingsOrder{" +
                "idClothing=" + idClothing +
                ", quantity=" + quantity +
                ", price=" + price +
                ", idOrder=" + idOrder +
                '}';
    }
}
