public class Rectangle extends GeometricalFigure {
    //Area of rectangle: width * length
    //Perimeter of rectangle: 2*(length+width)

    public Rectangle (double width, double height){
        super (width, height);
    }

    @Override
    public double calculateArea(){
        double area = width * height;
        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * (height + width);
        return perimeter;
    }
}
