package flowpanecss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainFlowPaneCSS extends Application {
	private FlowPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFlowPaneCSS.class.getResource("FlowPaneCSSLayout.fxml"));
			rootLayout = (FlowPane) loader.load();
			rootLayout.getStylesheets().add("flowpanecss/Ejercicio1.css");

			// Mostramos la escena del FlowPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
