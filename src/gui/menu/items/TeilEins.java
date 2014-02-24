/**
 * 
 */
package gui.menu.items;

import gui.main.JavaKurs;
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
				new AfgEinsEinsItem(jk.getBorder()).getAufgabe1(),
				new AfgEinsZweiItem(jk.getBorder()).getAufgabe2(),
				new AfgEinsDreiItem(jk.getBorder()).getAufgabe3(),
				new AfgEinsVierItem(jk.getBorder()).getAufgabe4()
				);
	}

	public Menu getEinsItem() {
		return menuEins;
	}

}
