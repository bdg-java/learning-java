package ahakobyan.ClassLessons.inheritance;

public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D() {

    }


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ () {
        float[] result = new float[3];
        result[1] = x;
        result[2] = y;
        result[3] = z;
        return result;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
