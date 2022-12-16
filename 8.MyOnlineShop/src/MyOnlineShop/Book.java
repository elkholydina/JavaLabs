package MyOnlineShop;

public class Book extends Product {
    @Override
    public float price(float price) {
        System.out.println("the price of this book after discount is:\t"+ (price *.2));
        return (float) (price*.2);
    }
}
