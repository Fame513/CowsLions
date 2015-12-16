/**
 * Created by fame on 15.10.15.
 */
public class Lion extends Predator{
    public Lion() {
        super(150);
    }

    @Override
    public void say() {
        System.out.println("Arrrrrrrrrr");
    }

    @Override
    public String toString() {
        return "Lion";
    }
}
