/**
 * 
 */
package gui.menu.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 *
 */
public class AfgEinsDreiHandler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public AfgEinsDreiHandler(BorderPane pane) {
		this.pane = pane;
	}

	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, definieren "
				+ "Sie in der Klasse verschiedene Datenfelder vom Typ der numerischen Wrapper Klassen. "
				+ "\n\nÜberprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden der numerischen "
				+ "Wrapper Klassen.");
		pane.setLeft(txt);
	}
	
}
