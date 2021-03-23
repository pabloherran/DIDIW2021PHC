package application;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;

public class ListController {

	@FXML
	private ChoiceBox cb = new ChoiceBox();
	
	
	private void intialize() {
		cb.setItems(FXCollections.observableArrayList("New Document", "Open ", new Separator(), "Save", "Save as"));
	}
	
}
