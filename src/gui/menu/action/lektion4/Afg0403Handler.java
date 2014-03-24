/**
 * 
 */
package gui.menu.action.lektion4;

import java.io.File;

import tools.io.LoadCode;
import afg.Aufgabe;
import afg.lektion4.Aufgabe43;
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
public class Afg0403Handler implements EventHandler<javafx.event.ActionEvent> {

	private BorderPane pane;

	public Afg0403Handler(BorderPane pane) {
		this.pane = pane;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextArea txt = new TextArea();
		txt.setWrapText(true);

		txt.setText("Implementieren Sie drei verschiedene Exceptions, die Vererbung"
				+ "sbeziehungen zueinander haben. Zeigen Sie in Ihrer Anwendung, "
				+ "dass eine �berschriebene Methode nur gerade die Exceptions werfen "
				+ "kann, die die Originalmethode wirft.");
		pane.setLeft(txt);

		Aufgabe afg = new Aufgabe43();
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
		Text info = new Text("afg.lektion4.Aufgabe43");
		HBox box = new HBox();
		box.getChildren().addAll(lbl, info);
		pane.setBottom(box);
	}

}
