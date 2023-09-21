import java.util.Scanner;

public class classes {
    public static void main(String[] args) {

        Bicycle objBicycle = new Bicycle();
        objBicycle.braking();
    }
}

class Bicycle {

    // state or field
    private int gear = 5;

    // behavior or method
    public void braking() {
        System.out.println(" Working of Braking");
    }
}