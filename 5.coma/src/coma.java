import java.util.Scanner;
public class coma {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string...");
        // save the full string from the user until enter key is pressed
        String str = input.nextLine();
        //define an array to save this string after split it using , "comma"
        String[] arr = str.split(",");
        // function to display the result
        display(arr);
    }

    public static void display(String [] array)
    {
        System.out.println("the string without coma is... ");
        // using for each to reach each element in this array and print it
        for (String value : array)
        {
            System.out.print(value+"\t");
        }
    }
}
