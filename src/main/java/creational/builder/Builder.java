package creational.builder;

public interface Builder {
    Builder setBedrooms(int bedrooms);
    Builder setBathrooms(int bathrooms);
    Builder setColor(String color);
    Builder setIsPool(Boolean isPool);
    House build();
}
