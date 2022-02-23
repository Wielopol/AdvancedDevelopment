package sda.oop.task5;

import sda.oop.task1.Point2D;

public class Line {
    private Point2D startPoint;
    private Point2D endPoint;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(float startPointX, float startPointY, float endPointX, float endPointY) {
        this.startPoint = new Point2D(startPointX,startPointY);
        this.endPoint = new Point2D(endPointX,endPointY);
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public float calculateLength () {
        double square = (double) (endPoint.getX()-startPoint.getX())*(endPoint.getX()-startPoint.getX())+
                (endPoint.getY()-startPoint.getY())*(endPoint.getY()-startPoint.getY());
        return (float) (Math.sqrt(square));
    }

    public Point2D calculateCenter () {
        float xCenter = (startPoint.getX()+endPoint.getX())/2;
        float yCenter = (startPoint.getY()+endPoint.getY())/2;
        return new Point2D(xCenter,yCenter);
    }
}
