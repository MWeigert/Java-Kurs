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
		output += "MAX_VALUE: " + Byte.MAX_VALUE + "\n";
		output += "MIN_VALUE: " + Byte.MIN_VALUE + "\n";
		output += "SIZE: " + Byte.SIZE + "\n";
		output += "TYPE: " + Byte.TYPE + "\n\n";

		output += "Double:\n";
		output += "doubleValue(): " + doubleWrapper.doubleValue() + "\n";
		output += "hashCode(): " + doubleWrapper.hashCode() + "\n";
		output += "MAX_EXPONENT: " + Double.MAX_EXPONENT + "\n";
		output += "MAX_VALUE: " + Double.MAX_VALUE + "\n";
		output += "MIN_EXPONENT: " + Double.MIN_EXPONENT + "\n";
		output += "MIN_NORMAL: " + Double.MIN_NORMAL + "\n";
		output += "MIN_VALUE: " + Double.MIN_VALUE + "\n";
		output += "NaN: " + Double.NaN + "\n";
		output += "NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY
				+ "\n";
		output += "POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY
				+ "\n";
		output += "SIZE: " + Double.SIZE + "\n";
		output += "toHexString(): " + Double.toHexString(doubleWrapper) + "\n";
		output += "isInfinite(): " + doubleWrapper.isInfinite() + "\n";
		output += "TYPE: " + Double.TYPE + "\n\n";

		output += "Float:\n";
		output += "floatValue(): " + floatWrapper.floatValue() + "\n";
		output += "hashCode(): " + floatWrapper.hashCode() + "\n";
		output += "MAX_EXPONENT: " + Float.MAX_EXPONENT + "\n";
		output += "MAX_VALUE: " + Float.MAX_VALUE + "\n";
		output += "MIN_EXPONENT: " + Float.MIN_EXPONENT + "\n";
		output += "MIN_NORMAL: " + Float.MIN_NORMAL + "\n";
		output += "MIN_VALUE: " + Float.MIN_VALUE + "\n";
		output += "floatToBits: " + Float.floatToIntBits(floatWrapper) + "\n";
		output += "toHexString: " + Float.toHexString(floatWrapper) + "\n";
		output += "isNaN: " + Float.isNaN(floatWrapper) + "\n";
		output += "TYPE: " + Float.TYPE + "\n\n";
		
		output += "Long:\n";
		output += "hashCode(): " + longWrapper.hashCode() + "\n";
		output += "longValue(): " + longWrapper.longValue() + "\n";
		output += "MAX_VALUE: " + Long.MAX_VALUE + "\n";
		output += "MIN_VALUE: " + Long.MIN_VALUE + "\n";
		output += "SIZE: " + Long.SIZE + "\n";
		output += "bitCount(): " + Long.bitCount(longWrapper) + "\n";
		output += "highestOneBit(): " + Long.highestOneBit(longWrapper) + "\n";
		output += "lowestOneBit(): " + Long.lowestOneBit(longWrapper) + "\n";
		output += "numberOfLeadingZeros(): " + Long.numberOfLeadingZeros(longWrapper) + "\n";
		output += "numberOfTrailingZeros(): " + Long.numberOfTrailingZeros(longWrapper) + "\n";
		output += "reverse(): " + Long.reverse(longWrapper) + "\n";
		output += "signum(): " + Long.signum(longWrapper) + "\n";
		output += "TYPE: " + Long.TYPE + "\n\n";
		
		output += "Short:\n";
		output += "shortValue: " + shortWrapper.shortValue()+"\n";
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
