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

	public Aufgabe23() {
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
