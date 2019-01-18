import java.util.Scanner;
//IMPORT SCANNER TO ENABLE INPUT.
public class Length {

    public static void main (String[] args){
        //Integer data type to store input length.
        int strLength;

        //Function to display "Input Word"
        System.out.println("Input Word");

        //Variable to store input.
        Scanner input1 = new Scanner(System.in);
        String input = input1.next();
        //Variable to store length
        strLength = input.length();
        System.out.println("The length is: "+strLength);

    }
}
