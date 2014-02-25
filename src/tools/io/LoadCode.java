/**
 * 
 */
package tools.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mathias Weigert
 * 
 */
public class LoadCode {

	private String code;

	public LoadCode(File file) {

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
//				System.out.println(line);
				sb.append(line);
				sb.append("\n");
//				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			code = sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getCode() {
		return code;
	}

}
