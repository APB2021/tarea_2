package tarea_2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VerTXTconRutayNombre {

	public static Scanner sc = new Scanner(System.in);

	public void visualizaTXTconRutayNombre() {

		System.out
				.print("Introduzca la ruta del fichero de texto a leer (por ejemplo: \\AD\\tarea_2\\src\\tarea_2\\): ");
		String rutaFichero = sc.nextLine();
		System.out.print("Introduzca el nombre fichero de texto a leer (por ejemplo: Tarea_2_Ejercicio_1b.txt): ");
		String nombreFichero = sc.nextLine();

		File ficheroTexto = new File(rutaFichero + nombreFichero);

		System.out.println("RUTA del FICHERO: " + ficheroTexto.getAbsolutePath());

		if (ficheroTexto.exists() && ficheroTexto.isFile()) {
			try {
				ficheroTexto.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("El contenido del fichero llamado " + ficheroTexto.getName() + " es: ");
			System.out.println("--------------------------------------------------------------------");
		} else {
			System.out.println("El fichero " + ficheroTexto.getName() + " no es un fichero o no puede ser leído.");
		}

		FileReader lector = null;

		try {
			lector = new FileReader(ficheroTexto);
			int i;
			while ((i = lector.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lector != null) {
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}