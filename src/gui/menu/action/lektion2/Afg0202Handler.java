/**
 * 
 */
package gui.menu.action.lektion2;

import java.io.File;

import tools.io.LoadCode;
import afg.lektion2.Aufgabe22;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * @author Mathias Weigert
 *
 */
public class Afg0202Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0202Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm, in dem Sie eine "
				+ "Klasse Kunde mit einigen Datenfeldern definieren. "
				+ "Überschreiben Sie die equals()-Methode für die Klasse "
				+ "Kunde dahin, dass Objekte der Klasse Kunde auf Gleichheit "
				+ "der Datenfelder überprüft werden.");
		pane.setLeft(txt);
		
		Aufgabe22 afg = new Aufgabe22();
		TextArea txtOut = new TextArea();
		txtOut.setWrapText(true);
		txtOut.setText(afg.getOutput());
		pane.setCenter(txtOut);
		
		File file = new File(afg.getClassPath());
		LoadCode lc = new LoadCode(file);
		TextArea txtCode = new TextArea(lc.getCode());
		pane.setRight(txtCode);
		
		Text lbl = new Text("Class: ");
		lbl.setFill(Color.RED);
		Text info = new Text("afg.lektion2.Aufgabe22");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
