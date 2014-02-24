/**
 * 
 */
package gui.menu.items;

import gui.menu.action.AfgEinsDreiHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class AfgEinsDreiItem {

	private MenuItem aufgabeEinsDrei;

	public AfgEinsDreiItem(BorderPane pane) {
		aufgabeEinsDrei = new MenuItem("Aufgabe 3");
		aufgabeEinsDrei.setOnAction(new AfgEinsDreiHandler(pane));
	}

	public MenuItem getAufgabe3(){
		return aufgabeEinsDrei;
	}
	
}
