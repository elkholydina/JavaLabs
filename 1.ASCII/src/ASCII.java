import java.util.Scanner;
public class ASCII {
    public static void main(String[] args)
    {
        Scanner ASCII = new Scanner (System.in);
        System.out.println("Enter ASCII number(numbers from 65:90 0r 97:122)...");
     int num= ASCII.nextInt();
     // take an integer number from the user
        System.out.println("the character is\t"+(char)num);
        // casting the type of the integer number to character type to print its ASCII number
    }
}
