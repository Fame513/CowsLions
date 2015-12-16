
public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.addAnimal(new Lion());
        world.addAnimal(new Cow());
        world.addGrass(new Grass());

        world.feed(world.getAnimal(0), world.getGrass(0));

    }
}
