public class Arsenal extends Shape{
    public Arsenal(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        int sum = a * b;
        return sum;
    }
}
