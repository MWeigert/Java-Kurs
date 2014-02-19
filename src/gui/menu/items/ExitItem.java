/**
 * 
 */
package gui.menu.items;

import gui.menu.action.ExitListener;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * 
 */
public class ExitItem {

	private MenuItem exitItem;

	public ExitItem(Stage stage) {
		exitItem =new MenuItem("Exit");
		exitItem.setOnAction(new ExitListener(stage));
	}

	public MenuItem getExitItem() {
		return exitItem;
	}
}
