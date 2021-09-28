import java.util.*;
public class Trig {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double degrees = sc.nextDouble();
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        System.out.println("sin(" + degrees + ") = " + sinValue);
        System.out.println("cos(" + degrees + ") = " + cosValue);
    }
}