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

	public TeilEins(JavaKurs jk){
		menuEins = new Menu("Teil 1");
		menuEins.getItems().add(new AufgabeEinsEinsItem(jk.getBorder()).getAufgabe1());
	}
	
	public Menu getEinsItem() {
		return menuEins;
	}

}
