import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius , height ;
        Circle c1 = new Circle();
        System.out.println("Enter the radius of the circle");
        radius=input.nextDouble();
        c1 = new Circle(radius,"red");
        System.out.println(c1.toString());
        System.out.println("the area of this circle is:\t"+c1.getArea());
        System.out.println("Enter the height of the cylinder..");
        height = input.nextDouble();
        Cylinder c2 = new Cylinder(height);
        c2.setRadius(radius);
        System.out.println(c2.toString());
        System.out.println("the volume of this cylinder is:\t"+c2.getVolume());
    }
}
