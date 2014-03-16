/**
 * 
 */
package gui.menu.action.lektion2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0201Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0201Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm, in dem Sie die Java "
				+ "Operatoren <<, >>, >>>, ^, & und  | auf ihre Funktionalität testen.");
		pane.setLeft(txt);
	}

}
