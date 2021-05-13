public class Circle extends GeometricalFigure {
    //Area of circle: Pi * radius^2
    //Perimeter of circle: 2 * Pi * radius
    private double radius;

    public Circle(double height, double width, double radius) {
        super(width, height);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        double area = (radius*radius);
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
