package ss7_interface.bai_tap.bai1.animal;

import ss7_interface.bai_tap.bai1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Kruc-Kruc";
    }

    @Override
    public String howToEat() {
        return "Fried";
    }
}
