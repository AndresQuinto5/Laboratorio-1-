public interface iRadio
{

    boolean encendidoRadio();

    double subirFrecuencia();


    double bajarFrecuencia();


    void setFavorito(int posicion);


    double getFavorito(int posicion);


    boolean cambiarAmFm();


}