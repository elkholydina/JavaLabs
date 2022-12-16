import java.util.Scanner;
public class transpose {
    // use keyword static to use this object in main & any function in this class
   static Scanner input = new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter no of rows:");
        int row = input.nextInt();
        System.out.println("Enter no of columns:");
        int col = input.nextInt();
        //declare two dimensional array with size from user to take the matrix from the user
        int[][] array= new int[row][col];
        //declare two dimensional array with the same size to save the transpose of the first matrix
        int[][]arr=new int[row][col];
        // a function to fill the array from user
        fill(array, arr);
        // a function to find the transpose of the first array and save it in the second array
        trans(array, arr);
        System.out.println("the transpose of this 2D array is :");
        // a function to display the result of the transpose to the user
        display(array);
    }
    public static void fill(int [][] array,int [][]arr)
    {
        // for loop to reach each element in this array
        for (int i=0; i<array.length;i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("Enter the value in row no:\t" + (i+1) + "\t and in column no\t" + (j + 1));
                array[i][j] = input.nextInt();
                // fill each place in this array with float number from the user
                arr[i][j] = array[i][j];
            }
        }
    }

    public static void trans (int[][] array , int[][] arr)
    {
        // for loop to reach elements in the array row by row
        for(int i=0;i<array.length;i++)
        {
            // for loop to reach elements in the array column by column
            for(int j=0; j<array[0].length; j++) {
                array[i][j]=arr[j][i];
                // make value of column in array  "arr" save in row in the second  array "array"
            }
        }
    }

    public static void display(int[][] array)
    {
        for(int i=0;i<array.length;i++ )
        {
            for(int j=0; j<array[0].length; j++)
                //print the result of the transpose
                System.out.print("\t" + array[i][j] + "\t");
            System.out.print("\n");
        }
    }
}

