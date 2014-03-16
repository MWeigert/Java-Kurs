/**
 * 
 */
package gui.menu.action.lektion1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Administrator
 *
 */
public class Afg0102Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;
	
	public Afg0102Handler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse einen Konstruktor, Instanz- und "
				+ "Klassen-Variablen, einen Initialisierungsblock sowie einen statischen "
				+ "Initialisierungsblock. "
				+ "\n\nÜberprüfen Sie in Ihrer Anwendung die Reihenfolge der Initialisierungen.");
		
		pane.setLeft(txt);		
	}
	
	
}
