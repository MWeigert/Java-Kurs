/**
 * 
 */
package gui.menu.items;

import gui.menu.action.AfgEinsVierHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class AfgEinsVierItem {

	private MenuItem aufgabeEinsVier;

	public AfgEinsVierItem(BorderPane pane) {
		aufgabeEinsVier = new MenuItem("Aufgabe 4");
		aufgabeEinsVier.setOnAction(new AfgEinsVierHandler(pane));
	}

	public MenuItem getAufgabe4(){
		return aufgabeEinsVier;
	}
	
}
