public class Dordoi extends Shape{
    public Dordoi(int a, int b) {
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return a*b;
    }
}
