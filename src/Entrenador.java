import java.util.ArrayList;

public class Entrenador {

    private int ID;

    private String nombre;
    private ArrayList <Pokemon> equipo = new ArrayList<>();
    private Pokedex pokedex;


    public Entrenador(int ID, String nombre, Pokedex pokedex) {
        this.ID = ID;
        this.nombre = nombre;
        this.pokedex = pokedex;
    }

    public void capturarPokemon(Pokemon pokemon){

        equipo.add(pokemon);
        pokedex.registrarPokemon(pokemon);

    }

    public void liberarPokemon(Pokemon pokemon){
        equipo.remove(pokemon);
    }

    public void intercambiarPokemon(Entrenador pokemon, Pokemon pokemonaintercambiar){

        if (this.equipo.contains(pokemonaintercambiar)){
            pokemon.capturarPokemon(pokemonaintercambiar);
            liberarPokemon(pokemonaintercambiar);
        }

    }


    public void buscarPokemon(Pokemon pokemonbuscado) {

        pokedex.buscarPokemon(pokemonbuscado);

    }

    public void mostrarLista() {

        pokedex.mostrarLista();

    }

    public void registrarPokemon(Pokemon pokemonbuscado) {

        pokedex.registrarPokemon(pokemonbuscado);

    }

    public void mostrarEquipo() {

        for (Pokemon pokemon:equipo) {
            System.out.println(pokemon.getNombre());
        }
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void anadirPokemon(Pokemon pokemon){

        equipo.add(pokemon);

    }

}
