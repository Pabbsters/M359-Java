public class Square extends Shape
{
    private double sideLength;
    public Square(String shape, String color, double sLength){
        super(shape, color);
        this.sideLength=sLength;

    }
    public String toString() {
        return super.getsColor()+ " " + super.getShape() + " " + "with" + " " + "side" + " " + "length" + " "+"of"+" " +sideLength;
    }
    public double findArea()
    {
        return sideLength*sideLength;
    }
    public void scalesSize(){
        sideLength*=super.scaleFactor;

    }
}
