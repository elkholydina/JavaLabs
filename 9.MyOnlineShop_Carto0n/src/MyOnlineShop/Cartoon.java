package MyOnlineShop;
public class Cartoon extends Book{
    @Override
    public float price(float price)
    {
        System.out.println("the price of this book after discount is:\t"+ (price *.3));
        return (float) (price*.3);
    }
}
