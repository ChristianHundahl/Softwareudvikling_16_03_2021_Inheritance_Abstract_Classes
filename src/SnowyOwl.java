public class SnowyOwl extends Animal {
    private String sound = "Hoot, hoot";

    public SnowyOwl(String color, int numberOfLegs, boolean isMammal) {
        super (color, numberOfLegs, isMammal);
    }

    @Override
    public String makeSound(){
        return this.sound;
    }
}
