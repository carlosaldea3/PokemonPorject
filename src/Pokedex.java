import java.util.ArrayList;

public class Pokedex {

    private int ID;

    private ArrayList<Pokemon> ListaPokemon = new ArrayList<Pokemon>();


    public void registrarPokemon(Pokemon NuevoPokemon) {

            ListaPokemon.add(NuevoPokemon);

    }

    public void buscarPokemon(Pokemon pokemonbuscado) {

        for (Pokemon pokemon:ListaPokemon) {
            if (pokemon.getNombre().equals(pokemonbuscado.getNombre())){
                System.out.println(ListaPokemon.indexOf(pokemon));
                System.out.println(pokemon.toString());
            } else {
                System.out.println("No existe");
            }
        }

    }

    public void mostrarLista(){

        for (int i = 0; i < ListaPokemon.toArray().length; i++) {

            System.out.println(ListaPokemon.get(i).getNombre());

        }

    }







}




