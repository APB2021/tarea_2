package tarea_2;

public class Main {

	public static void main(String[] args) {

		// Tarea 2 - Ejercicio 1a

		System.out.println();
		System.out.println("-----------------------");
		System.out.println(" Tarea 2 - Ejercicio 1a");
		System.out.println("-----------------------");

		VerTXT verTXT = new VerTXT();
		verTXT.visualizaTXT();

		// Tarea 2 - Ejercicio 1b

		System.out.println();
		System.out.println("-----------------------");
		System.out.println(" Tarea 2 - Ejercicio 1b");
		System.out.println("-----------------------");

		VerTXTconRutayNombre vertTXTconRutayNombre = new VerTXTconRutayNombre();
		vertTXTconRutayNombre.visualizaTXTconRutayNombre();

		// Tarea 2 - Ejercicio 2

		System.out.println();
		System.out.println("-----------------------");
		System.out.println(" Tarea 2 - Ejercicio 2");
		System.out.println("-----------------------");

		escribirFicheroTexto escribirFichero = new escribirFicheroTexto();
		escribirFichero.escritura();
	}
}