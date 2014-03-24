/**
 * 
 */
package gui.menu.items;

import gui.main.JavaKurs;
import gui.menu.action.lektion3.Afg0301Handler;
import gui.menu.action.lektion3.Afg0302Handler;
import gui.menu.action.lektion3.Afg0303Handler;
import gui.menu.action.lektion3.Afg0304Handler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert
 * 
 */
public class TeilDrei {

	private Menu menuDrei;

	public TeilDrei(JavaKurs jk) {
		menuDrei = new Menu("Teil 3");

		MenuItem afg31Item = new MenuItem("Aufgabe 1");
		afg31Item.setOnAction(new Afg0301Handler(jk.getBorder()));

		MenuItem afg32Item = new MenuItem("Aufgabe 2");
		afg32Item.setOnAction(new Afg0302Handler(jk.getBorder()));

		MenuItem afg33Item = new MenuItem("Aufgabe 3");
		afg33Item.setOnAction(new Afg0303Handler(jk.getBorder()));

		MenuItem afg34Item = new MenuItem("Aufgabe 4");
		afg34Item.setOnAction(new Afg0304Handler(jk.getBorder()));

		menuDrei.getItems().addAll(afg31Item, afg32Item, afg33Item, afg34Item);

	}

	public Menu getTeilDrei() {
		return menuDrei;
	}

}
