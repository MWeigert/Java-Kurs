/**
 * 
 */
package gui.menu.action.lektion3;

import java.io.File;

import tools.io.LoadCode;
import afg.Aufgabe;
import afg.lektion3.Aufgabe34;
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
public class Afg0304Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0304Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Implementieren Sie bitte eine Klasse Outer mit einer Methode m1(int y), "
				+ "in der Methode definieren Sie bitte zunächst eine weitere lokale "
				+ "Variable x und anschliessend eine lokale Klasse Inner, in der Sie auf die"
				+ " Variablen y und x zugreifen.\n\nTesten Sie Ihren Code in einer main-"
				+ "Methode.\n\nUntersuchen Sie zusätzlich noch die Funktionsweise von anonymen"
				+ " inneren Klassen und statischen inneren Klassen.");
		pane.setLeft(txt);
		
		Aufgabe afg = new Aufgabe34();
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
