/**
 * 
 */
package gui.main;

import gui.menu.FileMenu;
import gui.menu.KursMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * 
 */
public class JavaKurs extends Application {

	private Stage primaryStage;
	private BorderPane border;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		primaryStage = new Stage();
		border = new BorderPane();

		MenuBar menu = new MenuBar();
		menu.getMenus().addAll(new FileMenu(this).getFileMenu(), new KursMenu(this).getKursMenu());

		border.setTop(menu);
		border.setLeft(new Text("Aufgabenbereich"));
		border.setCenter(new Text("Lösungsbereich"));
		border.setRight(new Text("Codebereich"));
		border.setBottom(new Text("Info Leiste"));

		Scene scene = new Scene(border);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Java Kurs - Semester 2014");
		primaryStage.show();
	}

	/**
	 * @return the border
	 */
	public BorderPane getBorder() {
		return border;
	}

	/**
	 * @param border
	 *            the border to set
	 */
	public void setBorder(BorderPane border) {
		this.border = border;
	}

	/**
	 * @return the primaryStage
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

}