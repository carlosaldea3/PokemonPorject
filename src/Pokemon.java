import java.util.ArrayList;

public abstract class Pokemon{

    private int ID;
    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;
    private int poder;


    public Pokemon(int ID, String nombre, String tipo, int nivel, int vida, int poder) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.poder = poder;
    }

    public void atacar(Pokemon pokemondef){

        if (pokemondef.getVida()!=0){
            pokemondef.setVida(pokemondef.getVida()-1);
        }

    }




    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", poder=" + poder +
                '}';
    }
}

