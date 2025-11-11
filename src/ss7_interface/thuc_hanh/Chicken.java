package ss7_interface.thuc_hanh;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Cluck-Cluck";
    }

    @Override
    public String howToEat() {
        return "Fried";
    }
}
