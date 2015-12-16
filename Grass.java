/**
 * Created by fame on 15.10.15.
 */
public class Grass implements Edible {
    private int calories;

    public Grass() {
        this(20);
    }

    public Grass(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Grass";
    }
}
