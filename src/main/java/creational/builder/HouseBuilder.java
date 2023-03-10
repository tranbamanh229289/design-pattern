package creational.builder;

public class HouseBuilder implements Builder {
    private int bedrooms;
    private int bathrooms;
    private String color;
    private boolean isPool;

    @Override
    public Builder setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }

    @Override
    public Builder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder setIsPool(Boolean isPool) {
        this.isPool = isPool;
        return this;
    }

    @Override
    public House build() {
        return new House(bedrooms, bathrooms, color, isPool);
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }
}
