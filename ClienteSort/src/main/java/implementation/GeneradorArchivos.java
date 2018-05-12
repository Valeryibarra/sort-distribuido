package implementation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GeneradorArchivos {

	public final static String ruta = "./archivos/";
	public final static int[] tamanos = { 30000, 60000, 90000, 120000, 150000, 180000, 210000, 240000, 270000, 300000 };

	public GeneradorArchivos() {

	}

	public void generarArhivos() {

		for (int i = 0; i < tamanos.length; i++) {
			File archivo = new File(ruta + "archivo" + (i + 1));
			try {
				archivo.createNewFile();
				PrintWriter pw = new PrintWriter(new FileWriter(archivo));
				

				for (int j = 0; j < tamanos[i]; j++) {

					int valorEntero = (int) Math.floor(Math.random() * (126 - 33 + 1) + 33);
					char c = (char) valorEntero;

					pw.println(c + "");
				}

				pw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
