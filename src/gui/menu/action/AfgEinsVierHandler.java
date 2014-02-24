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
public class AfgEinsVierHandler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public AfgEinsVierHandler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse ein Datenfeld vom Typ StringBuilder "
				+ "und ein Datenfeld vom Typ String. \n\nÜberprüfen Sie in Ihrer Anwendung "
				+ "die Funktionsweise der Methoden der KlassenStringBuilder und String. "
				+ "Führen Sie in einem Loop Konkatenierungs-Operationen aus für "
				+ "StringBuilder und String und vergleichen Sie die Performance der beiden Klassen.");
		pane.setLeft(txt);
	}
	
}
