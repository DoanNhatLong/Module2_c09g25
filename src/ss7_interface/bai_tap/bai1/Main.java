package ss7_interface.bai_tap.bai1;

import ss7_interface.bai_tap.bai1.animal.Chicken;
import ss7_interface.bai_tap.bai1.animal.Tiger;
import ss7_interface.bai_tap.bai1.fruit.Orange;


public class Main {
    public static void main(String[] args) {
        Chicken test=new Chicken();
        Tiger test2=new Tiger();
        Orange test3=new Orange();
        System.out.println(" "+test.howToEat()+ test2.makeSound() + test3.howToEat());
    }
}
