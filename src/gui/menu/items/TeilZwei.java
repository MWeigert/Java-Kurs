/**
 * 
 */
package gui.menu.items;

import gui.main.JavaKurs;
import gui.menu.items.lektion2.Afg0201Item;
import gui.menu.items.lektion2.Afg0202Item;
import javafx.scene.control.Menu;

/**
 * @author Mathias Weigert
 * 
 */
public class TeilZwei {

	private Menu menuZwei;

	public TeilZwei(JavaKurs jk) {
		menuZwei = new Menu("Teil 2");
		menuZwei.getItems().addAll(
				new Afg0201Item(jk.getBorder()).getAufgabe1(),
				new Afg0202Item(jk.getBorder()).getAufgabe2());
	}

	public Menu getZweiItem() {
		return menuZwei;
	}

}