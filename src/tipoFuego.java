import java.util.Random;

public class tipoFuego extends Pokemon {

    public tipoFuego(int ID, String nombre, int nivel, int vida, int poder) {

        super(ID, nombre, "Fuego", nivel, vida, poder);
    }


    public void infierno(Pokemon pokemondef){

        int suerte= (int) (Math.random()*0+1);

        if (suerte==1){
            pokemondef.setVida(0);
        }
    }



}
