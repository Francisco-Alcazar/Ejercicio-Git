import java.util.*;
import java.io.*;
public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {

		//llamamos al método calculaLíneas y lo mostramos por consola
		int  x = calculaLíneas();
		System.out.println("Esto son las veces que se repite una palabra: " + x);

		//llamamos al método enteroAleatorio y lo mostramos por consola
		int enteroAleatorio = Random(x);
		System.out.println("Este es el resultado aleatorio= " + enteroAleatorio);

		Metodo2(enteroAleatorio);


	}private static int calculaLíneas(){//Creamos el método para contar las líneas que tiene el fichero de texto

		int x = 0;
		
		//Creamos un try para informar del error si surge alguno
		try {
			
			Scanner teclado = new Scanner (System.in);

			System.out.println("Escriba la ruta del documento: ");
			String ruta = teclado.nextLine();

			File fichero1 =	new File(ruta);
			Scanner read = new Scanner(fichero1);


			while(read.hasNext()) {
				read.next();
				x++;
			}

			read.close();
			
			//Con el catch informamos del error que ha sucedido, en este caso FileNotFoundException
		}catch(FileNotFoundException  e) {
			System.out.println("Error al leer archivo");
		}
		//retornamos x
		return x;


	}private static int Random(int x) {//creamos el método Random para que eliga un número al azar de las líneas calculadas
		
		//creamos la clase random
		Random aleatorio = new Random();
		int enteroAleatorio = aleatorio.nextInt(x);
		
		//RETORNAMOS enteroAleatorio
		return enteroAleatorio;




	}private static void Metodo2(int enteroAleatorio) throws FileNotFoundException  {//Creamos el método para devolver el nombre de la posición concreta.



		File fichero1 =	new File("src\\Nombres.txt");

		Scanner read2 = null;

		read2 = new Scanner(fichero1);

		int i = 0;


		String linea = "";

		//Hacemos el bucle para que sea i sea igual que el numero aleatorio y se guardará eñ nombre que esté en esa posición
		while( read2.hasNext() ) {
			
			i++;
			linea = read2.next();
			if( i == enteroAleatorio ) {
				
				//Imprimos por consola
				System.out.println(linea);
			}
		}		
	}
}
