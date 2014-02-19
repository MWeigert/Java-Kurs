/**
 * 
 */
package gui.menu;

import gui.main.JavaKurs;
import gui.menu.items.ExitItem;
import javafx.scene.control.Menu;

/**
 * @author Mathias Weigert
 *
 */
public class FileMenu {

	private Menu fileMenu;
	
	public FileMenu(JavaKurs jk) {
		fileMenu = new Menu("File");
		
		ExitItem exitItem =new ExitItem(jk.getPrimaryStage());
		
		fileMenu.getItems().add(exitItem.getExitItem());
	}
	
	public Menu getFileMenu() {
		return fileMenu;
	}
}
