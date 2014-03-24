/**
 * 
 */
package afg;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe {

	private String output;
	private String classPath;

	public Aufgabe() {
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\Aufgabe.java";
		return classPath;
	}

}
