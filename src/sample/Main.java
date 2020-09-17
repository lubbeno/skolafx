package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sampleBorder.fxml"));

      /*  GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        Label pozdrav = new Label("AHOJ");
        pozdrav.setTextFill(Color.GREEN);
        root.getChildren().add(pozdrav);
        */
        primaryStage.setTitle("Hello Moje prve okno");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}

