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
public class AufgabeEinsZwei {

	private MenuItem afgEinsZwei;

	public AufgabeEinsZwei(BorderPane pane) {
		afgEinsZwei = new MenuItem("Aufgabe 2");
		afgEinsZwei.setOnAction(new AfgEinsZweiHandler(pane));
	}

	public MenuItem getAufgabe1(){
		return afgEinsZwei;
	}
	
}
