public class Mountainlion extends Animal {
    private String sound = "Roar!";

    public Mountainlion(String color, int numberOfLegs, boolean isMammal) {
        super(color, numberOfLegs, isMammal);
    }

    @Override
    public String makeSound(){
        return this.sound;
    }
}
