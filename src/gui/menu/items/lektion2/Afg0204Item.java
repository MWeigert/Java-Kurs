/**
 * 
 */
package gui.menu.items.lektion2;

import gui.menu.action.lektion2.Afg0204Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0204Item {

	private MenuItem aufgabeZweiDrei;

	public Afg0204Item(BorderPane pane) {
		aufgabeZweiDrei = new MenuItem("Aufgabe 4");
		aufgabeZweiDrei.setOnAction(new Afg0204Handler(pane));
	}

	public MenuItem getAufgabe4(){
		return aufgabeZweiDrei;
	}
	
}
