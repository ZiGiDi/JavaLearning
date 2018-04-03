import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        MutablePoint point1 = new MutablePoint(0,0);
//        MutablePoint point2 = new MutablePoint(1,1);
//        MutablePoint point3 = new MutablePoint(3,3);
//
//
//        MutablePoint [] pointArray = new MutablePoint[] {point1, point2, point3};
//
//        for(MutablePoint point: pointArray){
//            System.out.println(point);
//        }
//
//        MutablePoint[] pointArray2 = Arrays.copyOf(pointArray, pointArray.length);
//
//        System.out.println();
//
//        for(MutablePoint point: pointArray2){
//            System.out.println(point);
//        }
//
//        pointArray[0].setX(5);
//
//        System.out.println();
//
//        for(MutablePoint point: pointArray2){
//            System.out.println(point);
//        }
//
//        // write your code here
//
//
//       ImmutablePoint point11 = new ImmutablePoint(0,0);
//        ImmutablePoint point22 = new ImmutablePoint(1,1);
//        ImmutablePoint point33 = new ImmutablePoint(3,3);
//
//        ImmutablePoint [] imPointArray1 = new ImmutablePoint[] {point11, point22, point33};
//
//        System.out.println();
//        System.out.println("Immutable types");
//        System.out.println();
//
//        for (ImmutablePoint point: imPointArray1){
//            System.out.println(point);
//        }
//        System.out.println();
//
//        ImmutablePoint [] imPintArray2 = Arrays.copyOf(imPointArray1, imPointArray1.length);
//
//       // imPintArray2[0] = new ImmutablePoint(5,0);
//        imPintArray2[0].setX(5);
//
//
//        for (ImmutablePoint point: imPointArray1){
//            System.out.println(point);
//        }
//        System.out.println();
//
//
//        for (ImmutablePoint point: imPintArray2){
//            System.out.println(point);
//        }
//


//        ImmutablePoint point1 = new ImmutablePoint(0,0);
//        ImmutablePoint point2 = point1;
//        point2 = point2.setX(7);
//
//        System.out.println(point1);
//        System.out.println(point2);





//
//        MutablePoint point = new MutablePoint(0,0);
//        long tStart = System.currentTimeMillis();
//        for(int i=0; i<100000000; i++){
//           // double x = Math.random()*10;
//            point.setX(1);
//
//        }
//        long tEnd = System.currentTimeMillis();
//
//        System.out.println((tEnd-tStart)+"ms");
//
//
//        ImmutablePoint point1 = new ImmutablePoint(0,0);
//        tStart = System.currentTimeMillis();
//        for(int i=0; i<100000000; i++){
//          //  double x = Math.random()*10;
//            point1 = point1.setX(1);
//
//        }
//        tEnd = System.currentTimeMillis();
//
//        System.out.println((tEnd-tStart)+"ms");
//
//
//


        Point point = new Point(0,0);
        System.out.println(point);
        point.getCoord()[0]=5;
        System.out.println(point);


    }
}
