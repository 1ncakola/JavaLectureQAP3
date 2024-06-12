public class Circle extends Shape {
    private double radius;

    //no-arg constructor
    public Circle () {
        super();
        this.radius = 1.0;
    }

    // constr with radius
    public Circle (double radius){
        super();
        this.radius = radius;
    }

    //const with radius, color and filled
    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    //Getter for radius
    public double getRadius(){
        return radius;
    }

    //Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Method to get area
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // Method to get perimeter
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
    }

