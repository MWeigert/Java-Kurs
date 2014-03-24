/**
 * 
 */
package gui.menu.action.lektion2;

import java.io.File;

import tools.io.LoadCode;
import afg.lektion2.Aufgabe23;
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
public class Afg0203Handler implements EventHandler<javafx.event.ActionEvent>{

	private BorderPane pane;

	public Afg0203Handler(BorderPane pane) {
		this.pane = pane;
	}

	
	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Schreiben Sie ein kleines Programm, in dem Sie einen "
				+ "zweidimensionalen Array definieren, erzeugen und initialisieren, "
				+ "initialisieren Sie den Array auf zwei verschiedene Arten.");
		pane.setLeft(txt);
		
		Aufgabe23 afg = new Aufgabe23();
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
		Text info = new Text("afg.lektion2.Aufgabe23");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
