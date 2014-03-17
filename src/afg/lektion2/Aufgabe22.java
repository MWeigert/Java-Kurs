/**
 * Schreiben Sie ein kleines Programm, in dem Sie eine Klasse Kunde mit 
 * einigen Datenfeldern definieren. �berschreiben Sie die equals()-Methode 
 * f�r die Klasse Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit 
 * der Datenfelder �berpr�ft werden.
 */
package afg.lektion2;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe22 {

	private String output;
	private String classPath;

	public Aufgabe22() {
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\lektion2\\Aufgabe22.java";
		return classPath;
	}

}
