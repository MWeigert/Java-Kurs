/**
 * 
 */
package gui.menu.action.lektion4;

import java.io.File;

import tools.io.LoadCode;
import afg.Aufgabe;
import afg.lektion4.Aufgabe42;
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
public class Afg0402Handler implements EventHandler<javafx.event.ActionEvent> {

	private BorderPane pane;

	public Afg0402Handler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm, in dem Sie eine Klasse B "
				+ "implementieren, diese Klasse soll von einer abstrakten Klasse A "
				+ "abgeleitet sein die wiederum ein Interface mit zwei Methodende"
				+ "klarationen sowie zwei Konstanten implementiert, das Interface "
				+ "wiederum soll zwei weitere Interfaces ableiten, jedes dieser "
				+ "Interfaces definiert eine Methodendeklaration. Instanzieren Sie "
				+ "ein Objekt der Klasse B, greifen Sie auf die Konstanten zu und "
				+ "rufen Sie die Methoden auf.");
		pane.setLeft(txt);

		Aufgabe afg = new Aufgabe42();
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
		Text info = new Text("afg.lektion4.Aufgabe42");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
