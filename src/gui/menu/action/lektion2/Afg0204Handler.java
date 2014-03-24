/**
 * 
 */
package gui.menu.action.lektion2;

import java.io.File;

import tools.io.LoadCode;
import afg.lektion2.Aufgabe24;
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
public class Afg0204Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0204Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse ein Datenfeld vom Typ ArrayList .\n\n"
				+ "Überprüfen Sie in Ihrer Anwendung die Funktionsweise der Methoden "
				+ "und die Features der Klasse ArrayList.\n\n"
				+ "Wenden Sie dir arraycopy()-Methode der Klasse System auf die "
				+ "ArrayList an.\n\n"
				+ "Wenden Sie die Algorithmen zur Manipulation von Listen (siehe Folien) "
				+ "der Klasse Collections auf die ArrayList an.");
		pane.setLeft(txt);
		
		Aufgabe24 afg = new Aufgabe24();
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
		Text info = new Text("afg.lektion2.Aufgabe24");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
