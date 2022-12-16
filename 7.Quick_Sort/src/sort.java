import java.util.Scanner;
public class sort {
    static Scanner input = new Scanner(System.in);
    static int [] array;
    // define a static array to make any function in this class to access and change its elements
    public static void main (String[] args)
    {
        System.out.println("Enter the size of the array...");
        int size = input.nextInt();
        // give the static array its size
        array = new int [size];
        // a function to fill this static array
        fill();
        // a function to make a quick sort in this array
        quickSort();
        // a function to display the result of this array
        display();
    }
    static void fill ()
    {
        // for loop to reach each place in this array and save a value from user
        for (int i=0 ; i<array.length; i++)
        {
            System.out.println("Enter\t"+ (i+1)+ "\t element in the array...");
            array[i]=input.nextInt();
        }
    }
    static void quickSort ()
    {
        // for loop to reach each element in the array starting by the first element
        for (int i=0; i<array.length;i++)
        {
            // for loop to reach each element in the array starting by the second element
            // and compare each element with the value of the first element
            // if value of this element is smaller than value in the first element replace them
            // else do nothing
            for (int j=i+1; j<array.length;j++)
            {
                if (array[i]>array[j])
                {
                   int N = array[i];
                    array[i]=array[j];
                    array[j]=N ;
                }
            }
        }
    }
    static void display ()
    {
        System.out.println("quick sort of this array is...");
        for(int value: array)
        {
            System.out.print(value+"\t");
        }
    }
}
