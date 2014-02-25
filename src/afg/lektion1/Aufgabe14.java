/**
 *  Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren Sie in
 *  der Klasse ein Datenfeld vom Typ StringBuilder und ein Datenfeld vom Typ String.
 *
 *  Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der Klassen
 *  StringBuilder und String.
 *
 *  Führen Sie in einem Loop Konkatenierungs-Operationen aus für StringBuilder und
 *  String und vergleichen Sie die Performance der beiden Klassen.
 */
package afg.lektion1;

/**
 * @author Mathias Weigert
 * 
 */
public class Aufgabe14 {

	private static String[] stringArray;
	private static StringBuffer stringBuffer;
	private static StringBuilder stringBuilder;

	private String output;

	/**
	 * 
	 */
	public Aufgabe14() {
		output = new String();
		Long start = System.currentTimeMillis();

		output = "100'000 B zu String addieren.\n";
		Long elapsedTime = modifyString();
		output = output + "Laufzeit String: " + elapsedTime + " ms.\n";

		output = output + "100'000 B in StringArray schreiben.\n";
		elapsedTime = modifyStringArray();
		output = output + "Laufzeit StringArray: " + elapsedTime + " ms.\n";

		output = output + "100'000 B append to  StringBuffer.\n";
		elapsedTime = modifyStringBuffer();
		output = output + "Laufzeit StringBuffer: " + elapsedTime + " ms.\n";

		output = output + "100'000 B append to  StringBuilder.\n";
		elapsedTime = modifyStringBuilder();
		output = output + "Laufzeit StringBuilder: " + elapsedTime + " ms.\n";

		Long stop = System.currentTimeMillis();
		elapsedTime = stop - start;
		output = output + "Laufzeit komplett: " + elapsedTime + " ms.";
	}

	public static Long modifyString() {
		@SuppressWarnings("unused")
		String string = new String();
		Long start = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			string += 'B';
		}
		Long stop = System.currentTimeMillis();
		Long elapsedTime = stop - start;
		return elapsedTime;
	}

	public static Long modifyStringArray() {
		stringArray = new String[100000];
		Long start = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			stringArray[i] = "B";
		}
		Long stop = System.currentTimeMillis();
		Long elapsedTime = stop - start;
		return elapsedTime;
	}

	public static Long modifyStringBuffer() {
		stringBuffer = new StringBuffer();
		Long start = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			stringBuffer.append('B');
		}
		Long stop = System.currentTimeMillis();
		Long elapsedTime = stop - start;
		return elapsedTime;
	}

	public static Long modifyStringBuilder() {
		stringBuilder = new StringBuilder();
		Long start = System.currentTimeMillis();

		for (int i = 1; i < 100000; i++) {
			stringBuilder.append('B');
		}
		Long stop = System.currentTimeMillis();
		Long elapsedTime = stop - start;
		return elapsedTime;
	}

	public String getOutPut() {
		return output;
	}

}
