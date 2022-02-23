package sda.oop.task5;

import sda.oop.task5.Line;

public class MainTask5 {
    public static void main(String[] args) {
        Line line = new Line(5,2,10,14);
        System.out.println(line.calculateLength());
        System.out.println(line.calculateCenter());
    }
}
