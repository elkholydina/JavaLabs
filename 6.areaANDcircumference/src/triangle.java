public class triangle {
    float base;
    float side1;
    float side2;
     float height;

     triangle ()
     {
         System.out.println("Enter the base of the triangle..");
         base = MAIN.input.nextFloat();
         // call "input" from "Main" class to take value from user and save it in base
         System.out.println("Enter the height of the triangle..");
         height = MAIN.input.nextFloat();
         // call "input" from "Main" class to take value from user and save it in height
         //call function called "area" to find the area of this triangle
         area();
         System.out.println("Enter  first & second side of the triangle..");
         side1 = MAIN.input.nextFloat();
         side2 = MAIN.input.nextFloat();
         //call function called "circumference" to find the circumference of this triangle
         circumference();
     }
     void area ()
     {
         System.out.println("the area of the triangle is:\t"+((.5)*base*height));
     }
    void circumference ()
    {
        System.out.println("the circumference of the circle is:\t" + (base+side1+side2));
    }
}
