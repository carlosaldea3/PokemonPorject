public class tipoPlanta extends Pokemon {

    public tipoPlanta(int ID, String nombre, int nivel, int vida, int poder) {

        super(ID, nombre, "Planta", nivel, vida, poder);
    }

    public void latigoCepa(Pokemon pokemondef){
        pokemondef.setVida(pokemondef.getVida()-(getPoder()+getNivel()+2));
    }


}
