/**
 * 
 */
package gui.menu.items.lektion1;

import gui.menu.action.AfgEinsDreiHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0103Item {

	private MenuItem aufgabeEinsDrei;

	public Afg0103Item(BorderPane pane) {
		aufgabeEinsDrei = new MenuItem("Aufgabe 3");
		aufgabeEinsDrei.setOnAction(new AfgEinsDreiHandler(pane));
	}

	public MenuItem getAufgabe3(){
		return aufgabeEinsDrei;
	}
	
}
