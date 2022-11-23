package bo.ucb.edu.backendSpringMrJeff.dto;

public class ImageDto {
    private Integer imageId;
    private String image;

    public ImageDto() {
    }

    public ImageDto(Integer imageId, String image) {
        this.imageId = imageId;
        this.image = image;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImageDto{" +
                "imageId=" + imageId +
                ", image='" + image + '\'' +
                '}';
    }
}
