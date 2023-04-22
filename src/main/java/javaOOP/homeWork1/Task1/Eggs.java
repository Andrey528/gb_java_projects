package javaOOP.homeWork1.Task1;

public class Eggs extends Food {
    private Integer amountInPack;

    public Eggs(Integer productPrice, Integer productCount, String expirationDate, Integer amountInPack) {
        super("Eggs", productPrice, productCount, "Item", expirationDate);
        this.amountInPack = amountInPack;
    }

    @Override
    public String toString() {
        return "Eggs{" + super.toString() +
                ", amountInPack=" + amountInPack + "}";
    }
}
