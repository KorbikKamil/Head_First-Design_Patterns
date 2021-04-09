package star_cafe;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}