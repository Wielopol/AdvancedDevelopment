package sda.oop.exceptions.Task1;

public class MainTask1 {

    public static void main(String[] args) throws CannotDivideBy0Exception {
        divide(10,0);
    }

    static double divide (double a, double b) throws CannotDivideBy0Exception {
        if (b == 0) {
            throw new CannotDivideBy0Exception();
        } else {
            return a / b;
        }
    }
}
