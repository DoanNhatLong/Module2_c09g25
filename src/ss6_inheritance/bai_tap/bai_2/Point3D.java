package ss6_inheritance.bai_tap.bai_2;

public class Point3D extends Point2D{
    float z=0;

    public Point3D() {
    }


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    public String toString(){
        return super.toString() + getZ();
    }
}
