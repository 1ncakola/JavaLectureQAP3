public class Square extends Rectangle {
    //const with side
    public Square(double side){
        super (side, side);
    }

    //const with side,color and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //Getter for Side
    public double getSide(){
        return getWidth();
    }

    //Setter for Side
    public void setSide ( double side){
        setWidth(side);
        setLength(side);
    }
    // Overrides
    @Override
    public void setWidth (double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
