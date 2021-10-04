import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pruebas {

	public static void main(String[] args) throws IOException {

		File fichero = new File("C:\\Users\\Alumno\\eclipse-workspace\\Procesos\\ArrayList\\Texto.txt");
		File fichero2 = new File("Texto.txt");
		char espacio = (char)32;

		FileWriter write = new FileWriter(fichero2);
		FileWriter write2 = new FileWriter(fichero, true); // Asi puedes añadir mas valores
		FileReader read = new FileReader(fichero);
		System.out.println(fichero.getParent());
		System.out.println(fichero.getPath());
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getName());

		int valor = read.read();
		int palabra = 0;
		while (valor != -1) {
			System.out.print((char) valor);
			
			if(valor == espacio) {
				palabra++;
				System.out.println("");
			}
			
			valor = read.read();
			write.write(valor);
		}
		System.out.print("\nHay " +palabra + " palabras");
		write.close();

		for (int i = 0; i < args.length; i++) {

			System.out.print(args[i].toUpperCase());

		}
		ficheroBinario(fichero);
	}

	public static void ficheroBinario(File fichero) {
		try {
			File fichero3 = new File("fichero2.doc");
			FileOutputStream binario = new FileOutputStream(fichero3);

			String texto = "Esto es una prueba para ficheros binariosssss";
			// Copiamos el texto en un array de bytes
			byte codigos[] = texto.getBytes();
			Integer.toBinaryString(0);
			binario.write(codigos);
			int contador = 0;
			while(binario.toString() != null) {
				contador ++;
				
			}
			System.out.println("\nHay " + contador + " palabras");
			
			binario.close();
		} catch (Exception e) {
			System.out.println("error");
		}

	}
	
	public static void inputStream() {
		
		
		
		
	}

}
