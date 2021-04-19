package layoutCompleto;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Ejercicio2 extends Application{
	private BorderPane rootLayout;

	public void start(Stage primaryStage) {
		try {
			// Carga el diseño del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Ejercicio2.class.getResource("Ejercicio2.fxml"));
			rootLayout = (BorderPane) loader.load();
			rootLayout.getStylesheets().add("layoutCompleto/Ejercicio2.css");

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
