public class Rectangle extends Shape{
     private double width;
     private double height;
    public Rectangle(String shape, String color,double w, double h) {
        super(shape, color);
        this.width=w;
        this.height=h;

    }
    public String toString() {
        return super.getsColor()+ " " + super.getShape() + " " + "sides" + " " + "of" + " " + width + " "+"by"+" " +height;
    }
    public double findArea()
    {
        return width*height;
    }
    public void scalesSize(){
        width*=super.scaleFactor;
        height*=super.scaleFactor;
    }
}
