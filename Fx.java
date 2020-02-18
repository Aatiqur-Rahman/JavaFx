
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Fx extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Button btn = new Button("Click me");
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root);
		arg0.setScene(scene);
		arg0.show();
		
	}

}
