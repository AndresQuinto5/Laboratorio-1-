/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 * //Andres Quinto #18288
 * //Maria Jose Castro #181202

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		boolean on = true, lock= false;
		
		Radio i = new Ra();
		
		Scanner t = new Scanner(System.in);
		
		while(op != 9) {
			System.out.println("***PIONER RADIO***");
			System.out.println();
			System.out.println("1. Encender");
			System.out.println("2. AM/FM");
			System.out.println("3. Guardar emisora");
			System.out.println("4. Acceder a emisora");
			System.out.println("5. Subir estacion");
			System.out.println("6. Bajar estacion");
			op = t.nextInt();
			
			//Este es el que enciende y apaga
			if(op == 1) 
			{
				i.encendidoRadio();
				if(on) 
				{
					System.out.println("Apagando");
					on = false;
				}
				if(on == false) 
				{
					System.out.println("Encendido");
					on = true;
				}
			}
			//este cambia de am fm
			if(op == 2) 
			{
				i.cambiarAmFm();
				if(lock == false)
				{
					System.out.println("FM");
					lock = true;
				}
				if(lock)
				{
					System.out.println("AM");
					lock = false;
					
				}
			}
			
			//Guarda la emisora actual
			if(op == 3) 
			{
				int pos = 0;
				i.setFavorito(int posicion);
				System.out.println("Anadido");
			}
			
			//Acceder a estacion solicitada 
			if(op == 4) 
			{
				
			}
			
			//Subir en estaciones
			if(op == 5) 
			{
				if(i.subirVol()) 
				{
					System.out.println("El volumen subion 0.5");
				}
				else {System.out.println("La estacion actual es: "+"hola");}
			}
			//Bajar en estaciones 
			if(op == 6) 
			{
				
				if(i.bajarVol()) 
				{
					System.out.println("El volumen bajo 0.5");
				}
				else {
					System.out.println("No puedes bajar mas de 0");
				}
		}
				
	}

}

	}
