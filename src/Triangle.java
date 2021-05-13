public class Triangle extends GeometricalFigure {
    //Area of triangle: 0,5 * base * height
    //Perimeter of triangle: all sides added together
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle (double height, double width, double sideA, double sideB, double sideC) {
        super(height, width);
        this.height = sideA;
        this.width = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea(){
        double base = sideC;
        double area = 0.5 * base * height;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
