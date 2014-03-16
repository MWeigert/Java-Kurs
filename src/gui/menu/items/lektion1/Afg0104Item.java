/**
 * 
 */
package gui.menu.items.lektion1;

import gui.menu.action.lektion1.Afg0104Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0104Item {

	private MenuItem aufgabeEinsVier;

	public Afg0104Item(BorderPane pane) {
		aufgabeEinsVier = new MenuItem("Aufgabe 4");
		aufgabeEinsVier.setOnAction(new Afg0104Handler(pane));
	}

	public MenuItem getAufgabe4(){
		return aufgabeEinsVier;
	}
	
}
