package MyOnlineShop;

public class ChildrenBook extends Book {
    @Override
    public float price(float price)
    {
        System.out.println("\"the price of this book after discount is:\t"+ (price *.4));
        return (float) (price*.4);
    }
}
