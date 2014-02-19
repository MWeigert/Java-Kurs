/**
 * 
 */
package gui.menu.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @author Administrator
 * 
 */
public class ExitListener implements EventHandler<javafx.event.ActionEvent>{

	Stage stage;

	public ExitListener(Stage stage) {
		super();
		this.stage = stage;
	}

	@Override
	public void handle(ActionEvent arg0) {
		stage.close();
	}

}
