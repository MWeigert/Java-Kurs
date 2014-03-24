/**
 * 
 */
package gui.menu.action.lektion3;

import java.io.File;

import tools.io.LoadCode;
import afg.Aufgabe;
import afg.lektion3.Aufgabe33;
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
public class Afg0303Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0303Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Implementieren Sie eine Klasse Outer mit einem Datenfeld "
				+ "x und einer Methode m1().\n\nImplementieren Sie nun in der "
				+ "Methode m1() eine lokale Klasse Inner, die auf das Datenfeld "
				+ "x der Klasse Outer zugreift und ihren Wert am Bildschirm "
				+ "ausgibt.\n\nImplementieren Sie schliesslich noch eine main-"
				+ "Methode, wo Sie die Methode m1() aufrufen.\n\nVersuchen Sie "
				+ "in einem 2. Schritt, der lokalen Klasse einen Zugriffsmodif"
				+ "ikator zuzuweisen, was passiert und warum?");
		pane.setLeft(txt);
		
		Aufgabe afg = new Aufgabe33();
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
		Text info = new Text("afg.lektion3.Aufgabe33");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
