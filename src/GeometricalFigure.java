public abstract class GeometricalFigure {

    //Exercise 2 Geometrical Figures
    //Write an abstract class called "GeometricalFigure" with 2 abstract methods
    // "calculateArea" & "calculatePerimeter".
    //Write 3 classes: Triangle, rectangle & circle.
    //Determine the different attributes for each shape.
    //Each class extends the abstract class GeometricalFigure and overrides the two
    //methods.
    //Implement the logic as overridden methods to calculate the area & perimeter for
    //a triangle, rectangle & circle.

    //Start off small:
    //Attributes shared by all geometric figures
    //Needed for area, perimeter
    public double height;
    public double width;

    public GeometricalFigure(double height, double width){
        this.height = height;
        this.width = width;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}