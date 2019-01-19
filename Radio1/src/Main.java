import java.util.Scanner;

/**
 *
 * Andres Quinto #18288
 *Maria Jose Castro #181202
 *
 */
public class Main {
    private boolean isOn = false;
    private boolean isFM = true;

    public boolean encendidoRadio(){
        this.isOn = !this.isOn;
        return this.isOn;
    }
    /**
     *
     * @param args
     */

    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        iRadio i = new Botones();
        int op = 0;
        while(op != 7) {
            System.out.println("**********PIONER RADIO********");
            System.out.println();
            System.out.println("1. Encender");
            System.out.println("2. AM/FM");
            System.out.println("3. Guardar emisora");
            System.out.println("4. Acceder a emisora");
            System.out.println("5. Subir estacion");
            System.out.println("6. Bajar estacion");
            op = teclado.nextInt();

            //Este es el que enciende y apaga

            //este cambia de am fm

            //Guarda la emisora actual
            if(op == 3)
            {
                //int pos = 0;
                //i.setFavorito(int posicion);
                System.out.println("Anadido");
            }




            if(op == 4)
            {
                //i.getFavorito(posicion);
                System.out.println("Anadido");
            }
            //Subir en estaciones
            if(op == 5)
            {
                i.subirFrecuencia();
				{
					System.out.println("La frecuencia subio 0.5");
				}
				{System.out.println("La estacion actual es: "+"hola");}
			}
                //Bajar en estaciones
                if(op == 6)
                {

                    i.bajarFrecuencia();
				{
					System.out.println("La frecuencia bajo 0.5");
				}
				{
					System.out.println("No puedes bajar mas de 0");
				}
		}

                }

            }
        }

