public class FirePokemon extends Pokemon{
    private boolean hasExternalFlame;
    private boolean hasTrainer;

    public FirePokemon(String name, String sound, int level, boolean hasExternalFlame, boolean hasTrainer) {
        super(name, sound,level);
        this.hasExternalFlame = hasExternalFlame;
        this.hasTrainer = hasTrainer;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " eats fire-berry");
    }

    public void weakness() {
        System.out.println(getName() + " has a weakness to Water");
    }

    public void strongAgainst() {
        System.out.println(getName() + " is strong against Grass-type");
    }


    public boolean isHasExternalFlame () {
        return hasExternalFlame;
    }

    public void setHasExternalFlame(boolean hasExternalFlame) {
        this.hasExternalFlame = hasExternalFlame;
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
