public abstract class Pokemon {
    private String name;
    private String sound;
    private int level;

    public Pokemon(String name, String sound, int level) {
        this.name = name;
        this.level = level;
        this.sound = sound;
    }

    public abstract void eat();

    public void speak() {
        System.out.println(name + " shall speak important words...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
