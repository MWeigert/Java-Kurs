/**
 * 
 */
package gui.menu.items;

import gui.menu.action.AfgEinsEinsHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * 
 */
public class AfgEinsEinsItem {

	private MenuItem aufgabeEinsEins;

	public AfgEinsEinsItem(BorderPane pane) {
		aufgabeEinsEins = new MenuItem("Aufgabe 1");
		aufgabeEinsEins.setOnAction(new AfgEinsEinsHandler(pane));
	}

	public MenuItem getAufgabe1(){
		return aufgabeEinsEins;
	}
	
}
