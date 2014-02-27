/**
 *  Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren
 *  Sie in der Klasse verschiedene Datenfelder vom Typ der numerischen Wrapper Klassen.
 *
 *  Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der numerischen
 *  Wrapper Klassen.
 */
package afg.lektion1;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe13 {

	private Byte byteWrapper;
	private Double doubleWrapper;
	private Float floatWrapper;
	private Integer intWrapper;
	private Long longWrapper;
	private Short shortWrapper;

	private String output;
	private String classPath;

	public Aufgabe13() {
		output = "Wrapper Werte for der Initialisierung\n\n";
		output += "Byte: " + byteWrapper + "\n";
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\lektion1\\Aufgabe13.java";
		return classPath;
	}

}
