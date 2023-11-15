public class ManchesterCity extends Shape{
    public ManchesterCity(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return a*b;
    }
}
