package tarea_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escribirFicheroTexto {

	private File fichero = new File("ficheroUsuario.txt");
	public static Scanner sc = new Scanner(System.in);
	String linea = "";

	public void escritura() {

		if (!fichero.exists()) {

			BufferedWriter bw = null;

			try {
				fichero.createNewFile();

				// Abrimos archivo en modo de escritura (sobreescribe el archivo si existe)
				bw = new BufferedWriter(new FileWriter(fichero));

				do {
					System.out.println("Escribe una línea (escribe exit para terminar): ");

					linea = sc.nextLine();

					if (!linea.contentEquals("exit")) {
						bw.write(linea);
						bw.newLine();
					} else {
						System.out.print("Ha escrito exit para terminar");
					}

				} while (!linea.equalsIgnoreCase("exit"));

			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("El fichero: " + fichero.getName() + " ya existe");
		}
	}
}