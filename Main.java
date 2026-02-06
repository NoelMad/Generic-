public class Main {

    public static <T> void swap(Box<T> a, Box<T> b) {
        T temp = a.get();
        a.set(b.get());
        b.set(temp);
    }
    
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");

        System.out.println(pikachu);
        System.out.println(charmander);

        Box<Pokemon> pokemonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran Berry");
        Box<Integer> levelBox = new Box<>(25);

        System.out.println(pokemonBox);
        System.out.println(itemBox);
        System.out.println(levelBox);

        Pair<Pokemon, String> heldItem = new Pair<>(pikachu, "Oran Berry");
        System.out.println(heldItem);

        PokemonOnlyBox<Pokemon> b1 = new PokemonOnlyBox<>(pikachu);
        System.out.println(b1.getType());

        BattlePokemon squirtle = new BattlePokemon("Squirtle", "Water", 60);
        PokemonOnlyBox<BattlePokemon> battleBox = new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.get());

        Box<String> a = new Box<>("Potion");
        Box<String> b = new Box<>("Rare Candy");
        System.out.println("Before: a=" + a.get() + ", b=" + b.get());
            swap(a, b);
        System.out.println("After:  a=" + a.get() + ", b=" + b.get());
    }
}