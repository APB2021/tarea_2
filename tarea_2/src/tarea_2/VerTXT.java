package tarea_2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class VerTXT {

	File ficheroTexto = new File("\\AD\\tarea_2\\src\\tarea_2\\Tarea_2.txt");

	public void visualizaTXT() {
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