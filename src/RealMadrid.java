public class RealMadrid extends Shape{

    public RealMadrid(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        int n = a*b;
        return n;
    }

    @Override
    public String toString() {
        return "RealMadrid{" +
                "a=" + a +
                ", b=" + b +
                "} " + super.toString();
    }
}
