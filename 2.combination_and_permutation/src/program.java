import java.util.Scanner;
public class program {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int n , r ;
        System.out.println("Enter n...");
        n=inputs.nextInt();
        System.out.println("Enter r...");
        r=inputs.nextInt();
        // call factorial function with different parameters to calculate the factorial
        System.out.println("the combination is \t" +( factorial(n)/(factorial(r)*factorial(n,r))));
        System.out.println("the permutation is\t"+( factorial(n)/factorial(n,r)));
    }
    // function to find the factorial of an integer number
    public static int factorial (int num )
    {
        int x =1;
        for (int i=2 ; i<=num ; i++)
            // multiply x by i which take values of 2,3,4,...,num and save result in x and return result of x
            x*=i;
        return x;
    }
    //function to find the factorial of an integer number but take 2 parameters
    public static int factorial (int num1 , int num2 )
    {
        int x=1;
        for (int i=2 ; i<=(num1-num2) ; i++)
            x*=i;
        return x;
    }
}
