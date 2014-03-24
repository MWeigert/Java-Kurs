/**
 * 
 */
package gui.menu.items;

import gui.main.JavaKurs;
import gui.menu.action.lektion4.Afg0401Handler;
import gui.menu.action.lektion4.Afg0402Handler;
import gui.menu.action.lektion4.Afg0403Handler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert
 * 
 */
public class TeilVier {

	private Menu menuVier;

	public TeilVier(JavaKurs jk) {
		menuVier = new Menu("Teil 4");

		MenuItem afg41Item = new MenuItem("Aufgabe 1");
		afg41Item.setOnAction(new Afg0401Handler(jk.getBorder()));

		MenuItem afg42Item = new MenuItem("Aufgabe 2");
		afg42Item.setOnAction(new Afg0402Handler(jk.getBorder()));

		MenuItem afg43Item = new MenuItem("Aufgabe 3");
		afg43Item.setOnAction(new Afg0403Handler(jk.getBorder()));

		menuVier.getItems().addAll(afg41Item, afg42Item, afg43Item);

	}

	public Menu getTeilVier() {
		return menuVier;
	}

}
