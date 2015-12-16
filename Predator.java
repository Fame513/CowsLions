
public abstract class Predator extends Animal<Herbivorous>{

    public Predator(int calories) {
        super(calories);
    }

    public void eat(Herbivorous food) {
        super.eat(food);
    }
}
