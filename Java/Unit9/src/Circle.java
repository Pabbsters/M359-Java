public class Circle  extends Shape{
    private double radius;
    final private double PI=3.14159;
    public Circle(String shape, String color, double radius){
        super(shape,color);
        this.radius=radius;
    }
    public String toString() {
        return super.getsColor()+ " " + super.getShape() + " " + "with" + " " + "radius" + " " + "of" + " "+radius;
    }
    public double findArea()
    {
        return  PI * radius*radius;
    }
}
