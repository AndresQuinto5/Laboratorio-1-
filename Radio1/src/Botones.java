import java.util.ArrayList;
public class Botones implements iRadio {

    private double frecuencia;
    private Emisora[] am = new Emisora[11];//aqui se guardan las estaciones AM
    private Emisora[] fm = new Emisora[11];//aqui la lista de las estaciones FM
    private boolean encendido;
    private boolean estado;

    /**
     *
     *Constructor donde reservo espacio de memoria para las variables
     */
    public Botones() {
        this.frecuencia = 0;
        this.encendido = true;
        this.estado = true;
    }


    public double getFrecuencia() {
        return frecuencia;
    }


    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }


    public boolean isEncendido() {
        return encendido;
    }


    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }


    public boolean isEstado() {
        return estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public boolean encendidoRadio() {
        //mientras sea diferente del estado actual permita encender el radio
        this.encendido = !this.encendido;
        return encendido;
    }

    public boolean cambiarAmFm() {
        //mientras sea difernete del estado actual cambia de am a fm
        this.estado = !this.estado;
        return estado;
    }

    public double subirFrecuencia(){
        if(encendido){
            if(estado == true){
                //aqui estará la validacion esto es para AM
                if (this.frecuencia >= 530 && this.frecuencia <= 1610) {//AM llega 530 to 1610
                    this.frecuencia = this.frecuencia + 10;
                    //valor de retorno
                    return frecuencia;
                }
            }
            if (estado == false) {
                //esto es para FM
                if (this.frecuencia >= 87.9 && this.frecuencia <= 107.9) {//fm llega 87.9 to 107.9
                    this.frecuencia = this.frecuencia + 0.2;
                    //valor de retorno
                    return frecuencia;

                }
            }

            return frecuencia;
        }
        return frecuencia;
    }

    /* **
     *
     * @return
     * en este metodo por cada vez que el usuario seleccione la opcion
     * se resta 0.5 al contador ya iniciario
     */

    public double bajarFrecuencia() {
        if(encendido){
            if(estado == true){
                //validacion (que no sea menor a 0)
                if (this.frecuencia >= 530 && this.frecuencia <= 1610) {//AM llega 530 to 1610
                    this.frecuencia = this.frecuencia - 10;
                    //valor de retorno
                    return frecuencia;
                }
            }
            if (estado == false) {
                //esto es para FM
                if (this.frecuencia >= 87.9 && this.frecuencia <= 107.9) {//fm llega 87.9 to 107.9
                    this.frecuencia = this.frecuencia - 0.2;
                    //valor de retorno
                    return frecuencia;

                }
            }

            return frecuencia;
        }
        return frecuencia;
    }

    public void setFavorito(int posicion) {
        Emisora emisora = new Emisora();
        emisora.setEstacion(getFrecuencia());
        if(encendido){
            if(estado == true){
                emisora.setEstacion(frecuencia);
                this.am[posicion - 1]= emisora;
            }

            else {
                emisora.setEstacion(frecuencia);
                this.am[posicion-1]= emisora;
            }

        }
    }

    public double getFavorito(int posicion) {
        if(encendido){
            if(estado == true){
                this.frecuencia = this.am[posicion-1].getEstacion();
            }
            if(estado == false){
                this.frecuencia = this.fm[posicion-1].getEstacion();
                return frecuencia ;
            }
        }
        return frecuencia;
    }

}