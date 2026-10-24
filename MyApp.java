import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MyApp extends Application {

    public void start(Stage stage) {

        FlowPane flow = new FlowPane();

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");

        flow.getChildren().addAll(b1, b2, b3, b4);

        Scene scene = new Scene(flow, 300, 200);

        stage.setScene(scene);
        stage.setTitle("FlowPane Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
