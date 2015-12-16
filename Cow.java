/**
 * Created by fame on 15.10.15.
 */
public class Cow extends Herbivorous{
    public Cow() {
        super(200);
        calories = 200;
    }

    @Override
    public void say() {
        System.out.println("Mooo");
    }

    @Override
    public void eat(Grass food){
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Cow";
    }
}
