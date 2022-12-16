public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        System.out.println("this is a class to calculate volume of a cylinder..");
    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height , double radius){
        super(radius);
        this.height= height;
    }
    public Cylinder(double height, double radius , String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
    public double getVolume(){
        return (super.getArea()*height);
    }
}
