/**
 * Schreiben Sie ein kleines Programm, in dem Sie die Java Operatoren <<, >>, 
 * >>>, ^, & und  | auf ihre Funktionalität testen.
 */
package afg.lektion2;

import tools.io.ExtractPath;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe21 {

	private int zahl;

	private String output;
	private String classPath;

	public Aufgabe21() {
		output = "<< Linksschieben:\n";
		output += "(23) 0001 0111 << (2) gibt:\n";
		zahl = 23 << 2;
		output += zahl + " oder 0101 1100.\n\n";

		output += ">> Rechtsschieben (mit Vorzeichen):\n";
		output += "(92) 0101 1100 >> (1) gibt:\n";
		zahl = 92 >> 1;
		output += zahl + " oder 0010 1110.\n\n";

		output += ">>> Rechtsschieben (ohne Vorzeichen):\n";
		output += "23 >>> (3) gibt:\n";
		zahl = 23 >>> 3;
		output += zahl + "0000 0011.\n\n";

		output += "^ Bitweises exklusives ODER:\n";
		output += "(23) 0001 0111\n(44) 0010 1100\n===========\n";
		zahl = 23 ^ 44;
		output += "("+zahl+ ") 0011 1011\n\n";
		
		output += "& Bitweises UND:\n";
		output += "(23) 0001 0111\n(44) 0010 1100\n===========\n";
		zahl = 23 & 44;
		output += "("+zahl+ ") 0000 0100\n\n";
		
		output += "| Bitweises ODER:\n";
		output += "(23) 0001 0111\n(44) 0010 1100\n===========\n";
		zahl = 23 | 44;
		output += "("+zahl+ ") 0011 1111\n\n";
	}

	public String getOutput() {
		return output;
	}

	public String getClassPath() {
		String origin = System.getProperty("java.class.path");
		ExtractPath ep = new ExtractPath(origin);
		classPath = ep.getPath() + "\\src\\afg\\lektion2\\Aufgabe21.java";
		return classPath;
	}

}
