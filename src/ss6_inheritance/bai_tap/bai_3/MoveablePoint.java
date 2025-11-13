package ss6_inheritance.bai_tap.bai_3;

public class MoveablePoint extends Point{
    float xSpeed;
    float ySpeed;


    public MoveablePoint() {
    }

    public MoveablePoint(float xspeed, float ySpeed) {
        this.xSpeed = xspeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xspeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xspeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xspeed) {
        this.xSpeed = xspeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float set1, float set2){
        setXSpeed(set1);
        setYSpeed(set2);
    }

    public float[] getSpeed(){
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public String toString(){
        return  " "+ super.toString() + getXSpeed() + getYSpeed();
    }

    public MoveablePoint move(){
        super.setX(super.getX()+ getXSpeed());
        super.setY(super.getY()+ getYSpeed());
        return this;
    }


}
