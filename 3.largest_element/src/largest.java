import java.util.Scanner;
public class largest {
  // use keyword static to use this object in main & any function in this class
   static Scanner input = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array..");
        int size= input.nextInt();
        // declared an array with size from the user
        float [] array = new float [size] ;
        // call an function called fill to fill this array
        fill(array);
        // call an function called largest_value to find the largest value in this array and print this value
        System.out.println("the largest value in this array is\t"+largest_value(array));
    }

   //function called fill to fill any array
    public static void fill (float[] array)
    {
        // for loop to reach each element in this array
        for (int i=0;i<array.length;i++)
        {
            System.out.println("Enter array element no\t"+ (i+1));
            array[i]=input.nextFloat();
            // fill each place in this array with float number from the user
        }
    }

    // function to find the largest element in amy array
    public static float largest_value (float[] array)
    {
        float large = array[0];
        // set the value of large variable with the first element of the array
        // for loop to reach each element in this array and compare it with the value in the large variable
        for (int i=0 ; i<array.length; i++)
        {
            // check if value in large variable greater than array element or not
            //if yes set the value of the large with this vale
            // if no do nothing
            //and in the end it will return the large value in this array
            if(large<array[i])
                large=array[i];
        }
        return large;
    }
}
