import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokedex pokedex = new Pokedex();
        Entrenador tu = new Entrenador(3,"Tu", pokedex);
        Entrenador otro = new Entrenador(3,"Otro", pokedex);

        tipoPlanta ditto = new tipoPlanta(2,"Ditto",10,120,15);
        tipoPlanta bellsprout = new tipoPlanta(2,"BellSprout",10,120,15);
        tipoAgua blastoise = new tipoAgua(3,"Blastoise",40,400,200);
        tipoFuego charmander = new tipoFuego(4,"Charmander", 8, 140, 20);
        otro.capturarPokemon(bellsprout);


        System.out.println("Elige tu pokemon inicial");
        System.out.println("1. " + charmander.getNombre());
        System.out.println("2. " + blastoise.getNombre());
        System.out.println("3. " + bellsprout.getNombre());
        System.out.println();
        String inicial = sc.nextLine();

        if (inicial.equals("Charmander") || inicial.equals("1")){
            tu.capturarPokemon(charmander);
        } else if (inicial.equals("Blastoise") || inicial.equals("2")) {
            tu.capturarPokemon(blastoise);
        } else tu.capturarPokemon(bellsprout);

        int opcion=0;

        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Buscar pokemon");
            System.out.println("2. Intercambiar");
            System.out.println("3. Usar pokedex");
            System.out.println("4. Mostrar pokemon");
            System.out.println("5. Salir");

            opcion = sc.nextInt();


            switch (opcion) {

                case 1:

                    Pokemon pokemonenemigo = ditto;
                    int buscarpoke = 0;

                    do {

                        Random numerorandom = new Random();

                        int random = (numerorandom.nextInt(3) + 1);
                        System.out.println(random);
                        if (random == 1) {
                            pokemonenemigo = charmander;
                        } else if (random == 2) {
                            pokemonenemigo = blastoise;
                        } else if (random == 3) {
                            pokemonenemigo = bellsprout;
                        }



                        System.out.println("Pokemon encontrado: " + pokemonenemigo.getNombre() + "   Nivel: " + pokemonenemigo.getNivel() + "   Vida: " + pokemonenemigo.getVida());


                        System.out.println("1. Combatir");
                        System.out.println("2. Capturar");

                        buscarpoke = sc.nextInt();

                    } while (buscarpoke > 2 || buscarpoke <= 0);

                    switch (buscarpoke) {

                        case 1:


                            int eligeataque = 0;
                            if (tu.getEquipo().get(0) instanceof tipoAgua) {
                                System.out.println("Ataques:");
                                System.out.println("1. Hidropulso");
                                System.out.println("2. Pistola agua");

                                eligeataque = sc.nextInt();

                            } else if (tu.getEquipo().get(0) instanceof tipoFuego) {
                                System.out.println("1. Infierno");
                                eligeataque = sc.nextInt();
                            } else if (tu.getEquipo().get(0) instanceof tipoPlanta) {
                                System.out.println("1. Latigo cepa");
                                eligeataque = sc.nextInt();
                            }

                            if (eligeataque == 1) {
                                if (tu.getEquipo().get(0) instanceof tipoAgua) {
                                    ((tipoAgua) tu.getEquipo().get(0)).hidroPulso(pokemonenemigo);
                                    System.out.println(pokemonenemigo.getVida());

                                } else if (tu.getEquipo().get(0) instanceof tipoFuego) {
                                    ((tipoFuego) tu.getEquipo().get(0)).infierno(pokemonenemigo);
                                    System.out.println(pokemonenemigo.getVida());
                                } else if (tu.getEquipo().get(0) instanceof tipoPlanta) {
                                    ((tipoPlanta) tu.getEquipo().get(0)).latigoCepa(pokemonenemigo);
                                    System.out.println(pokemonenemigo.getVida());
                                }
                            }

                            if (eligeataque == 2) {
                                if (tu.getEquipo().get(0) instanceof tipoAgua) {
                                    ((tipoAgua) tu.getEquipo().get(0)).pistolaAgua(pokemonenemigo);
                                    System.out.println(pokemonenemigo.getVida());
                                }

                            }
                            break;

                        case 2:
                            tu.anadirPokemon(pokemonenemigo);
                            System.out.println("Has capturado un: " + pokemonenemigo.getNombre() + " de nivel: " + pokemonenemigo.getNivel() + "!!");
                            break;
                    }
                    break;

                case 2:



                    tu.intercambiarPokemon(otro, otro.getEquipo().get(0));
                    otro.intercambiarPokemon(tu, tu.getEquipo().get(0));

                    System.out.println("Has intercambiado tu: " + tu.getEquipo().get(0).getNombre() + " por un " + otro.getEquipo().get(0).getNombre());
                    System.out.println(tu.getEquipo().get(0));
                    break;

                case 3:

                    pokedex.mostrarLista();

                case 4:

                    System.out.println(tu.getEquipo());

            }
        }while (opcion!=5);

    }
}