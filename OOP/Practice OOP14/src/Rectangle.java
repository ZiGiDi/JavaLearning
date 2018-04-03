import java.io.Serializable;

public class Rectangle implements Cloneable, Serializable {


    private static final long serialVersionUID = 1L;
    private double lenght;
    private  double with;

    public Rectangle(double lenght, double with) {
        this.lenght = lenght;
        this.with = with;
    }

    public Rectangle() {
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", with=" + with +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Rectangular destroyed");
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.lenght, lenght) != 0) return false;
        return Double.compare(rectangle.with, with) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(lenght);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(with);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
