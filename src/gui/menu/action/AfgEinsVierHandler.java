/**
 * 
 */
package gui.menu.action;

import java.io.File;

import tools.io.LoadCode;
import afg.lektion1.Aufgabe14;
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
public class AfgEinsVierHandler implements
		EventHandler<javafx.event.ActionEvent> {

	private BorderPane pane;

	public AfgEinsVierHandler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txtAfg = new TextArea();
		txtAfg.setWrapText(true);

		txtAfg.setText("Schreiben Sie ein kleines Programm bestehend aus einer Klasse, "
				+ "definieren Sie in der Klasse ein Datenfeld vom Typ StringBuilder "
				+ "und ein Datenfeld vom Typ String. \n\nÜberprüfen Sie in Ihrer Anwendung "
				+ "die Funktionsweise der Methoden der KlassenStringBuilder und String. "
				+ "Führen Sie in einem Loop Konkatenierungs-Operationen aus für "
				+ "StringBuilder und String und vergleichen Sie die Performance der beiden Klassen.");
		pane.setLeft(txtAfg);

		Aufgabe14 afg = new Aufgabe14();

		TextArea txtOut = new TextArea();
		txtOut.setWrapText(true);
		txtOut.setText(afg.getOutPut());
		pane.setCenter(txtOut);

		Text tst = new Text("Class: ");
		tst.setFill(Color.RED);
		Text info = new Text("afg.lektion1.Aufgabe14");
		
		File file = new File(afg.getClassPath());
		LoadCode lc = new LoadCode(file);
		TextArea txtCode = new TextArea(lc.getCode());
		
		pane.setRight(txtCode);
		
		HBox box = new HBox();
		box.getChildren().addAll(tst, info);
		pane.setBottom(box);
	}

}
