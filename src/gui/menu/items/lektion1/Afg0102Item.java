/**
 * 
 */
package gui.menu.items.lektion1;

import gui.menu.action.lektion1.Afg0102Handler;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0102Item {

	private MenuItem afgEinsZwei;

	public Afg0102Item(BorderPane pane) {
		afgEinsZwei = new MenuItem("Aufgabe 2");
		afgEinsZwei.setOnAction(new Afg0102Handler(pane));
	}

	public MenuItem getAufgabe2(){
		return afgEinsZwei;
	}
	
}
