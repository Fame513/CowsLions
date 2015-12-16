import java.util.ArrayList;

/**
 * Created by fame on 15.10.15.
 */
public class World {
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Grass> grasses = new ArrayList<>();

    public void feed(Animal animal, Edible food){
        try {
            animal.eat(food);
        } catch (ClassCastException e){
            System.err.println(animal + " could not eat " + food);
        }
        if (food instanceof Animal){
            animals.remove(food);
        } else if (food instanceof Grass){
            grasses.remove(food);
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Grass> getGrasses() {
        return grasses;
    }

    public Animal getAnimal(int index) {
        return animals.get(index);
    }

    public Grass getGrass(int index) {
        return grasses.get(index);
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void addGrass(Grass grass){
        grasses.add(grass);
    }
}
