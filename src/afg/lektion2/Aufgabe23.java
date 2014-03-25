/**
 * Schreiben Sie ein kleines Programm, in dem Sie einen zweidimensionalen 
 * Array definieren, erzeugen und initialisieren, initialisieren Sie 
 * den Array auf zwei verschiedene Arten.
 */
package afg.lektion2;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe23 {

	private String output;
	private String classPath;

	private int[][] a = { { 0 }, { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
	private int[][] b;

	public Aufgabe23() {
		output = "Dreieckiges Array\n\n";
		output += "Deklariert und Initialisiert mit:\nprivate int[][] a = { { 0 }, "
				+ "{ 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };\n\n";
		for (int i = 0; i < a.length; ++i) {
			output += "a.lenght = " + a.length + "\n";
			output += "a[" + i + "].length = " + a[i].length + "\n";
			for (int j = 0; j < a[i].length; ++j) {
				output += a[i][j] + " ";
			}
			output += "\n\n";
		}
		output += "Rechteckiges Array\n\n";
		output += "Deklariert mit:\nprivate int[][] b;\n\n";
		b = new int [3][3];
		output += "b[0][0] = " + b[0][0];
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\lektion2\\Aufgabe23.java";
		return classPath;
	}

}
