
import java.util.Scanner;

public class Reverse {

    public static void main (String[] args){
        String finalSentence = "";
        /* Display prompt for input. */
        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        //Function to split the words
        String[] splitt = str.split("\\s+");


        /* accessing the words stored in the array. */
        for (int i = 0; i < splitt.length; i++)
            for(int a = splitt[i].length() - 1; a >= 0; a--)
            {
                //Function to concatenate individually reversed letters
                reverse = reverse + splitt[i].charAt(a);

                //Function to add space after every word
                if (a==0){
                    reverse = reverse + " ";
                }

            }
            //Function to concatenate individually reversed words
            finalSentence = finalSentence + reverse ;
            System.out.println(finalSentence);
    }
}
