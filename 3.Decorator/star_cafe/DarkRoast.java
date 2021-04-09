package star_cafe;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark ROast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
