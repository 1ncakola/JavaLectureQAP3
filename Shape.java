public class Shape {
    private String color;
    private boolean filled;

    //no-arg constructor
    public Shape () {
        this.color = "red";
        this.filled = true;
    }

    //Const with para
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }   
    
    //Getter for color
    public String getColor (){
        return color;
    }

    //Getter for filled
    public boolean isFilled(){
        return filled;
    }

    //Setter for color
    public void setColor (String color) {
        this.color = color;
    }

    //Setter for Filled
    public void setFilled (boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "Shape[color =" + color + ", filled=" + filled + "]";
    }
}
