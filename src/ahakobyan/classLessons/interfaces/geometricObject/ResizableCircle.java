package ahakobyan.classLessons.interfaces.geometricObject;

public class ResizableCircle extends Circle implements Resizable {


    public double resize(int percent) {
        return percent * radius;
    }

    public ResizableCircle(double radius) {
        super.radius = radius;
    }
}
