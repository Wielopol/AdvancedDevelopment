package sda.oop.task6;

public class MainTask6 {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,1,2,2);
        System.out.println("Base point: " + movablePoint);
        movablePoint.moveDown();
        System.out.println("Down: " + movablePoint);
        movablePoint.moveRight();
        System.out.println("Right: " + movablePoint);
        movablePoint.moveUp();
        System.out.println("Up: " + movablePoint);
        movablePoint.moveLeft();
        System.out.println("Left: " + movablePoint);
        movablePoint.setxSpeed(10);
        movablePoint.setySpeed(10);
        movablePoint.moveUp();
        System.out.println("Up with new speed: " + movablePoint);
    }

}
