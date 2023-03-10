package creational.builder;

public class House {
    private int bedrooms;
    private int bathrooms;
    private String color;
    private boolean isPool;

    public House(int bedrooms, int bathrooms, String color, boolean isPool) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.color = color;
        this.isPool = isPool;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPool() {
        return isPool;
    }

    public void setPool(boolean pool) {
        isPool = pool;
    }
}
