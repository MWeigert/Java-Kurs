/**
 * 
 */
package tools.io;

/**
 * @author Mathias Weigert
 *
 */
public class ExtractPath {
	
	private String classPath;
	
	public ExtractPath (String origin) {
		int x = origin.indexOf("\\bin;");
		classPath = origin.substring(0, x);
	}

	public String getPath() {
		return classPath;
	}
	
}
