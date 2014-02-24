/**
 * 
 */
package gui.menu.items;

import gui.menu.action.AfgEinsZweiHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class AfgEinsZweiItem {

	private MenuItem afgEinsZwei;

	public AfgEinsZweiItem(BorderPane pane) {
		afgEinsZwei = new MenuItem("Aufgabe 2");
		afgEinsZwei.setOnAction(new AfgEinsZweiHandler(pane));
	}

	public MenuItem getAufgabe2(){
		return afgEinsZwei;
	}
	
}
