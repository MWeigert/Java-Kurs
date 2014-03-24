/**
 * 
 */
package gui.menu.action.lektion3;

import java.io.File;

import tools.io.LoadCode;
import afg.Aufgabe;
import afg.lektion3.Aufgabe32;
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
public class Afg0302Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0302Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm, in dem Sie drei Klassen mit "
				+ "beliebigen Datenfeldern implementieren, 2 der Klassen sollen in "
				+ "einem Package abgelegt werden(eine davon soll zusätzlich eine einfache "
				+ "innere Klasse haben), die andere Klasse in einem anderen Package, "
				+ "sie soll eine Vererbungsbeziehung zu einer der beiden anderen Klassen "
				+ "haben, testen Sie die Anwendung bezüglich unterschiedlicher Access "
				+ "Modifiers.");
		pane.setLeft(txt);
		
		Aufgabe afg = new Aufgabe32();
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
		Text info = new Text("afg.lektion3.Aufgabe32");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
