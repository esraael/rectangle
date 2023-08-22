package lab5;

public class rectangle {

    private double length;
    private double width;

    public rectangle() {

    }

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("invalid value");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("invalid value");
        }
        this.width = width;
    }

    public double getarea() {
        return length * width;
    }

    public double getperimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "rectangle{" + "length=" + length + ", width=" + width + '}';
    }

}
