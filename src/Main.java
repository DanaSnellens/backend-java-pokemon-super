public class Main {
    public static void main(String[] args) {
        FirePokemon Charmander = new FirePokemon("Charmander", "char-char", 11,
                 true, true);
        ElectricPokemon Pikachu = new ElectricPokemon("Pikachu", "pika-pika", 25, true, false );
        GrassPokemon Bulbasaur = new GrassPokemon("Bulbasaur", "bulba-bulba", 9);
        WaterPokemon Squirtle = new WaterPokemon("Squirtle", "squirt-squirt (ahum...)", 4);

        Charmander.eat();
        Charmander.speak();
        System.out.println(Charmander.getName() + " says " + Charmander.getSound() + " and " + Charmander.isHasTrainer());

        Pikachu.eat();
        Pikachu.setIsStatic(true);

        Squirtle.speak();

        Bulbasaur.eat();











    }
}
