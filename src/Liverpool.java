public class Liverpool extends Shape{
    public Liverpool(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return a*b;
    }
}
