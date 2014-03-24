/**
 * 
 */
package gui.menu.items.lektion2;

import gui.menu.action.lektion2.Afg0203Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0203Item {

	private MenuItem aufgabeZweiDrei;

	public Afg0203Item(BorderPane pane) {
		aufgabeZweiDrei = new MenuItem("Aufgabe 3");
		aufgabeZweiDrei.setOnAction(new Afg0203Handler(pane));
	}

	public MenuItem getAufgabe3(){
		return aufgabeZweiDrei;
	}
	
}
