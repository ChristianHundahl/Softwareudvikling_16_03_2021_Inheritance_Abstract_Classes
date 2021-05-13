import java.util.ArrayList;

public class Main {
    //Exercise 1 Petting Zoo
    //Write an abstract class called "Animal". An animal has 3 attributes:
    //• name
    //• nrOfLegs
    //• isMammal
    //Animal has an abstract method: makeSound() that prints the sound of the animal.
    //Create 2 animal classes that extends the abstract Animal class and overrides
    //the method to produce their unique sound.
    //Create an ArrayList, add your animals to the list and print every animals sound.
    public static void main(String[] args) {
        SnowyOwl Blinky = new SnowyOwl("White", 2,false);
        SnowyOwl Pyrite = new SnowyOwl("Gray", 2,false);

        Mountainlion Bob = new Mountainlion("Yellow", 4,true);
        Mountainlion Rockjaw = new Mountainlion("Gold", 4,true);

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(Blinky);
        zoo.add(Pyrite);
        zoo.add(Bob);
        zoo.add(Rockjaw);

        for (Animal animal : zoo) {
            System.out.println(animal.makeSound());
        }

        Rectangle dontBeSquare = new Rectangle(2, 2);
        Triangle pyramidScheme = new Triangle(3,3, 3, 4, 4);
        Circle roundabout = new Circle(3,3,3);

        ArrayList<GeometricalFigure> pythagoras = new ArrayList<>();
        pythagoras.add(dontBeSquare);
        pythagoras.add(pyramidScheme);
        pythagoras.add(roundabout);

        for (GeometricalFigure shapes : pythagoras){
            System.out.println(shapes.calculateArea());
            System.out.println(shapes.calculatePerimeter());
        }
    }
}
