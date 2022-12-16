import java.lang.Math;
// import this "Math" class to use a function "pow" on it
public class circle {
    float R ;
    // define an attribute to save radius
    // a constructor to run after a definition of an object
    circle ()
    {
        System.out.println("Enter the radius of the circle...");
        // call "input" from "Main" class to take value from user and save it in radius
        R = MAIN.input.nextFloat();
        //call function called "area" to find the area of this circle
        area();
        //call function called "circumference" to find the circumference of this circle
        circumference();
    }
    void area ()
    {
        System.out.println("the area of the circle is:\t"+(Math.PI*Math.pow(R,2)));
    }
    void circumference ()
    {
        System.out.println("the circumference of the circle is:\t" + (2*Math.PI*R));
    }

}
