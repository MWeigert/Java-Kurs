/**
 * 
 */
package gui.menu.items;

import gui.main.JavaKurs;
import gui.menu.items.lektion1.Afg0101Item;
import gui.menu.items.lektion1.Afg0102Item;
import gui.menu.items.lektion1.Afg0103Item;
import gui.menu.items.lektion1.Afg0104Item;
import javafx.scene.control.Menu;

/**
 * @author Mathias Weigert
 * 
 */
public class TeilEins {

	private Menu menuEins;

	public TeilEins(JavaKurs jk) {
		menuEins = new Menu("Teil 1");
		menuEins.getItems().addAll(
				new Afg0101Item(jk.getBorder()).getAufgabe1(),
				new Afg0102Item(jk.getBorder()).getAufgabe2(),
				new Afg0103Item(jk.getBorder()).getAufgabe3(),
				new Afg0104Item(jk.getBorder()).getAufgabe4()
				);
	}

	public Menu getEinsItem() {
		return menuEins;
	}

}
