public class ElectricPokemon extends Pokemon{

    private boolean isStatic;

    private boolean hasTrainer;
    public ElectricPokemon(String name, String sound, int level, boolean isStatic, boolean hasTrainer) {
        super(name, sound, level);
        this.isStatic = isStatic;
        this.hasTrainer = hasTrainer;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats electricity");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 3 hours");
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setIsStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }


    public String isHasTrainer() {

        if (hasTrainer) {
            return "has a trainer";
        }
        else {
            return "is a wild pokemon";
        }
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }
}



