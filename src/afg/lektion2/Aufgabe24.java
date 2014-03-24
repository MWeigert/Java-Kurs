/**
 * Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in der 
 * Klasse ein Datenfeld vom Typ ArrayList .
 * 
 * Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden und die Features
 * der Klasse ArrayList.
 * 
 * Wenden Sie dir arraycopy()-Methode der Klasse System auf die ArrayList an.
 * 
 * Wenden Sie die Algorithmen zur Manipulation von Listen (siehe Folien) der Klasse
 * Collections auf die ArrayList an.
 */
package afg.lektion2;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe24 {

	private String output;
	private String classPath;

	public Aufgabe24() {
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\lektion2\\Aufgabe24.java";
		return classPath;
	}

}
