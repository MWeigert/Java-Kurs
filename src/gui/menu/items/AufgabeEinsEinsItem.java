/**
 * 
 */
package gui.menu.items;

import gui.menu.action.TeilEinsHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * 
 */
public class AufgabeEinsEinsItem {

	private MenuItem aufgabeEinsEins;

	public AufgabeEinsEinsItem(BorderPane pane) {
		aufgabeEinsEins = new MenuItem("Aufgabe 1");
		aufgabeEinsEins.setOnAction(new TeilEinsHandler(pane));
	}

	public MenuItem getAufgabe1(){
		return aufgabeEinsEins;
	}
	
}
