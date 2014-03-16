/**
 * 
 */
package gui.menu.action.lektion1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * 
 */
public class Afg0101Handler implements EventHandler<javafx.event.ActionEvent> {

	private BorderPane pane;

	public Afg0101Handler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse einige Datenfelder und eine main-Methode. "
				+ "\n\nÜberprüfen Sie an den Datenfeldern die Namensregeln für Identifier. "
				+ "\n\nÜberprüfen Sie die möglichen Modifier für die Klasse und für die Datenfelder. "
				+ "\n\nÜberprüfen Sie die Regeln, die für die main-Methode gelten.");
		pane.setLeft(txt);
	}
}
