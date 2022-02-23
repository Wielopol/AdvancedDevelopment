package sda.oop.task1;

import java.util.Arrays;

public class MainTask1 {
    public static void main(String[] args) {
//        Point2D emptyPoint2D = new Point2D();
//        System.out.println(emptyPoint2D);
//
//        Point2D point2D = new Point2D(1, 10);
//        System.out.println(point2D);
//        point2D.setXY(2,20);
//        System.out.println(point2D);
//        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(5,10,15);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
