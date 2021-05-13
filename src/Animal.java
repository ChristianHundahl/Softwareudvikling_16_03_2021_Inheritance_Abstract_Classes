public abstract class Animal {
    //Attributes:
    //• name
    //• nrOfLegs
    //• isMammal
    private String color;
    private int numberOfLegs;
    private boolean isMammal;

    public Animal(String color, int numberOfLegs, boolean isMammal){
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.isMammal = isMammal;
    }

    //Methods:
    //makeSound() that prints the sound of the animal.
    public abstract String makeSound();
}