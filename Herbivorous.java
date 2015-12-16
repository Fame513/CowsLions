

public abstract class Herbivorous extends Animal<Grass>{
    public Herbivorous(int calories) {
        super(calories);
    }

    public void eat(Grass food){
        super.eat(food);
    }
}
