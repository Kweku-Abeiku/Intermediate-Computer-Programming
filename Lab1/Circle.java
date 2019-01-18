import java.util.Scanner;
import java.lang.Math;

public class Circle {

    public static void main (String[] args){
        //Display prompt for input.
        System.out.println("Enter radius of Circle:");
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        double area;
        double circumference;
        float Pi = (float) Math.PI;
        System.out.println("Radius:"+ r);

        //Compute Area using radius.
        area = Pi*(r*r);

        //Round off to two decimal places.
        double roundOff_area = Math.round(area * 100.0) / 100.0;
        System.out.println("The area of this circle is "+roundOff_area);

        //Compute circumference using the radius.
        circumference = (2*Pi*r);

        //Round off to two decimal places.
        double roundOff_circum = Math.round(circumference * 100.0) / 100.0;
        System.out.println("The circumference of this circle is "+ roundOff_circum);
    }
}
