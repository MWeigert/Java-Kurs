/**
 * 
 */
package gui.menu.items.lektion2;

import gui.menu.action.lektion2.Afg0201Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0201Item {

	private MenuItem aufgabeZweiEins;

	public Afg0201Item(BorderPane pane) {
		aufgabeZweiEins = new MenuItem("Aufgabe 1");
		aufgabeZweiEins.setOnAction(new Afg0201Handler(pane));
	}

	public MenuItem getAufgabe1(){
		return aufgabeZweiEins;
	}
	
}
