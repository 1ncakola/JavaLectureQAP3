public class Rectangle extends Shape {
    private double width;
    private double length;

    //no-arg constructor
    public Rectangle (){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    //Constructor with width and length
    public Rectangle (double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    //Side - side - square.java
    public Rectangle(double side, double side2) {
        
    }

    //getter for width
    public double getWidth () {
        return width;
    }

    //Setter for width
    public void setWidth (double width){
        this.width = width;
    }

    //Getter for length
    public double getLength () {
        return length;
    }

    //Setter for length
    public void setLength (double length) {
        this.length = length;
    }

    //Method for area
    public double getArea (){
        return length * width;
    }

    //Method for perimeter
    public double getPerimeter () {
        return 2 * (length + width);
    }

    @Override
    public String toString () {
        return "Rectangle[" + super.toString() + "width=" + width + ", length= " + length + "]";
    }
    }

