package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super();
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override 
    public double getArea() {
        return 0;
    }
}

