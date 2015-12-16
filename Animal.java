public abstract class Animal<Eat extends Edible> implements Edible{
    protected int calories;

    public Animal(int calories) {
        this.calories = calories;
    }

    public void addCalories(int calories){
        this.calories+=calories;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    abstract public void say();

    protected void eat(Eat food) throws ClassCastException{
        addCalories(food.getCalories());
        System.out.println(this + " is eating " + food);
    }
}
