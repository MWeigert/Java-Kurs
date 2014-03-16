/**
 * 
 */
package gui.menu.action.lektion1;

import java.io.File;

import tools.io.LoadCode;
import afg.lektion1.Aufgabe13;
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
public class Afg0103Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0103Handler(BorderPane pane) {
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
		
		Aufgabe13 afg = new Aufgabe13();
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
		Text info = new Text("afg.lektion1.Aufgabe13");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}
	
}
