package Shapes;

public class Shape {
    private String sColor;
    private String shape;
    public int scaleFactor=2;
    public Shape(String shape,String color){
        this.sColor=color;
        this.shape=shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public String toString(){
        return sColor +" "+ shape;
    }
}
