import java.util.Arrays;

/**
 * Created by ZiGiDi on 11.01.2018.
 */
public final class Point {
    private final int[] coord = new int[2];

    public Point(int x,int y) {
        this.coord[0]=x;
        this.coord[1]=y;
    }

    public int[] getCoord() {
        return coord.clone();
    }

    @Override
    public String toString() {
        return "Point{" +
                "coord=" + Arrays.toString(coord) +
                '}';
    }
}
