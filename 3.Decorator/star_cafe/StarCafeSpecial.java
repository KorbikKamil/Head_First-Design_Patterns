package star_cafe;

public class StarCafeSpecial extends Beverage {
    public StarCafeSpecial() {
        description = "Star Cafe Special Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
