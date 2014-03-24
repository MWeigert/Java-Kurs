/**
 * 
 */
package gui.menu;

import gui.main.JavaKurs;
import gui.menu.items.TeilDrei;
import gui.menu.items.TeilEins;
import gui.menu.items.TeilVier;
import gui.menu.items.TeilZwei;
import javafx.scene.control.Menu;

/**
 * @author MAthias Weigert
 * 
 */
public class KursMenu {

	private Menu kursMenu;

	public KursMenu(JavaKurs jk) {
		kursMenu = new Menu("Kurs");

		kursMenu.getItems().addAll(new TeilEins(jk).getEinsItem(),
				new TeilZwei(jk).getZweiItem(), new TeilDrei(jk).getTeilDrei(),
				new TeilVier(jk).getTeilVier());
	}

	public Menu getKursMenu() {
		return kursMenu;
	}

}
