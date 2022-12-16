package MyOnlineShop;
import java.util.Scanner;
public class Main {
     static Scanner input = new Scanner(System.in);
     static float TotalPrice;
    public static void main(String[] args) {
        System.out.println("Enter number of books..");
        int num = input.nextInt();
        Book[] array = new ChildrenBook[num];
        totalPriceCalc(array);
        System.out.println("the total price of these\t"+(num)+"\tbooks after discount is:\t"+TotalPrice);
    }

    public static void totalPriceCalc (Book [] array) {
        float pr;
        float p;
        for (int i = 0; i < array.length; i++) {
            array[i] = new ChildrenBook();
            System.out.println("Enter the price of the book number\t"+(i+1));
             p = input.nextInt();
             pr=array[i].price(p);
             TotalPrice+=pr;
        }
    }
}
