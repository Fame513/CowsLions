/**
 * Created by fame on 15.10.15.
 */
public class Goat extends Herbivorous{
    public Goat() {
        super(100);
    }

    @Override
    public void say() {
        System.out.println("Beeeee");
    }

    @Override
    public String toString() {
        return "Goat";
    }
}
