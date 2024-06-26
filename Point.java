public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point () {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX(){
        return x;
    }

    public void setx( float x){
        this.x =  x;
    }

    public float getY(){
        return y;
    }

    public void sety( float y){
        this.x =  y;
    }
    
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    @Override
    public String toString(){
        return "("+ x + "," + y + ")";
    }
}
