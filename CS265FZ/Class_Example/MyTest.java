package CS265FZ.Class_Example;

import CS265FZ.Class_Example.FlightSeatFit.Status;
public class MyTest {
    public static void main(String[] args) {
        FlightSeatFit fsf = new FlightSeatFit( );

        System.out.println("Test: T1.1");
        if (fsf.fit(40, false) == Status.SUCCESS)  System.out.println("Passed!");
        else
            System.out.println("Failed!");

        System.out.println("Test: T1.2");
        if (fsf.fit(101, true) == Status.FAILURE)  System.out.println("Passed!");
        else
            System.out.println("Failed!");

        System.out.println("Test: T1.3");
        if (fsf.fit(200, false) == Status.FAILURE)  System.out.println("Passed!");
        else
            System.out.println("Failed!");

        System.out.println("Test: T1.4");
        if (fsf.fit(-100, false) == Status.ERROR)  System.out.println("Passed!");
        else
            System.out.println("Failed!");
    }
}
