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
		output = "Wrapper Werte for der Initialisierung:\n\n";
		output += "Byte: " + byteWrapper + "\n";
		output += "Double: " + doubleWrapper + "\n";
		output += "Float: " + floatWrapper + "\n";
		output += "Integer: " + intWrapper + "\n";
		output += "Long: " + longWrapper + "\n";
		output += "Short: " + shortWrapper + "\n\n";

		output += "Die Werte werden bei der Initialisierung gesetzt.\n\n";

		byteWrapper = 23;
		doubleWrapper = 666.666;
		floatWrapper = 123.456f;
		intWrapper = 12345;
		longWrapper = 987654321l;
		shortWrapper = -12345;

		output += "Byte: " + byteWrapper + "\n";
		output += "Double: " + doubleWrapper + "\n";
		output += "Float: " + floatWrapper + "\n";
		output += "Integer: " + intWrapper + "\n";
		output += "Long: " + longWrapper + "\n";
		output += "Short: " + shortWrapper + "\n\n";

		output += "Byte:\n";
		output += "byteValue(): " + byteWrapper.byteValue() + "\n";
		output += "hashCode(): " + byteWrapper.hashCode() + "\n";
		output += "MAX_VALUE: " + byteWrapper.MAX_VALUE + "\n";
		output += "MIN_VALUE: " + byteWrapper.MIN_VALUE + "\n";
		output += "SIZE: " + byteWrapper.SIZE + "\n";
		output += "TYPE: " + byteWrapper.TYPE + "\n\n";

		output += "Double:\n";
		output += "doubleValue(): " + doubleWrapper.doubleValue() + "\n";
		output += "hashCode(): " + doubleWrapper.hashCode() + "\n";
		output += "MAX_EXPONENT: " + doubleWrapper.MAX_EXPONENT + "\n";
		output += "MAX_VALUE: " + doubleWrapper.MAX_VALUE + "\n";
		output += "MIN_EXPONENT: " + doubleWrapper.MIN_EXPONENT + "\n";
		output += "MIN_NORMAL: " + doubleWrapper.MIN_NORMAL + "\n";
		output += "MIN_VALUE: " + doubleWrapper.MIN_VALUE + "\n";
		output += "NaN: " + doubleWrapper.NaN + "\n";
		output += "NEGATIVE_INFINITY: " + doubleWrapper.NEGATIVE_INFINITY
				+ "\n";
		output += "POSITIVE_INFINITY: " + doubleWrapper.POSITIVE_INFINITY
				+ "\n";
		output += "SIZE: " + doubleWrapper.SIZE + "\n";
		output += "toHexString(): " + Double.toHexString(doubleWrapper) + "\n";
		output += "isInfinite(): " + doubleWrapper.isInfinite() + "\n";
		output += "TYPE: " + doubleWrapper.TYPE + "\n";
		output += "doubleValue(): " + doubleWrapper.doubleValue() + "\n\n";

		output += "Float:\n";
		output += "floatValue(): " + floatWrapper.floatValue() + "\n";
		output += "hashCode(): " + floatWrapper.hashCode() + "\n";
		output += "MAX_EXPONENT: " + floatWrapper.MAX_EXPONENT + "\n";
		output += "MAX_VALUE: " + floatWrapper.MAX_VALUE + "\n";
		output += "MIN_EXPONENT: " + floatWrapper.MIN_EXPONENT + "\n";
		output += "MIN_NORMAL: " + floatWrapper.MIN_NORMAL + "\n";
		output += "MIN_VALUE: " + floatWrapper.MIN_VALUE + "\n";
		output += "floatToBits: " + Float.floatToIntBits(floatWrapper) + "\n";
		output += "toHexString: " + Float.toHexString(floatWrapper) + "\n";
		output += "isNaN: " + Float.isNaN(floatWrapper) + "\n";
		output += "TYPE: " + floatWrapper.TYPE + "\n";
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
