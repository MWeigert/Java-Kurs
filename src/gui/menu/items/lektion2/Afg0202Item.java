/**
 * 
 */
package gui.menu.items.lektion2;

import gui.menu.action.lektion2.Afg0202Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0202Item {

	private MenuItem aufgabeZweiZwei;

	public Afg0202Item(BorderPane pane) {
		aufgabeZweiZwei = new MenuItem("Aufgabe 2");
		aufgabeZweiZwei.setOnAction(new Afg0202Handler(pane));
	}

	public MenuItem getAufgabe2(){
		return aufgabeZweiZwei;
	}
	
}
