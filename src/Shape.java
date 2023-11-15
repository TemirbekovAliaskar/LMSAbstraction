public abstract class Shape {

    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimetr();

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
