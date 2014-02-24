/**
 * 
 */
package gui.menu.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Administrator
 *
 */
public class AfgEinsZweiHandler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;
	
	public AfgEinsZweiHandler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse einige Datenfelder und eine main-Methode.\n\n"
				+ " Überprüfen Sie an den Datenfeldern die Namensregeln für Identifier.\n\n"
				+ " Überprüfen Sie die möglichen Modifier für die Klasse und für die "
				+ "Datenfelder. \n\nÜberprüfen Sie die Regeln, die für die main-Methode gelten.");
		
		pane.setLeft(txt);		
	}
	
	
}
