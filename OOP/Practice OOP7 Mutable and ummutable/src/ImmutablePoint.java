/**
 * Created by ZiGiDi on 11.01.2018.
 */
public final class ImmutablePoint {
    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImmutablePoint setX(double x){
        return new ImmutablePoint(x, this.y);
    }

    public ImmutablePoint setY(double y){
        return new ImmutablePoint(this.x, y);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" + "x=" + x + ", y=" + y + '}';
    }
}
