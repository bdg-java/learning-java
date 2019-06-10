package hrmanagementtool;

public abstract class GeometricFigure {

    private String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract double volume();
}
