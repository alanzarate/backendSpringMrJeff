package bo.ucb.edu.backendSpringMrJeff.dto;

public class OrderDto
{
    private String comment;
    private Integer mrInvoiceId;
    private String mrOperationState;
    private Integer mrPaymentMethod;
    private Integer payCash;

    public OrderDto(){}

    public OrderDto(String comment, Integer mrInvoiceId, String mrOperationState, Integer mrPaymentMethod, Integer payCash)
    {
        this.comment = comment;
        this.mrInvoiceId = mrInvoiceId;
        this.mrOperationState = mrOperationState;
        this.mrPaymentMethod = mrPaymentMethod;
        this.payCash = payCash;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "comment='" + comment + '\'' +
                ", mrInvoiceId=" + mrInvoiceId +
                ", mrOperationState='" + mrOperationState + '\'' +
                ", mrPaymentMethod=" + mrPaymentMethod +
                ", payCash=" + payCash +
                '}';
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getMrInvoiceId() {
        return mrInvoiceId;
    }

    public void setMrInvoiceId(Integer mrInvoiceId) {
        this.mrInvoiceId = mrInvoiceId;
    }

    public String getMrOperationState() {
        return mrOperationState;
    }

    public void setMrOperationState(String mrOperationState) {
        this.mrOperationState = mrOperationState;
    }

    public Integer getMrPaymentMethod() {
        return mrPaymentMethod;
    }

    public void setMrPaymentMethod(Integer mrPaymentMethod) {
        this.mrPaymentMethod = mrPaymentMethod;
    }

    public Integer getPayCash() {
        return payCash;
    }

    public void setPayCash(Integer payCash) {
        this.payCash = payCash;
    }
}
