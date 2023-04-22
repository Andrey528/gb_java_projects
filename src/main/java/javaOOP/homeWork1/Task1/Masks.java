package javaOOP.homeWork1.Task1;

public class Masks extends HygieneItems {
    public Masks(Integer productPrice, Integer productCount, Integer amountInPackage) {
        super("Masks", productPrice, productCount, "item", amountInPackage);
    }

    @Override
    public String toString() {
        return "Masks{" + super.toString() + "}";
    }
}
