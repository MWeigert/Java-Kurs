/**
 * 
 */
package gui.menu;

import gui.main.JavaKurs;
import gui.menu.items.TeilEins;
import javafx.scene.control.Menu;

/**
 * @author MAthias Weigert
 *
 */
public class KursMenu {
	
	private Menu kursMenu;
	
	public KursMenu(JavaKurs jk) {
		kursMenu=new Menu("Kurs");
		
		kursMenu.getItems().add(new TeilEins(jk).getEinsItem());
	}
	
	public Menu getKursMenu() {
		return kursMenu;
	}

}
