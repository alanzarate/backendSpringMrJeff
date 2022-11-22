package bo.ucb.edu.backendSpringMrJeff.entity;


public class MrCategoryCloth {
    private Integer categoryClothId;
    private String category;

    public MrCategoryCloth(){}

    public MrCategoryCloth(Integer categoryClothId, String category) {
        this.categoryClothId = categoryClothId;
        this.category = category;
    }

    public Integer getCategoryClothId() {
        return categoryClothId;
    }

    public void setCategoryClothId(Integer categoryClothId) {
        this.categoryClothId = categoryClothId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "MrCategoryCloth{" +
                "categoryClothId=" + categoryClothId +
                ", category='" + category + '\'' +
                '}';
    }

}
