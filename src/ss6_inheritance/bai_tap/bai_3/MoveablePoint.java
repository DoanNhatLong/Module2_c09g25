package ss6_inheritance.bai_tap.bai_3;

public class MoveablePoint extends Point{
    float xspeed;
    float yspeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float set1, float set2){
        setXspeed(set1);
        setYspeed(set2);
    }

    public float[] getSpeed(){
        return new float[]{getXspeed(),getYspeed()};
    }

    public String toString(){
        return  " "+ super.toString() + getXspeed() +getYspeed();
    }

    public MoveablePoint move(){
        super.setX(super.getX()+getXspeed());
        super.setY(super.getY()+getYspeed());
        return this;
    }


}
