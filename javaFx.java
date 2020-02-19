
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class javaFx extends Application {
	public static void main (String[] args) {
		launch (args);
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Button btn = new Button("Click Me");
		Button btn_1=new Button ("Exit");
		btn_1.setOnAction(e ->{
			System.out.println("Heelo world!!");
			System.exit(0);
			
		});
		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
			System.out.println("Hello world!!");
			}
		});
		VBox root=new VBox();
		root.getChildren().addAll(btn,btn_1);
		Scene scene = new Scene(root,400,400);
		arg0.setScene(scene);
		arg0.show();
		
	}

}
