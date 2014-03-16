/**
 * 
 */
package gui.menu.items.lektion1;

import gui.menu.action.AfgEinsEinsHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * 
 */
public class Afg0101Item {

	private MenuItem aufgabeEinsEins;

	public Afg0101Item(BorderPane pane) {
		aufgabeEinsEins = new MenuItem("Aufgabe 1");
		aufgabeEinsEins.setOnAction(new AfgEinsEinsHandler(pane));
	}

	public MenuItem getAufgabe1(){
		return aufgabeEinsEins;
	}
	
}
