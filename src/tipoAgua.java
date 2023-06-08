public class tipoAgua extends Pokemon {




    public tipoAgua(int ID, String nombre, int nivel, int vida, int poder) {

        super(ID, nombre,"Agua", nivel, vida, poder);
    }


    public void pistolaAgua(Pokemon pokemondef){
            pokemondef.setVida(pokemondef.getVida()-(getPoder()+getNivel()*5));
    }

    public void hidroPulso(Pokemon pokemondef){
        pokemondef.setVida(pokemondef.getVida()-(getPoder()*getNivel()+2));
    }



}
