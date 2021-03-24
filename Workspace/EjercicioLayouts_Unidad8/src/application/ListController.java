package application;

import java.util.Observable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.HBox;

public class ListController {

	   @FXML
	    private ChoiceBox<?> location;

	    @FXML
	    private HBox gendre;

	    @FXML
	    private RadioButton gender;

	    @FXML
	    private ToggleGroup Gendre;

	    @FXML
	    private ListView<?> calificaciones;
	
	public static final ObservableList<String> nombres = FXCollections.observableArrayList();
	public static final ObservableList<String> principal = FXCollections.observableArrayList();
	
	private void intialize() {
		location.setValue("Select a value");
		location.getItems().addAll("New York", "Orlando", new Separator(), "London", "Manchester");
		
		nombres.addAll("Objects", "Classes", "Functions", "Variables", "Compiler", "Debugger", "Projects", "Beans", "Librarie");
	
		for(int i=0; i<10; i++) {
			principal.add("Indeterminate(Pick a choice)");
		}
	
		calificaciones.setEditable(true);
		calificaciones.setItems(principal);
		calificaciones.setCellFactory(ComboBoxListCell.forListView(nombres));
	}
	
}
